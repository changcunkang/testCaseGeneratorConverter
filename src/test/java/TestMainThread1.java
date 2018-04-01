import com.cams.blaze.request.Application;
import com.cams.blaze.service.TestDataQueryService;
import com.fico.testCaseGenerator.XSTream.XSTreamHelper;
import com.fico.testCaseGenerator.converter.TestDataConvertProcessor;
import com.fico.testCaseGenerator.repository.ApplicationDao;
import com.fico.testCaseGenerator.repository.BlazApCuCustrDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMainThread1 {

    public static void main(String[] args) throws Exception{
        TestDataQueryService testDataQueryService = new TestDataQueryService();

        Application application = testDataQueryService.findApplicationByID(16);

        String applicationXMLStr = testDataQueryService.findApplicationXMLStringByID(16);

        TestDataConvertProcessor testDataConvertProcessor = new TestDataConvertProcessor();

        List obj = testDataConvertProcessor.process( application );

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext-batch.xml");
   //     ApplicationDao appDao = (ApplicationDao) context.getBean(ApplicationDao.class);
        BlazApCuCustrDao blazDao = (BlazApCuCustrDao)context.getBean(BlazApCuCustrDao.class);
        blazDao.save(obj);
        System.out.println("");
    }
}
