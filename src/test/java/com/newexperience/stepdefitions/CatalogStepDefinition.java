package com.newexperience.stepdefitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import com.newexperience.questions.ValidateSelectedDress;
import com.newexperience.tasks.LookForCasualDress;
import com.newexperience.tasks.SelectWomenCategory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;

public class CatalogStepDefinition {
	
	Actor user = Actor.named("Sara");
	
	@Managed(driver= "chrome")
	WebDriver driver;
	
	@Before
	public void config() {
		user.can(BrowseTheWeb.with(driver));
	}
	
	@Given("^The user start the navigator$")
	public void theUserStartTheNavigator() {
		user.wasAbleTo(Open.url("http://automationpractice.com/index.php"));
	}

	@Given("^The user select women category$")
	public void theUserSelectWomenCategory() {
	    user.attemptsTo(SelectWomenCategory.inThePage());
	}


	@When("^She looks for a size \"([^\"]*)\" casual dress$")
	public void sheLooksForASizeCasualDress(String size) {
	    user.attemptsTo(LookForCasualDress.inTheCatalog(size));
	}

	@Then("^She check the \"([^\"]*)\"$")
	public void sheCheckThe(String title) {
		user.should(seeThat(ValidateSelectedDress.inTheDescription(),Matchers.is(title)));
	}


	


}
