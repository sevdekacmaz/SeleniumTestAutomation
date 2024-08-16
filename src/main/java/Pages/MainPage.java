package Pages;

import Base.BaseLibrary;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends BaseLibrary {

    @Step("Çerez kontrolü yapılır")
    public MainPage clickOneTrustClose() {

        driver.findElement(By.cssSelector("[class*='banner-close-button ot-close-icon']")).click();

        return this;
    }
}
