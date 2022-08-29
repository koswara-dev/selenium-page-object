package com.juaracoding.pageobject.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.pages.LoginPage;
import com.juaracoding.pageobject.utils.Constants;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {
	
	private static WebDriver driver;
	private LoginPage loginPage = new LoginPage();
	
	public TestLogin() {
		driver = Hooks.driver;
	}
	
	@When("User go to Web HRM")
	public void user_go_to_Web_HRM() {
		driver.get(Constants.URL);
	}
	
	@And("User enter username password invalid")
	public void user_enter_username_password_invalid() {
		loginPage.login("Admin", "admin1234");
	}
	
	@And("User click button login")
	public void user_click_button_login() {
		loginPage.clickBtnLogin();
	}
	
	@Then("User invalid credentials")
	public void user_invalid_credentials() {
		assertEquals(loginPage.msgInvalid(), "Invalid credentials");
	}
	
	@When("User enter username password valid")
	public void user_enter_username_password_valid() {
		loginPage.login("Admin", "admin123");		
	}
	
	@And("User click button login valid")
	public void user_click_button_login_valid() {
		loginPage.clickBtnLogin();
	}
	
	@Then("User valid credentials")
	public void user_valid_credentials() {
		assertEquals(loginPage.getTxtEmpInfo(), "Employee Information");
	}
	
}
