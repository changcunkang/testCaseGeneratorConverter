package test.java;

import com.cams.blaze.request.Application;
import com.cams.blaze.request.Customer;
import com.cams.blaze.request.Product;
import com.fico.testCaseGenerator.XSTream.XSTreamHelper;
import com.fico.testCaseGenerator.repository.ApplicationDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestMainThread {

    public static void main(String[] args) throws Exception{

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext-batch.xml");
        ApplicationDao appDao = (ApplicationDao) context.getBean(ApplicationDao.class);

        Application app = appDao.findById( 20526L );

        XSTreamHelper xsTreamHelper = new XSTreamHelper();

        Application queriedApp = (Application) xsTreamHelper.fromXMLToObject(app.getResponseStr());

        System.out.println(app.getResponseStr());

//        for(int i=0; i<threadNum; i++){
//             threadArr[i].start();
//        }
    }
}
