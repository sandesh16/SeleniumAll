package ExcelReadWrite;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	//Creating WorkBook Object
	 public static XSSFWorkbook ExcelWBook; 
	 
	//Creating worksheet object  
	public static XSSFSheet ExcelWSheet; 
	 
	//Creating Excel Row Object 
	public static XSSFRow ExcelWRow; 
	 
	//Creating Excel Cell Object 
	public static XSSFCell ExcelWCell;   

	 public String ReadExcelData() throws Exception{     
	String Data=""; 
	  //Creating File path where excel is located  
	 File file  = new File("C:\\ExcelReadWrite.xlsx");
	 
	 
     //Creating a file inputstream for Excel File   
	 //This method reads excel from the mentioned path  
	 FileInputStream fis = new FileInputStream(file); 

//Creating Excel WorkBook Object  
 ExcelWBook = new XSSFWorkbook(fis);      

//Reading the sheet name from the object of the Excel WorkBook object  
ExcelWSheet = ExcelWBook.getSheet("Data");   

//Creating row object and getting the row number   
ExcelWRow = ExcelWSheet.getRow(1);   

//Creating a Cell Object and getting the Cell data   .
ExcelWCell = ExcelWRow.getCell(1);     

//Getting the cell data in the String Format  

Data = ExcelWCell.getStringCellValue();      
//Returns the data to be used by other methods.  
 return Data;   

  } 
 

	//====================== 
/*
public class ExcelReaderURL {
	//Creating WorkBook Object
	 public static XSSFWorkbook ExcelWBook; 
	 
	//Creating worksheet object  
	public static XSSFSheet ExcelWSheetURL; 
	 
	//Creating Excel Row Object 
	public static XSSFRow ExcelWRowURL; 
	 
	//Creating Excel Cell Object 
	public static XSSFCell ExcelWCellURL;   

	 public String ReadExcelData() throws Exception{     
	String Data=""; 
	  //Creating File path where excel is located  
	 File file  = new File("D:\\DyanFactory\\SeleniumAll\\ExcelPractice\\ExcelReadWrite.xlsx");
	 
	 FileInputStream fis = new FileInputStream(file); 
	 
     //Creating a file inputstream for Excel File     //This method reads excel from the mentioned path   FileInputStream fis = new FileInputStream(file); 

//Creating Excel WorkBook Object  
 ExcelWBook = new XSSFWorkbook(fis);      

//Reading the sheet name from the object of the Excel WorkBook object  
ExcelWSheet = ExcelWBook.getSheet("Data");   

//Creating row object and getting the row number   
ExcelWRow = ExcelWSheet.getRow(1);   

//Creating a Cell Object and getting the Cell data   .
ExcelWCell = ExcelWRow.getCell(0);     

//Getting the cell data in the String Format  

Data = ExcelWCell.getStringCellValue();      
//Returns the data to be used by other methods.  
 return Data;   

  } 
} */
}
	 