package cources;

import cources.data.DriverPool;
import cources.pages.DeliveryClubMainPageObject;
import cources.pages.MyBoxPageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderSomeGoodsSteps {
    private DeliveryClubMainPageObject page;
    private MyBoxPageObject boxPage;
    private WebDriver dr;

    private String orderedMeal;

    @Given("i go to all restaurants at {string}")
    public void gotoDC(String string){
        page = new DeliveryClubMainPageObject();
        dr = DriverPool.instance.pollDriver();
        dr.get(string);
        page.init(dr);

    }

    @When("^i select 1st shop$")
    public void selectShop() {
        page.searchByAddr("Москва, Шарикоподшипниковская улица, 17");
        page.openShopByNumber(2);
    }

    @When("i order {int} goods")
    public void orderGoods(int goodsNum){
      this.orderedMeal = page.orderMealsByNumber(goodsNum);

    }

    @When("i open my box")
    public void i_open_my_box() {
        // Write code here that turns the phrase above into concrete actions
        page.openBox();
    }

    @Then("i see goods selected by me moment ago")
    public void i_see_goods_selected_by_me_moment_ago() {
        // Write code here that turns the phrase above into concrete actions
        boxPage = new MyBoxPageObject();
        boxPage.init(dr);

    }


}
