package com.cams.blaze.service;


import com.cams.blaze.request.Application;
import com.fico.testCaseGenerator.XSTream.XSTreamHelper;
import com.fico.testCaseGenerator.repository.ApplicationDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/26/2018
 */
public class TestDataQueryService {

    private ApplicationContext appContext = null;
    private  ApplicationDao appDao = null;

    private static XSTreamHelper xsTreamHelper = null;

    public TestDataQueryService(){
        this. appContext = new ClassPathXmlApplicationContext(
                "applicationContext-batch.xml");
        this.appDao = (ApplicationDao) appContext.getBean(ApplicationDao.class);

        if(xsTreamHelper == null){
            xsTreamHelper = new XSTreamHelper();
        }
    }

    public Application findApplicationByID(long appcationID){
        String appStr = this.findApplicationXMLStringByID( appcationID );

        if(appStr != null){
            return (Application) xsTreamHelper.fromXMLToObject( appStr ) ;
        }

        return null;
    }

    public String findApplicationXMLStringByID(long appcationID){
        Application application = this.appDao.findById(appcationID);
        return application.getResponseStr();
    }


}
