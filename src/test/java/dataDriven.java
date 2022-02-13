import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
		//Accepts file input stream argument
		//Fileinput stream argument
		
	    FileInputStream fis= new FileInputStream("C:\\Users\\GOURAB\\Desktop\\Manual Testing\\testdata.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		System.out.println(workbook.getNumberOfSheets());
		
      
	}

}
