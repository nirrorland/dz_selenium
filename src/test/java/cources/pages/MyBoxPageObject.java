package cources.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyBoxPageObject extends AbstractPage {

    private WebDriver driver;
    private WebDriverWait waiter;

    public void init(WebDriver webDriver) {

        this.driver = webDriver;
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        waiter = new WebDriverWait(driver, 20);
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//ul[@class='user_basket__list']")
    private WebElement userBasketList;

    public List<String> getBasketItemNames() {
        List<String> result = new ArrayList<String>();

        List<WebElement> basketItems = userBasketList.findElements(By.xpath("./li/dl/dt"));

        for (WebElement item:basketItems) {
            result.add(item.getText());
            System.out.println(item.getText());
        }

        return result;
    }

}
