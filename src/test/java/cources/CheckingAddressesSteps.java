package cources;

import cources.data.AddressTestPair;
import cources.data.DriverPool;
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
            page.auth();
            page.searchByAddr(address);
            Assert.assertTrue(page.vendorAvailabe(addressTestPair.get(address)));
        }

    }

}
