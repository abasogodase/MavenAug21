package KTCTC.FIRSTMAVENProject;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExcelHelper obj = new ExcelHelper("KTCTC.xlsx", "Aug");
		ArrayList<String> keys = obj.getKeysList();
		ArrayList<String> values = obj.getValueList();
		Object dd[][] = {{"Name","Ajay"},{"Add","Pune"}};
		
		
		Object arr[][] = new Object[keys.size()][2];
		
		for (int i=0;i<keys.size();i++)
		{				
				arr[i][0] = keys.get(i); 				
				
				arr[i][1] = values.get(i);
			
			
		}
		

	}

}
