package Pages;

import Base.BaseLibrary;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BaseLibrary {

    @Step("Kullanıcı girişi kontrolü yapılır.")
    public HomePage loginController(){

       String value =  driver.findElement(By.cssSelector("[data-uia='nmhp-card-hero-text-welcome']")).getText();
        Assert.assertEquals("Welcome back!", value);
        return this;
    }

}
