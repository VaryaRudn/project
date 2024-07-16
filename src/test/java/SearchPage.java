
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends BasePage {
  @FindBy (xpath = "//*[.='Северсталь - вертикально-интегрированная горно ...']")
    private WebElement linkName;

    public SearchPage() {
        PageFactory.initElements(driver, this);
    }
    public SeverPage linkPage(){
        linkName.click();
        return new SeverPage();
    }
}
