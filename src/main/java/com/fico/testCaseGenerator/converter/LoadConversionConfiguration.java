package com.fico.testCaseGenerator.converter;

/**
 * @Author XiangbinYuan stevenYuan
 * @CreationDate 3/29/2018
 */

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoadConversionConfiguration {

    private String projectName;

    public LoadConversionConfiguration(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @SuppressWarnings("deprecation")
    public static List<LoadConversion> readExcelData(String fileName) {
        List<LoadConversion> loadConversionList = new ArrayList<LoadConversion>();
        int sourceClaseeRowNumber = 0;
        int sourcePropertyRowNumber = 0;
        int aimClassNameRowNumber = 0;
        int aimPropertyRowNumber = 0;

        int nullPercentageRowNumber = 0;
        int minValueRowNumber = 0;
        int firstCodomainRowNumber = 0;

        try {
            // Create the input stream from the xlsx/xls file
            FileInputStream fis = new FileInputStream(fileName);
            // Create Workbook instance for xlsx/xls file input stream
            Workbook workbook = null;
            if (fileName.toLowerCase().endsWith("xlsx")) {
                workbook = new XSSFWorkbook(fis);
            } else if (fileName.toLowerCase().endsWith("xls")) {
                workbook = new HSSFWorkbook(fis);
            }
            // Get the number of sheets in the xlsx file
            int numberOfSheets = workbook.getNumberOfSheets();
            // loop through each of the sheets
            for (int i = 0; i < numberOfSheets; i++) {
                String sheetName = workbook.getSheetName(i);
                if (sheetName.equalsIgnoreCase("Data")) {
                    // Get the nth sheet from the workbookt
                    Sheet sheet = workbook.getSheetAt(i);


                    for (int r = 0; r <= 1; r++) {
                        HSSFRow row = (HSSFRow) sheet.getRow(r);
                        for (int c = 0; c < row.getLastCellNum(); c++) {
                            Cell cell = row.getCell(c);
                            if (cell.toString().trim().equalsIgnoreCase("源类名")) {
                                sourceClaseeRowNumber = c;
                            } else if (cell.toString().trim().equalsIgnoreCase("源字段名")) {
                                sourcePropertyRowNumber = c;
                            } else if (cell.toString().trim().equalsIgnoreCase("目标类名")) {
                                aimClassNameRowNumber = c;
                            } else if (cell.toString().trim().equalsIgnoreCase("目标字段名")) {
                                aimPropertyRowNumber = c;
                                break;
                            }
                        }
                    }


                    for (int r = 1; r <= sheet.getLastRowNum(); r++) {
                        HSSFRow row = (HSSFRow) sheet.getRow(r);
                        LoadConversion loadConversion = new LoadConversion();
                        for (int c = 0; c < row.getLastCellNum(); c++) {
                            Cell cell = row.getCell(c);

                            if (c == sourceClaseeRowNumber) {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                                    loadConversion.setSourceClassName(cell.getStringCellValue());
                                }

                            }
                            if (c == sourcePropertyRowNumber) {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                                    loadConversion.setSourceProperty(cell.getStringCellValue());
                                }
                            }
                            if (c == aimClassNameRowNumber) {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                                    loadConversion.setAimClassName(cell.getStringCellValue());
                                }

                            }
                            if (c == aimPropertyRowNumber) {
                                if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                                    loadConversion.setAimProperty(cell.getStringCellValue());
                                }

                            }
                        }
                        if (loadConversion != null) {
                            loadConversionList.add(loadConversion);
                        }

                    } // end of sheets for loop

                    fis.close();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return loadConversionList;
    }

    public static void main(String args[]) {
        //广州银行

        List<LoadConversion> list = readExcelData("C:\\Users\\changcunkang\\Desktop\\conversion\\conversion.xls");
        System.out.println("111111111111");
    }

//    public Map<String,Extendtion>   loadConfiguration(){
//        String filePath ="BOM/"+projectName+"/"+projectName+".xlsx";
//
//        List<Extendtion> list = readExcelData(filePath);
//        Map<String,Extendtion> map = new HashMap<String, Extendtion>();
//        for(int i=0;i<list.size();i++){
//            map.put(list.get(i).getRealPath(), list.get(i));
//        }
//        return map;
//    }

    public static Map<Integer, String> getRealPath(Sheet sheet, int strucCellNumber) {
        String realPath = "";
        int lastRowNumber = sheet.getLastRowNum();
        Map<Integer, String> map = new HashMap<Integer, String>();

        for (int r = 2; r <= lastRowNumber; r++) {
            int startRowNumber = 2;
            realPath = "";
            HSSFRow row = (HSSFRow) sheet.getRow(r);
            String element = null;
            String cellstr = null;
            for (int c = 0; c < strucCellNumber; c++) {
                element = "";
                Cell cell = row.getCell(c);
                if (cell != null) {
                    cellstr = cell.toString();
                }
                if (cell == null || cellstr.endsWith("")) {
                    if (c > 0) {
                        for (int cr = r; cr >= 2; cr--) {
                            HSSFRow row2 = (HSSFRow) sheet.getRow(cr);
                            Cell cell2 = row2.getCell(c - 1);
                            Cell cell3 = null;
                            Cell cell4 = null;
                            Cell cell5 = null;
                            if (c >= 3) {
                                cell3 = row2.getCell(c - 2);
                            }
                            if (c >= 4) {
                                cell4 = row2.getCell(c - 3);
                            }
                            if (c >= 5) {
                                cell5 = row2.getCell(c - 4);
                            }
                            if (cell2 != null && cell2.getCellType() == Cell.CELL_TYPE_STRING) {
                                startRowNumber = cr;
                                break;
                            }
                            if (cell3 != null && cell3.getCellType() == Cell.CELL_TYPE_STRING) {
                                startRowNumber = cr;
                                break;
                            }
                            if (cell4 != null && cell4.getCellType() == Cell.CELL_TYPE_STRING) {
                                startRowNumber = cr;
                                break;
                            }
                            if (cell5 != null && cell5.getCellType() == Cell.CELL_TYPE_STRING) {
                                startRowNumber = cr;
                                break;
                            }
                        }
                    }
                    for (int cr = startRowNumber; cr <= r; cr++) {
                        HSSFRow row2 = (HSSFRow) sheet.getRow(cr);
                        Cell cell2 = row2.getCell(c);
                        if (cell2 != null && cell2.getCellType() == Cell.CELL_TYPE_STRING) {
                            element = cell2.getStringCellValue().trim() + "/";
                        }
                    }
                } else if (cell != null && cell.getCellType() == Cell.CELL_TYPE_STRING) {
                    element = cell.getStringCellValue().trim() + "/";
                }
                realPath = realPath + element;
            }

            map.put(r, realPath);
        }


        return map;


    }
}