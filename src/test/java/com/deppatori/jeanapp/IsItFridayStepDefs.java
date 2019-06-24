package com.deppatori.jeanapp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today)?"TGIF":"Nope";
    }
}

public class IsItFridayStepDefs extends  CucumberStepDefinitions {

    private String today;
    private String actualAnswer;

    @Given("^today is Sunday$")
    public void today_is_Sunday() throws Exception {
        today = "Sunday";
    }

    @When("^i ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() throws Exception {
        actualAnswer = IsItFriday.isItFriday(today);
    }



    @Then("^i should be told \"([^\"]*)\"$")
    public void i_should_be_told(String expectedAnswer) throws Exception {
        assertEquals(expectedAnswer,actualAnswer);
    }

    @Given("^today is Friday$")
    public void today_is_Friday() throws Exception {
        today = "Friday";
    }







}
