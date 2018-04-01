import com.cams.blaze.request.Application;
import com.cams.blaze.service.TestDataQueryService;
import com.fico.testCaseGenerator.XSTream.XSTreamHelper;
import com.fico.testCaseGenerator.converter.ConversionFunction;
import com.fico.testCaseGenerator.converter.TestDataConvertProcessor;
import com.fico.testCaseGenerator.repository.ApplicationDao;
import com.fico.testCaseGenerator.repository.BlazApCuCustrDao;
import conversionRequest.BlazApCuCustr;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMainThread1 {

    public static void main(String[] args) throws Exception{
        TestDataQueryService testDataQueryService = new TestDataQueryService();

        Application application = testDataQueryService.findApplicationByID(55091);

        String applicationXMLStr = testDataQueryService.findApplicationXMLStringByID(55091);

        TestDataConvertProcessor testDataConvertProcessor = new TestDataConvertProcessor();

        List obj = testDataConvertProcessor.process( application );
        BlazApCuCustr blazApCuCustr=(BlazApCuCustr)obj.get(0);
        ConversionFunction conversionFunction=new ConversionFunction();

        blazApCuCustr= conversionFunction.getPbocImportantTip(application,blazApCuCustr);
        blazApCuCustr=conversionFunction.getPbocCreditScore(application,blazApCuCustr);
        blazApCuCustr=conversionFunction.getPCustRef(application,blazApCuCustr);
        blazApCuCustr=conversionFunction.getTXScore(application,blazApCuCustr);
        blazApCuCustr=conversionFunction.getPnote(application,blazApCuCustr);
        blazApCuCustr=conversionFunction.getFellbackSum(application,blazApCuCustr);
        blazApCuCustr=conversionFunction.getOverdueSum(application,blazApCuCustr);



        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext-batch.xml");
   //     ApplicationDao appDao = (ApplicationDao) context.getBean(ApplicationDao.class);
        BlazApCuCustrDao blazDao = (BlazApCuCustrDao)context.getBean(BlazApCuCustrDao.class);

        blazDao.save(blazApCuCustr);
        System.out.println("");
    }


}
