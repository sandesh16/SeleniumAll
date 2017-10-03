package ExcelTry;



import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader 
{
	
	public static XSSFWorkbook ExcelWorkbook; // Creating Object of WorkBook
	
	public static XSSFSheet ExcelSheet;       // Creating Object of Sheet
	
	public static XSSFRow ExcelRow;           // Creating Object of Cell
	
	public static XSSFCell ExcelCell;		  // Creating Object of Column

	
	public String ReadExcelData() throws Exception
	{
		String Data="";
		
		File file=new File("D:\\Softwares\\Selenium\\ExcelWorkbook.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		ExcelWorkbook = new XSSFWorkbook(fis);
		ExcelSheet = ExcelWorkbook.getSheet("ExcelSheet");
		
		ExcelRow = ExcelSheet.getRow(1);
		ExcelCell = ExcelRow.getCell(1);

		/*ExcelRow = ExcelSheet.getRow(3);
		ExcelCell = ExcelRow.getCell(2);
		*/
		Data = ExcelCell.getStringCellValue();		
		return Data;
	}
	
	public String GetBaseURL(int Row) throws Exception{
		String Data="";
		
		File file=new File("D:\\Softwares\\Selenium\\ExcelWorkbook.xlsx");
		
		FileInputStream fis = new FileInputStream(file);
		
		ExcelWorkbook = new XSSFWorkbook(fis);
		ExcelSheet = ExcelWorkbook.getSheet("ExcelSheet");
		
		ExcelRow = ExcelSheet.getRow(Row);
		ExcelCell = ExcelRow.getCell(0);

		Data = ExcelCell.getStringCellValue();		
		return Data;
		
	}
	
}
