import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckPage extends BasePage {

    public CheckPage() {
        PageFactory.initElements(driver, this);
    }

    public boolean isElementPresent() {
        return !driver.findElements(By.xpath("//h1[@class='h-1 page-lead__head-title']")).isEmpty();
    }
}
