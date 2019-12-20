

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class MagentoTest
{
	@Test
	public void magentoTest()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.com");
		Welcome w = new Welcome(driver);
		w.clickOnMyAccount();
		Login l = new Login(driver);
		l.typeEmail("mzaidurrahman@gmail.com");
				l.typePassword("Welcome123");
				
				
				
				l.clickOnLogin();
				Home h = new Home(driver);
				h.clickOnLogout();
		
		
		
	}

}
