package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class firstSD1 {

    @Given("^when user do the given action$")
    public void whenUserDoTheGivenAction() {
        System.out.println("a");
    }

    @When("^when do the specific action$")
    public void whenDoTheSpecificAction() {
    }

    @And("^do this$")
    public void doThis() {
        System.out.println("steps");
    }

    @Then("^then do this$")
    public void thenDoThis() {
    }
}
