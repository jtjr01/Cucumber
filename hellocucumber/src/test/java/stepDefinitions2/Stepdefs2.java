package stepDefinitions2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;

class ItsFriday {
    static String itsFriday(String today2) {
        return "Yes";
    }
}

public class Stepdefs2 {
	private String today2;
    private String actualAnswer2;
	
    @Given("^today is Friday$")
	public void today_is_Friday() {
		this.today2 = "Friday";
	}
    
	@When("^I ask if it's Friday yet$")
	public void i_ask_if_is_s_Friday_yet() {
		this.actualAnswer2 = ItsFriday.itsFriday(today2);
	}
	
	@Then("^I should be told \"([^\"]*)\"$")
	public void i_should_be_told_its_friday(String expectedAnswer2) {
		assertEquals(expectedAnswer2, actualAnswer2);
	}
}
