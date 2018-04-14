package com.bie.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StringTest {

    public static String TESTDATA_SHEET_PATH = "C:\\Dev\\Eclipse\\BddBieAutomation\\src\\main\\java\\com\\bie\\qa\\testdata\\TestData.xlsx";

    static Workbook book;
    static Sheet sheet;
    
    //static Object[][] data = new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()+1]; //Because Row and Column cannot be reached now

    public static void getTestData(String sheetName) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {

        FileInputStream file = null;
        Random r = new Random();
        int Low = 4;
        int High = 6;
        int Result = r.nextInt(High - Low) + Low;
        
        String myState1, myUser, myPassword, myBusinessName, myAddress, myCity, myState2;
        int myZipCode;

        try {
            file = new FileInputStream(TESTDATA_SHEET_PATH);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            book = WorkbookFactory.create(file); //There is no zero-arg method for WorkbookFactory.create()
        } catch (IOException e) {
            e.printStackTrace();
        }

        sheet = book.getSheet(sheetName);

        Object[][] data = new Object[sheet.getLastRowNum() + 1][sheet.getRow(0).getLastCellNum() + 1];
        Object[][] myData = new Object[1][8];

        for (int rowIndex = 0; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
            Row row = sheet.getRow(rowIndex);
            if (row != null) {
                Cell cell = row.getCell(0);
                if (cell.toString().equals("CA")) {
                    int myRowNumber = cell.getRowIndex();
                    //for (int i = myRowNumber; i < myRowNumber + 5; i++) {
                    for (int k = 0; k < sheet.getRow(myRowNumber).getLastCellNum(); k++) {
                        data[rowIndex][k] = sheet.getRow(rowIndex).getCell(k).toString();
                        myData[0][k] = data[rowIndex][k];
                        System.out.println("Row: " + 0 + " " + "Column: " + k + " " + myData[0][k]);
                        if(k<8) {
                        	switch(k) {
                        		case 0:
                        			myState1 = myData[0][0].toString();
                        			System.out.println(myState1);
                        			
                        			break;
                        		
                        		case 1:
                        			myUser = myData[0][1].toString();
                        			System.out.println(myUser);
                        			break;
                        			
                        		case 2:
                        			myPassword = myData[0][2].toString();
                        			System.out.println(myPassword);
                        			break;
                        			
                        		case 3:
                        			myBusinessName = myData[0][3].toString();
                        			System.out.println(myBusinessName);
                        			break;
                        			
                        		case 4:
                        			myAddress = myData[0][4].toString();
                        			System.out.println(myAddress);
                        			break;
                        			
                        		case 5:
                        			myCity = myData[0][5].toString();
                        			System.out.println(myCity);
                        			break;
                        			
                        		case 6:
                        			myState2 = myData[0][6].toString();
                        			System.out.println(myState2);
                        			break;
                        			
                        		default:
                        			myZipCode = (Integer) myData[0][7];
                        			System.out.println(myZipCode);                        			
                        	}
                        	
                        }
                        else
                        System.out.println(myData[0][1]);
                    }

                    /*String myState1 = myData[0][0].toString();
                    String myUser = myData[0][1].toString();
                    String myPassword = myData[0][2].toString();
                    String myBusinessName = myData[0][3].toString();
                    String myAddress = myData[0][4].toString();
                    String myCity = myData[0][5].toString();
                    String myState2 = myData[0][6].toString();
                    int myZipCode = (Integer) myData[0][7];
                    System.out.println(myState1 + myUser + myPassword + myBusinessName + myAddress + myCity + myState2 + myZipCode);*/

                }
            }
        }
/*        System.out.println(myUser);*/
    }   
}