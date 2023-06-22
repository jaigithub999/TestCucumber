package org.floto.stepdefinition;

import org.floto.objectrepository.FlotoHomePagePojo;
import org.floto.objectrepository.FlotoLoginPagePojo;
import org.floto.utilities.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlotoLoginStep extends BaseClass {

	public static FlotoLoginPagePojo login;
	public static FlotoHomePagePojo home;

	@Given("user launch floto application")
	public void user_launch_floto_application() {
		launchChromeBrowser();
		launchUrl("https://www.floto.com/");
		maximizeWindow();
		applyWaitForAllElement();
		home = new FlotoHomePagePojo();
		clickElement(home.getChangeCountryBtn());
	}

	@Given("user click account link")
	public void user_click_account_link() {
		FlotoHomePagePojo home = new FlotoHomePagePojo();
		clickElement(home.getAccountBtn());
	}

	@When("user enter {string} and {string}")
	public void user_enter_and(String s1, String s2) {
		login = new FlotoLoginPagePojo();
		enterText(login.getEmailBoxTxt(), s1);
		enterText(login.getPasswordBoxTxt(), s2);

	}

	@When("user enter login button")
	public void user_enter_login_button() {
		login = new FlotoLoginPagePojo();
		clickElement(login.getLoginBtn());
		//frameSwitchByWebElement(login.getRobotFrame());
		//clickElement(login.getImNotRobotBtn());
		pauseExecution(15000);
		clickElement(login.getSubmitBtn());
	}

	@Then("user see the result based on the {string}")
	public void user_see_the_result_based_on_the(String string) {
		login = new FlotoLoginPagePojo();
		checkPresenceOfAnElement(login.getLoginErrorMsg(), "check Error Message ");
	}

}
