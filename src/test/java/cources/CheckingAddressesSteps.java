package cources;

import cources.checkers.AccountChecker;
import cources.data.AddressTestPair;
import cources.data.DriverPool;
import cources.data.User;
import cources.data.UserPool;
import cources.pages.DeliveryClubMainPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.Map;

public class CheckingAddressesSteps {

    private DeliveryClubMainPageObject page;

    @Given("i go to {string}")
    public void gotoDC(String string){
        page = new DeliveryClubMainPageObject();
        WebDriver dr = DriverPool.instance.pollDriver();
        dr.get(string);
        page.init(dr);
    }

    @When("^i enter address")
    public void i_enter_address() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^i see vendor in result")
    public void i_see_text(Map<String, String> addressTestPair) {


        for (String address:addressTestPair.keySet()) {
            page.searchByAddr(address);

            Assert.assertTrue(page.vendorAvailabe(addressTestPair.get(address)));
        }

    }

    @When("^i login$")
    public void i_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("i login");


        User user = UserPool.instance.pollUser();
        page.auth(user.getLogin(),user.getPassword());

    }

    @Then("^i see my account$")
    public void i_see_myaccount() {
        System.out.println("i see my acc");
        Assert.assertTrue(new AccountChecker(page).check());
    }

}
