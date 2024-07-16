import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage {

    @FindBy(xpath = "//textarea[@class='gLFyf']")
    public WebElement textBox;

    public MainPage() {
        driver.get("https://www.google.ru/?hl=ru");
        PageFactory.initElements(driver, this);
    }

    public SearchPage nextPage() {
        textBox.sendKeys("Северсталь");
        textBox.sendKeys(Keys.ENTER);
        return new SearchPage();
    }

}
