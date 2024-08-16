package Pages;

import Base.BaseLibrary;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseLibrary {

    @Step("Email alanı doldurulur")
    public LoginPage fillEmail(String text) {
        driver.findElement(By.name("userLoginId")).sendKeys(text);
        screenshot();
        return this;
    }

    @Step("Şifre alanı doldurulur")
    public LoginPage fillPassword(String password){
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    @Step("Login butonuna tıklanır")
    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[data-uia='login-submit-button']")).submit();
        return this;

    }
    @Step("Parola alanı mesaj kontrolü")
    public LoginPage passwordMessageController(){
        String value = driver.findElement(By.cssSelector("[data-uia='password-field+validationMessage']")).getText();
        Assert.assertEquals(value, message);
        return this;
    }

    @Step("Başarısız giriş mesaj kontrolü")
    public LoginPage unsuccessfulMessageController(){
        String value = driver.findElement(By.cssSelector("[data-uia='error-message-container+header']")).getText();
        Assert.assertEquals(value, message2);
        screenshot();
        return this;
    }

    @Step("Maksimumum karakter kontrolü")
    public LoginPage emailMaxCharacterController(){
        String value = driver.findElement(By.cssSelector("[data-uia='login-field+validationMessage']")).getText();
        Assert.assertEquals(value, message3);
        screenshot();
        return this;
    }

}
