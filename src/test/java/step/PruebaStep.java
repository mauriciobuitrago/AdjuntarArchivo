package step;

import Tasks.prueba2task;
import Tasks.pruebatask;
import UI.Prueba;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.eclipse.jetty.util.annotation.ManagedAttribute;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class PruebaStep {
    @Managed
    private WebDriver hisBrowser;


    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^ingresar a la url$")
    public void ingresarALaUrl() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));
    }


    @When("^cargar archivo$")
    public void cargarArchivo() {
        //OnStage.theActorInTheSpotlight().attemptsTo(pruebatask.diligenciar());
        OnStage.theActorInTheSpotlight().attemptsTo(prueba2task.diligenciar2());

    }

    @Then("^el archivo será cargado$")
    public void elArchivoSeráCargado() {

    }

}
