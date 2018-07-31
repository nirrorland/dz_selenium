package cources;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/cources/addresses.feature")
//@CucumberOptions(features = "src/test/resources/cources/login.feature")
@CucumberOptions(features = "src/test/resources/cources/OrderSomeGoods.feature")
public class Runner {
}
