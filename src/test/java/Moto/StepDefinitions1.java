package Moto;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Moto;
import models.Rider;
import org.junit.Assert;

public class StepDefinitions1 {

    private Rider rider = new Rider();

    @Given("^a rider$")
    public void a_rider() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertTrue(this.rider != null);
    }


    @Given("^a rider the rider fullname is : (.*)$")
    public void a_rider_the_rider_fullname_is(String fullname)  {
        // Write code here that turns the phrase above into concrete actions
        this.rider.setFullname(fullname);
    }

    @When("^set moto to rider where \"([^\"]*)\" and \"([^\"]*)\"$")
    public void set_moto_to_rider_where_and(String arg1, String arg2)  {
        // Write code here that turns the phrase above into concrete actions
        Moto moto1 = new Moto(arg1, arg2);
        this.rider.addMoto(moto1);
    }

    @Then("^the rider is subscribed with moto$")
    public void the_rider_is_subscribed_with_moto() {
        // Write code here that turns the phrase above into concrete actions
        this.rider.toString_myMoto();
    }

}
