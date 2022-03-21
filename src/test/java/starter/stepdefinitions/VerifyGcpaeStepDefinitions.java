package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.GcpaeTitle;

public class VerifyGcpaeStepDefinitions {

    @Given("{actor} wants to make a quiz")
    public void makeAQuiz(Actor actor) {
        actor.wasAbleTo(NavigateTo.theGcpaeHomePage());
    }

    @Then("{actor} should see the gcpae website greeting: {string}")
    public void checkGcpaeWelcomePage(Actor actor, String greeting) {
        actor.attemptsTo(
                Ensure.that(GcpaeTitle.GREETING).hasText(greeting)
        );
    }

    @And("{actor} should see the website title {string}")
    public void checkTheWebsiteTitle(String title) {

    }

    @Given("{actor} is on gcpae website")
    public void isOnGcpaeWebsite(Actor actor) {
        actor.attemptsTo(

        );
    }

    @When("{actor} goes to hamburger menu")
    public void openHamburderMenu(Actor actor) {

    }

    @When("{actor} clicks on {string}")
    public void navigateToMenu(Actor actor, String menu) {

    }

    @Then("{actor} should see the Start Quiz screen")
    public void checkStartQuizScreen(Actor actor) {

    }

    @Then("{actor} should see the About screen")
    public void checkAboutScreen(Actor actor) {

    }

}
