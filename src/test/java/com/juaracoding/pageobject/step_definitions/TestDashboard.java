package com.juaracoding.pageobject.step_definitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.juaracoding.pageobject.pages.DashboardPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestDashboard {

	WebDriver driver;
	private DashboardPage dashboardPage = new DashboardPage();
	
	public TestDashboard() {
		driver = Hooks.driver;
	}
	
	@When("User click menu Dashboard")
	public void user_click_menu_dashboard() {
//		Hooks.delay(1);
		dashboardPage.goToMenuDashboard();
	}
	
	@Then("User on menu Dashboard")
	public void user_on_menu_dashboard() {
		assertEquals(dashboardPage.getTxtDashboardPage(), "Launching Soon");
	}
	
}
