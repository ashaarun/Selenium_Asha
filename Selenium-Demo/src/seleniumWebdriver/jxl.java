package seleniumWebdriver;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;


public class jxl {

	public static void main(String[] args) throws IOException, WriteException, WriteException, Throwable {
		// TODO Auto-generated method stub
		File fexcel=new File("C:\\TP_bkup_remaining\\New_TP\\Selenium Training\\jxl1.xls");
		WritableWorkbook writebook=Workbook.createWorkbook(fexcel);
		writebook.createSheet("asha", 0);
		WritableSheet writesheet= writebook.getSheet(0);
		Label testdata= new Label(0,0,"IBM");
		Label testdata2= new Label(0,1,"Learn");
		writesheet.addCell(testdata);
		writesheet.addCell(testdata2);
		
		//New sheet n new data
		
		writebook.createSheet("arun", 1);
		WritableSheet writesheet1=writebook.getSheet(1);
		Label testdata3=new Label(0,4,"5thcell");
		writesheet1.addCell(testdata3);
		writebook.write();
		writebook.close();
		
		Workbook workbook=Workbook.getWorkbook(new File("C:\\TP_bkup_remaining\\New_TP\\Selenium Training\\jxl1.xls"));
		Sheet sheet=null;
		int noofsheets=workbook.getNumberOfSheets();
		Cell cell1=null;
		for (int p=0;p<noofsheets;p++)
		{
			sheet=workbook.getSheet(p);
			int noofrows=sheet.getRows();
			int noofcols=sheet.getColumns();
			System.out.println(sheet.getRows()+ " " + sheet.getColumns());
			System.out.println("Data from sheet"+p);
			
			for (int i=0;i<noofrows;i++)
				for (int j=0;j<noofcols;j++)
				{
					cell1=sheet.getCell(j,i);
					if(cell1.getContents().length()>0)
					{
						System.out.println(cell1.getContents());
					}
				}
			
		}
		
		
		
		
		
		
	}

}
