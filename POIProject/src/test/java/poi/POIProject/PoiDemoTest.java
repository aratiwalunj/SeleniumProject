package poi.POIProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.poi.ss.util.NumberToTextConverter;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PoiDemoTest {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        
		 ArrayList<String> alist=getDatafromExcel("tests");
		 for(String a:alist) {
			 System.out.println(a);
		 }
	}
		
		public static ArrayList<String> getDatafromExcel(String testname) throws IOException
		{
			 ArrayList<String> alist = new ArrayList();

		FileInputStream fis=new FileInputStream("C:\\Users\\Santosh\\Desktop\\ExcelTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
        int sheetcount=workbook.getNumberOfSheets();	
        for(int i=0;i<sheetcount;i++)
        {
        	if(workbook.getSheetName(i).equalsIgnoreCase("Sheeta"))
        	{
        		XSSFSheet sheet=workbook.getSheetAt(i);
        		Iterator<Row> rows=sheet.rowIterator();
        		Row firstrow=rows.next();
        		Iterator<Cell> cells=firstrow.iterator();
        		int c=0;
        		int columnposition=0;
        		while(cells.hasNext())
        		{
        			Cell cell = cells.next();
        			if(cell.getStringCellValue().equalsIgnoreCase("TestA"))
        			{
        				columnposition=c;
        			}
        			c++;
        		}
        		while(rows.hasNext())
        		{
        			Row row = rows.next();
        			Cell cell=row.getCell(columnposition);
        			if(cell.getStringCellValue().equalsIgnoreCase(testname))
        			{
        				Iterator<Cell> citr = row.iterator();
        				while(citr.hasNext())
        				{
        					Cell curcell = citr.next();
        					if(curcell.getCellType()==CellType.STRING)
        					{
        						alist.add(curcell.getStringCellValue());

        					}else
        					{
								alist.add(NumberToTextConverter.toText(curcell.getNumericCellValue()));

        					}
        				}
        			}
        		}
        		workbook.close();
        	}
        }
        return alist;
	}
}
