import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeverPage extends BasePage{

    @FindBy(xpath = "//a/div[text()='О компании']")
    private WebElement buttonCompany;

    @FindBy(xpath = "//div[@class='sidebar-link active']//a[@class='sidebar-link__wrapper-link']/span[text()='Стратегия и ценности']")
    private WebElement filledNameButtons;



    public SeverPage() {
        PageFactory.initElements(driver, this);
    }

    public CheckPage checkingPage(){
        buttonCompany.click();
        filledNameButtons.click();
        return new CheckPage();
    }
}


