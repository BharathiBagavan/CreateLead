package interfaceexe;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
//import org.junit.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class LoginProject extends SeMethods {
	//@BeforeMethod(groups= {"All"})
	@Parameters({"url","username","password"})
	@BeforeMethod
	public void loginsite(String url,String username,String password)
	{
	startApp("chrome", url);
	type(locateElement("id", "username"),username);
	type(locateElement("id", "password"),password);
	click(locateElement("class","decorativeSubmit"));
	click(locateElement("linktext","CRM/SFA"));
	}
	
	@DataProvider(name="fetchdata")
	public Object[][] getData() throws IOException
	{
		ExcelReader rExcel=new ExcelReader();
		Object[][] data =rExcel.readExcel();
		return data;
		
	}
	
	@AfterMethod(groups= {"All"})
	public void logout()
	{
		closeBrowser();
	}
}
