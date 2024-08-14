package Pages;

import Base.Data;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends Data {

    public LoginPage fillEmail(String text) {
        driver.findElement(By.name("userLoginId")).sendKeys(text);
        return this;
    }
    public LoginPage fillPassword(String password){
        driver.findElement(By.name("password")).sendKeys(password);
        return this;
    }

    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[data-uia='login-submit-button']")).click();
        return this;

    }
    public LoginPage passwordMessageController(){
        String value = driver.findElement(By.cssSelector("[data-uia='password-field+validationMessage']")).getText();
        Assert.assertEquals(value, message);
        return this;
    }
}
