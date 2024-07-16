import org.junit.jupiter.api.Test;

public class CheckSever extends BaseTest{

    @Test
    public void testMainPage() {
        MainPage mainPage = new MainPage();
        mainPage.nextPage().linkPage().checkingPage().isElementPresent();
    }

}
