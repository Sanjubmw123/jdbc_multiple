package SQL_Test;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import SQL_Page.CustomerPage;
import SQL_Page.Database;
import SQL_Util.browser;

public class Test_CustomerTest {
	WebDriver driver;
	CustomerPage customer;
	Database database;

	@Test
	public void Testing() throws InterruptedException, ClassNotFoundException, SQLException {
		driver = browser.startBrowser();
		customer = PageFactory.initElements(driver, CustomerPage.class);
		database = PageFactory.initElements(driver, Database.class);

		customer.enterusername(database.get("username"));
		customer.enterpassword(database.get("password"));
		customer.signin();
		Thread.sleep(2000);
		customer.CustomerElement();
		Thread.sleep(2000);
		customer.AddCustomerElement();

		// customer.ListCustomerElement();
		// customer.Groups_Element();
		customer.Full_name(database.get("fullname"));

		// customer.Company_Element(database.get("company"));

		customer.emailElement(database.get("email"));
		customer.Phone_Element(database.get("phnumber"));
		customer.Address_Element(database.get("adress"));
		customer.City_Element(database.get("city"));
		customer.StateELement(database.get("state"));
		customer.Zip_Element(database.get("zip"));

	}
}
