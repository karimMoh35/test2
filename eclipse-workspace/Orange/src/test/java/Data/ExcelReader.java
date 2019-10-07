package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	static FileInputStream fis=null ;   // initiate fis 
	
	public FileInputStream getfileFileInputStream()
	{
		String Path= System.getProperty("user.dir")+"/src/test/java/Data/book1.xlsx" ;
		File SrcFile = new File(Path);
		
		try {
			fis=new FileInputStream(SrcFile);
		} catch (FileNotFoundException e) {
			System.out.println("Error happens ! : " +e.getMessage());
			System.exit(0);
			
		}
		return fis ;
		// note if the file extension is 1- xlsx   implement xssf    2- xls     implement Hssf after adding apache poi maven reprository
	}
	
	public Object[][] getexcelData () throws IOException
	{
		fis = getfileFileInputStream();
		XSSFWorkbook wb  = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int TotalNumberOfRows = ( sheet.getLastRowNum()+1) ;
		int TotalNumberOfcolumns= 5;
		
		String [][] arrayExcelData = new String [TotalNumberOfRows][TotalNumberOfcolumns];
		
		for (int i = 0; i <TotalNumberOfRows ; i++) {
			for (int j = 0; j < TotalNumberOfcolumns; j++) {
				XSSFRow row = sheet.getRow(i);
				arrayExcelData [i][j]=row.getCell(j).toString();
						
				
			}
			
		}
		wb.close();
		return arrayExcelData;
		
	}   

}
