package com.ing.au.hackathon.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import com.ing.au.hackathon.base.Base;
import com.ing.au.hackathon.pages.FirstcryHomePage;

public class FirstCryValidateStepDefinition extends Base {
	FirstcryHomePage firstcryHomePage;
	//WebDriver driver;
	
	
	@Given("User Successfully Launches the FirstCry.com site")
	public void user_Successfully_Launches_the_FirstCry_com_site() throws IOException {
		lauchBrowser();
	}

	@When("perform navigation to the All Categories link")
	public void perform_navigation_to_the_All_Categories_link() throws WebDriverException {
		
		firstcryHomePage = new FirstcryHomePage(Base.driver);
		firstcryHomePage.MouseOverOnAllCategories();
		System.out.println("Successfully on mouseover");
	}

	@Then("user hover on the Stores and playschools link")
	public void user_hover_on_the_Stores_and_playschools_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("click on the Playschools tab")
	public void click_on_the_Playschools_tab() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("verify the maps for Hyderabad and Bengaluru")
	public void verify_the_maps_for_Hyderabad_and_Bengaluru() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("user click on the Hyderabad map")
	public void user_click_on_the_Hyderabad_map() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("verify the Hyderabad city playscools is displayed")
	public void verify_the_Hyderabad_city_playscools_is_displayed() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("verify the list of the centers shown")
	public void verify_the_list_of_the_centers_shown() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
