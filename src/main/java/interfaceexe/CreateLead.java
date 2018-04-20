package interfaceexe;


	import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
	

	public class CreateLead extends LoginProject{
	//@Test(invocationCount=2)
		//@Test(groups= {"smoke"})
		@Test(dataProvider="fetchdata")
		public void login(String cName,String fName,String lName)
		{
		/*startApp("chrome", "http://www.leaftaps.com/opentaps");
		type(locateElement("id", "username"),"DemoSalesManager");
		type(locateElement("id", "password"),"crmsfa");
		click(locateElement("class","decorativeSubmit"));
		click(locateElement("linktext","CRM/SFA"));*/
		//	loginsite();
		click(locateElement("linktext","Leads"));
		click(locateElement("linktext","Create Lead"));
		type(locateElement("id", "createLeadForm_companyName"),cName);
		type(locateElement("id", "createLeadForm_firstName"),fName);
		type(locateElement("id", "createLeadForm_lastName"),lName);
		click(locateElement("name","submitButton"));
		getText(locateElement("viewLead_companyName_sp"));
		
		}
		/*@DataProvider(name="fetchdata")
		public Object getData() 
		{
			Object data[][]=new Object[2][3];
		
			data[0][0]="xxx";
			data[0][1]="ammu";
			data[0][2]="rose";
			
			data[1][0]="xxx";
			data[1][1]="bharthi";
			data[1][2]="bagavan";
			return data;
			
		}*/
		
		
	}

		



