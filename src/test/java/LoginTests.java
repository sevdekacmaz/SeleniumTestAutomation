import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MainPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test
    public void loginSuccessful() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("sevdekulhan@gmail.com")
                .fillPassword("12345678")
                .clickLogin();
        Thread.sleep(3000);
        homePage.loginController();

    }
    @Test
    public void loginUnsuccessful() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("sevde@gmail.com")
                .fillPassword("1234567845")
                .clickLogin()
                .unsuccessfulMessageController();
    }

    @Test
    public void maxCharacterControl() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("sevdekulhan@gmailsevdekulhan@gmailsevdekulhan@gmailsevdekulhan@gmailsevdekulhan@gmailsevdekulhan@gmailsevdekulhan@gmail")
                .fillPassword("12345678123456781234567812345678123456781234567812345678123456781234567812345678123456781234567812345678")
                .clickLogin().emailMaxCharacterController();



    }

    @Test
    public void minCharacterControl() throws InterruptedException {

        mainPage.clickOneTrustClose();
        loginPage
                .fillEmail("sevdekulhan@gmail.com")
                .clickLogin().passwordMessageController();

    }

}
