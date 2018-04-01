package com.fico.testCaseGenerator.converter;

import com.cams.blaze.request.Application;
import conversionRequest.BlazApCuCustr;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ConversionFunction {

    SimpleDateFormat timeClodeDay=new SimpleDateFormat("yyyyMMdd");
    SimpleDateFormat time=new SimpleDateFormat("yyyyMM");
    public  BlazApCuCustr getPbocImportantTip(Application application, BlazApCuCustr blazApCuCustr){

        int length=application.getCustomer().getPbocImportantTip().size();
        String ReturnString="";
        int nowNumber;

        if(length>0) {
            for (int i = 0; i < length; i++){
                ReturnString=ReturnString+time.format(application.getCustomer().getPbocImportantTip().get(i).getTipDate())
                        +"|"
                        +application.getCustomer().getPbocImportantTip().get(i).getTipText();
                nowNumber = i+1;
                if(nowNumber != length){
                    ReturnString=ReturnString+"|";
                }
            }
        }

        blazApCuCustr.setIMPT_MSG_TIPS_12MTH(ReturnString);
        return blazApCuCustr;

    }
    public  BlazApCuCustr getPbocCreditScore(Application application, BlazApCuCustr blazApCuCustr){

        int length=application.getCustomer().getPbocCreditScore().size();
        String ReturnString="";
        int nowNumber;
        if(length>0) {
            for (int i = 0; i < length; i++){
                ReturnString=ReturnString+time.format(application.getCustomer().getPbocCreditScore().get(i).getScoreDate())
                        +"|"
                        +application.getCustomer().getPbocCreditScore().get(i).getCreditScore();
                nowNumber = i+1;
                if(nowNumber != length){
                    ReturnString=ReturnString+"|";
                }
            }
        }

        blazApCuCustr.setCREDIT_1000_12MTH(ReturnString);
        return blazApCuCustr;

    }
    public  BlazApCuCustr getTXScore(Application application, BlazApCuCustr blazApCuCustr){

        int length=application.getCustomer().getTXScore().size();
        String ReturnString="";
        int nowNumber;
        if(length>0) {
            for (int i = 0; i < length; i++){
                ReturnString=ReturnString+time.format(application.getCustomer().getTXScore().get(i).getScoreDate())
                                  +"|"
                                  +application.getCustomer().getTXScore().get(i).getScore();
                nowNumber = i+1;
                if(nowNumber != length){
                    ReturnString=ReturnString+"|";
                }
            }
        }

        blazApCuCustr.setTENGXUN_SCORE_12MTH(ReturnString);
        return blazApCuCustr;

    }
    public  BlazApCuCustr getPCustRef(Application application, BlazApCuCustr blazApCuCustr){
        String ReturnString = "";
        int length=application.getCustomer().getpCustRef().size();
        if (length>0) {
            Date maxDate = application.getCustomer().getpCustRef().get(0).getpDate();
            Date pCustRefDate;

            for (int i = 0; i < length; i++) {
                pCustRefDate = application.getCustomer().getpCustRef().get(i).getpDate();
                if (pCustRefDate.getTime() >= maxDate.getTime()) {
                    maxDate = pCustRefDate;
                }
            }
            for (int i = 0; i < length; i++) {
                pCustRefDate = application.getCustomer().getpCustRef().get(i).getpDate();
                if (pCustRefDate.getTime() == maxDate.getTime()) {
                    ReturnString=timeClodeDay.format(pCustRefDate)+"|"+application.getCustomer().getpCustRef().get(i).getCustRef();
                }
            }


        }
        blazApCuCustr.setCUSTR_REF(ReturnString);
        return blazApCuCustr;

    }
    public  BlazApCuCustr getPnote(Application application, BlazApCuCustr blazApCuCustr){

        int length=application.getCustomer().getPnote().size();
        String ReturnString="";
        int nowNumber;
        if(length>0) {
            for (int i = 0; i < length; i++){
                ReturnString=ReturnString+time.format(application.getCustomer().getPnote().get(i).getpDate())
                        +"|"
                        +application.getCustomer().getPnote().get(i).getpText();
                nowNumber = i+1;
                if(nowNumber != length){
                    ReturnString=ReturnString+"|";
                }
            }
        }

        blazApCuCustr.setPNOTE_12MTH(ReturnString);
        return blazApCuCustr;
    }

    /**
     *
     *
     * @param application
     * @param blazApCuCustr
     * @return
     */
    public BlazApCuCustr getFellbackSum(Application application, BlazApCuCustr blazApCuCustr){
        if(application.getCustomer().getPbocReport().get(0) !=null) {
            if (application.getCustomer().getPbocReport().get(0).getFellbackSum() != null) {
                int length = application.getCustomer().getPbocReport().get(0).getFellbackSum().size();
                String cd;
                int count;
                double balance;

                if (length > 0) {
                    for (int i = 0; i < length; i++) {
                        cd = application.getCustomer().getPbocReport().get(0).getFellbackSum().get(0).getFellbackCD();
                        count = application.getCustomer().getPbocReport().get(0).getFellbackSum().get(0).getCount();
                        balance = application.getCustomer().getPbocReport().get(0).getFellbackSum().get(0).getBalance();
                        if (cd.contains("呆账")) {
                            blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setBAD_DEBTS_NUM(count);
                            blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setBAD_DEBTS_REMAIN(balance);
                        } else if (cd.contains("资产处置")) {
                            blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setASSETS_NUM(count);
                            blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setASSETS_REMAIN(balance);
                        } else if (cd.contains("保证人代偿")) {
                            blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setSPONSORIAL_NUM(count);
                            blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setSPONSORIAL_REMAIN(balance);
                        }

                    }
                }
                return blazApCuCustr;
            }
        }
        return blazApCuCustr;
    }

    public BlazApCuCustr getOverdueSum(Application application, BlazApCuCustr blazApCuCustr){
        if(application.getCustomer().getPbocReport().get(0)!=null) {
            if (application.getCustomer().getPbocReport().get(0).getFellbackSum() != null) {
            int length = application.getCustomer().getPbocReport().get(0).getFellbackSum().size();
            String cd;
            int count;
            int month;
            Double highestOverdueAmountPerMon;
            int maxDuration;
            double balance;

            if (length > 0) {
                for (int i = 0; i < length; i++) {
                    cd = application.getCustomer().getPbocReport().get(0).getOverdueSum().get(i).getOverdueCD();
                    count = application.getCustomer().getPbocReport().get(0).getOverdueSum().get(i).getCount();
                    month = application.getCustomer().getPbocReport().get(0).getOverdueSum().get(i).getMonths();
                    highestOverdueAmountPerMon = application.getCustomer().getPbocReport().get(0).getOverdueSum().get(i).getHighestOverdueAmountPerMon();
                    maxDuration = application.getCustomer().getPbocReport().get(0).getOverdueSum().get(i).getMaxDuration();
                    if (cd.contains("贷款逾期")) {
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setLOAD_OVERDUE_NUM(count);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setLOAD_OVERDUE_MONTHS(month);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setLOAD_OVERDUE_MAX_SUM(highestOverdueAmountPerMon);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setLOAD_OVERDUE_MAX_MONTH(maxDuration);
                    } else if (cd.contains("贷记卡逾期")) {
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setCREDIT_OVERDUE_ACCOUNTS(count);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setCREDIT_OVERDUE_MONTHS(month);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setCREDIT_OVERDUE_MAX_SUM(highestOverdueAmountPerMon);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setCREDIT_OVERDUE_MAX_MONTH(maxDuration);
                    } else if (cd.contains("准贷记卡")) {
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setNEARCREDIT_60D_ACCOUNTS(count);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setNEARCREDIT_60D_MONTHS(month);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setNEARCREDIT_60D_MAX_SUM(highestOverdueAmountPerMon);
                        blazApCuCustr.getBlazApCuPbocBasicInfo().get(0).setNEARCREDIT_60D_MAX_MONTH(maxDuration);
                    }

                }
            }
            return blazApCuCustr;
        }
        }
            return  blazApCuCustr;
    }
}
