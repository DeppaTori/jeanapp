package com.deppatori.jeanapp;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

class IsUserLogin {
    static String check(String status) {
        return "logged".equals(status)?"USER LOGGED":"false";
    }
}

public class IsUserLoginStepDefs{

    private String loginStatus;
    private String actualCheck;

    @Given("^Session is \"([^\"]*)\"$")
    public void session_is(String sessionStatus) throws Exception {
        loginStatus = sessionStatus;
    }

    @When("^System check whether user login yet$")
    public void system_check_whether_user_login_yet() throws Exception {
        actualCheck = IsUserLogin.check(loginStatus);
    }

    @Then("^Application should print \"([^\"]*)\"$")
    public void application_should_print(String expectedAnswer) throws Exception {
        assertEquals(expectedAnswer,actualCheck);
    }


}
