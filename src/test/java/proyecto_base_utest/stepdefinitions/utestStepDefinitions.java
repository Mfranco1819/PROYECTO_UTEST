package proyecto_base_utest.stepdefinitions;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import proyecto_base_utest.model.UtestDatos;
import proyecto_base_utest.taks.CompleteForm;
import proyecto_base_utest.taks.Openup;
import proyecto_base_utest.taks.completarDireccion;

import java.util.List;

public class utestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());

    }

    @Given("^where Maikel wants to register on the utest website$")
    public void whereMaikelWantsToRegisterOnTheUtestWebsite() throws Exception {
        OnStage.theActorCalled("Maikel").wasAbleTo(Openup.ThePage());

    }

    @When("^the user enters the information required by the page$")
    public void theUserEntersTheInformationRequiredByThePage(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.Onthepage(datos), completarDireccion.Thepage(datos));

    }

    @Then("^Registration successfully completed$")
    public void registrationSuccessfullyCompleted() throws Exception {

    }


}
