import com.cams.blaze.request.Application;
import com.cams.blaze.service.TestDataQueryService;
import com.fico.testCaseGenerator.converter.TestDataConvertProcessor;
import com.fico.testCaseGenerator.converter.TestDataConvertProcessorForNullVal;

import java.util.List;

public class TestMainThread2 {

    public static void main(String[] args) throws Exception{
        TestDataQueryService testDataQueryService = new TestDataQueryService();

        Application application = testDataQueryService.findApplicationByID(4670);

        TestDataConvertProcessorForNullVal testDataConvertProcessor = new TestDataConvertProcessorForNullVal();

        Long l1 =  System.currentTimeMillis();

        Object obj = testDataConvertProcessor.addApplicationNullValue( application );

        Long l2 =  System.currentTimeMillis();

        obj = testDataConvertProcessor.removeApplicationNullValue( application );

        Long l3 =  System.currentTimeMillis();

        System.out.println( "Append null val : " + (l2 -l1) );

        System.out.println( "Delete null val : " + (l3 -l2) );

    }
}
