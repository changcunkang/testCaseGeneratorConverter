import com.cams.blaze.request.Application;
import com.cams.blaze.service.TestDataQueryService;
import com.fico.testCaseGenerator.XSTream.XSTreamHelper;
import com.fico.testCaseGenerator.converter.TestDataConvertProcessor;
import com.fico.testCaseGenerator.repository.ApplicationDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestMainThread1 {

    public static void main(String[] args) throws Exception{
        TestDataQueryService testDataQueryService = new TestDataQueryService();

        Application application = testDataQueryService.findApplicationByID(4670);

        String applicationXMLStr = testDataQueryService.findApplicationXMLStringByID(4670);

        TestDataConvertProcessor testDataConvertProcessor = new TestDataConvertProcessor();

        List obj = testDataConvertProcessor.process( application );

        System.out.println("");
    }
}
