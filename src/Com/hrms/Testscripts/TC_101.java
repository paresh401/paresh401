package Com.hrms.Testscripts;
import org.testng.annotations.Test;
import Com.hrms.lib.*;
import org.apache.log4j.xml.DOMConfigurator;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;
//import org.testng.Reporter;

public class TC_101 {
//public static void main (String args[]) throws Exception{
	
	    @Test
	    public void Test1()throws Exception {
	    	DOMConfigurator.configure("Log4j.xml");
	    General obj = new General();
		obj.openApplication();
		obj.verifytitle();
	  //obj.waitStmt();
		obj.loginApplication();
		obj.verifyWelcometxt();
		obj.logout();
		
		
	}
}