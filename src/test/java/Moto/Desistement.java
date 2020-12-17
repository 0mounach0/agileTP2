package Moto;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.Course;
import models.Participant;
import models.Voiture;

public class Desistement {

    Voiture v = new Voiture();
    Participant p = new Participant();;
    Course c = new Course();
    int AncienNbTitre;

    @Given("Un enregistrement comprend la course concernant le desistement")
    public void participant_senregistre() {

        v.setModele("Audi A7");
        v.setVitesseMax(260);

        p.setNom("Thomas");
        p.setVoitureChoisie(v);

        c.ajouterPartcipant(p);



    }
    @When("supprimer le participant p")
    public void suppr_participant() {
        c.enleverParticipant(p);

    }
    @Then("verifier la suppr de p")
    public void titre_attribue() {
        assertTrue(!c.getParticipants().contains(p));
    }
}