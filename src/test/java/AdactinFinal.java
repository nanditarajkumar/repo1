import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdactinFinal extends Base {
	@Test
	
	private void tc0() {
		getdriver();
		loadurl(driver,"http://www.adactin.com/HotelApp/");
		maximize(driver);
	}
	
	@Parameters({"username","password"})
	@Test
	private void tc1(String s,String s1) {
		AdactinFirstpage a=new AdactinFirstpage();
		WebElement username = a.getUsername();
		type(username, s);
		WebElement password = a.getPassword();
		type(password, s1);
		WebElement btnlogin = a.getBtnlogin();
		click(btnlogin);

	}

}
