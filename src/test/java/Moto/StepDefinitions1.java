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


    @When("^set (.*) to rider$")
    public void set_to_rider(Moto mt) {
        // Write code here that turns the phrase above into concrete actions
        this.rider.addMoto(mt);
    }


    @Then("^the rider is subscribed and (.*) is registered$")
    public void the_rider_is_subscribed_and_is_registered(String arg1)  {
        // Write code here that turns the phrase above into concrete actions

    }


}
