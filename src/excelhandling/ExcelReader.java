package excelhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\ramar\\Desktop\\TC03CL.xlsx");
		FileInputStream fis=new FileInputStream(src);
        XSSFWorkbook wb=new XSSFWorkbook();
	}

}
