import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelSearch extends Base{
	public HotelSearch() {
    PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	@FindBy(id="continue")
	private WebElement continue1;
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinue1() {
		return continue1;
	}

}
