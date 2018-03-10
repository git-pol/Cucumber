package com.bie.qa.util;

import java.io.File;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellReference;

public class Test {

    /*public static String TESTDATA_SHEET_PATH = "C:\\Dev\\Eclipse\\BddBieAutomation\\src\\main\\java\\com\\bie\\qa\\testdata\\TestData.xlsx";

    static Workbook book;
    static Sheet sheet;

    public static Object[][] getTestData(String sheetName) throws org.apache.poi.openxml4j.exceptions.InvalidFormatException {

        FileInputStream file = null;

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

        Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
                data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
                System.out.println(data[i][k]);
            }
        }
        return data;
        }*/
	
	public static void searchData() throws InvalidFormatException, IOException {
	
	String toFind = "CA";

	Workbook wb = WorkbookFactory.create(new File("C:\\Dev\\Eclipse\\BddBieAutomation\\src\\main\\java\\com\\bie\\qa\\testdata\\TestData.xlsx"));
	
	DataFormatter formatter = new DataFormatter();
	Sheet sheet1 = wb.getSheetAt(0);	
	
	for (Row row : sheet1) {
	    for (Cell cell : row) {
	        CellReference cellRef = new CellReference(row.getRowNum(), cell.getColumnIndex());

	        // get the text that appears in the cell by getting the cell value and applying any data formats (Date, 0.00, 1.23e9, $1.23, etc)
	        String text = formatter.formatCellValue(cell);

	        // is it an exact match?
	        if (toFind.equals(text)) {
	           System.out.println("Text matched at " + cellRef.formatAsString());
	        }
	        // is it a partial match?
	        else if (text.contains(toFind)) {
	           System.out.println("Text found as part of " + cellRef.formatAsString());
	        }
	    }
	}}}
    
    