package Sample;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AdditionDataDriven {
@Test (dataProvider = "testdata")
public void addition(String str1,String str2,String str3){
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	int num3 = Integer.parseInt(str3);
	
	int result = num1 + num2 + num3;
	System.out.println("Addition of Each Row is " + result);
}
	
	
@DataProvider (name = "testdata")
public Object [][] readexcel() throws BiffException, IOException{	
	File f = new File("C:/Users/MarshneelJ/Desktop/Add.xls");
	Workbook w = Workbook.getWorkbook(f);
	Sheet s = w.getSheet(0);
	int row = s.getRows();
	int row1 = row - 1;
	int col = s.getColumns();
	
	String inputdata[][] = new String[row1][col];
	for (int i=0;i<row1;i++){
		for(int j=0;j<col;j++){
			Cell c = s.getCell(j,(i+1));
			inputdata[i][j] = c.getContents();
		}
	}
	return inputdata;
	
}
}
