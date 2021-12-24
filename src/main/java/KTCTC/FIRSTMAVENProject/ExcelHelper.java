package KTCTC.FIRSTMAVENProject;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	private int roNum;
	private XSSFSheet sh = null;
	public ExcelHelper(String fileName, String sheetName)
	{
		File f = new File(System.getProperty("user.dir") + "\\"+fileName);

		try {
			FileInputStream fis = new FileInputStream(f);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			 sh = wb.getSheet(sheetName);
			roNum = sh.getLastRowNum();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}
	
	
	
	public   ArrayList<String> getKeysList()
	{
		ArrayList<String> key = new ArrayList<>();
		for (int i = 1; i <= roNum; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);
			key.add(getCellValueAccordingToTypeOfCell(cel));

		}
		
		return key;
	}
	public   ArrayList<String> getValueList()
	{
		ArrayList<String> value = new ArrayList<>();
		for (int i = 1; i <= roNum; i++) {
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(1);
			value.add(getCellValueAccordingToTypeOfCell(cel));

		}
		
		return value;
	}
	
	public HashMap<String,String> getKeyValuePair()
	{
		HashMap<String, String> kv = new HashMap<>();
		
		for (int i = 1; i <= roNum; i++)
		{
			XSSFRow row = sh.getRow(i);
			XSSFCell cel = row.getCell(0);
			String k = getCellValueAccordingToTypeOfCell(cel);
			cel = row.getCell(1);
			String v = getCellValueAccordingToTypeOfCell(cel);
			kv.put(k, v);
		}
		
		return kv;
		
	}
	
	public HashMap<String,String> getKeyValuePair1()
	{
		HashMap<String, String> kv = new HashMap<>();
		ArrayList<String> kList = getKeysList();
		ArrayList<String> vList = getValueList();
		
		for (int i = 0; i <= kList.size(); i++)
		{
			kv.put(kList.get(i), vList.get(i));
		}
		
		return kv;
		
	}
	
	
	private static String getCellValueAccordingToTypeOfCell(XSSFCell cel)
	{
		Object data = null;
		switch (cel.getCellType()) {
		case STRING:
                        data=cel.getStringCellValue();
			break;
		case NUMERIC:
			data=cel.getNumericCellValue();
			break;
		case BOOLEAN:
			data=cel.getBooleanCellValue();
			break;
		case FORMULA:
			data=cel.getCellFormula();
			break;

		default:
			System.out.println("There is not value in cell. Its blank");
			break;
		}
		return data.toString();
	}

}
