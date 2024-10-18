package com.banistmo.certification.stepdefinitions;
import com.banistmo.certification.questions.VerificarDocumentoQuestion;
import com.banistmo.certification.tasks.AbrirPortal;
import com.banistmo.certification.tasks.DescargarPDF;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.is;

public class DescargarDocumentoStepDefinition {

    @Before
    public void setUp(){
        setTheStage(new OnlineCast());
    }

    @Dado("que el usuario ingreso a banistmo")
    public void queElUsuarioIngresoABanistmo() {
    theActorCalled("usuario").wasAbleTo(AbrirPortal.WebBanistmo());
    }
    @Cuando("^descargue el documento al ingresar en el modulo de cuenta de ahorro comercial en la ruta empresas\\/Productos&servicios\\/depositos$")
    public void ingresaAAlModuloDeCuentaDeAhorroComercialEnLaRutaEmpresasProductosServiciosDepositos() {
        theActorInTheSpotlight().attemptsTo(DescargarPDF.descargarPDF());
    }

    @Entonces("debe abrir una nueva ventana con el documento {string}")
    public void debeAbrirUnaNuevaVentanaConElDocumento(String tipoDocumento) {
        OnStage.theActorInTheSpotlight().should(seeThat(VerificarDocumentoQuestion.contieneTexto(tipoDocumento), is(true)));

    }

}
