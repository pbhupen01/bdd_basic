package stepdefs;

import com.practice.bdd.dto.Cat;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.assertTrue;

public class CatSteps {

    Cat cat;

    @Given("^I have an empty cat$")
    public void I_have_an_empty_cat() throws Throwable {
        // Express the Regexp above with the code you wish you had
        boolean isCatNull = true;

        assertTrue(isCatNull == (cat == null));

    }

    @When("^I create a cat with name \"([^\"]*)\"$")
    public void I_create_a_cat_with_name(String name) throws Throwable {
        // Express the Regexp above with the code you wish you had
        cat = new Cat(name);
    }

    @Then("^The name returned should be \"([^\"]*)\"$")
    public void The_name_returned_should_be(String name) throws Throwable {
        // Express the Regexp above with the code you wish you had
        assertTrue(cat.getName().equals(name));
    }

    @When("^Change its name to \"([^\"]*)\"$")
    public void Change_its_name_to(String name) throws Throwable {
        // Express the Regexp above with the code you wish you had
        cat.setName(name);
    }
}
