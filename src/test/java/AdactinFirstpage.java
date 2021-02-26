import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinFirstpage extends Base{
public AdactinFirstpage() {
 PageFactory.initElements(driver, this);
}
 
 @FindBy(id="username")
 private WebElement username;
 @FindBy(id="password")
 private WebElement password;
 @FindBy(id="login")
 private WebElement btnlogin;
public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
}
public WebElement getBtnlogin() {
	return btnlogin;
}

}
