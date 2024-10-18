package com.banistmo.certification.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.slf4j.Logger;

import static com.banistmo.certification.userinterfaces.CuentaAhorroComercial.IMG_PDF;
import static com.banistmo.certification.userinterfaces.CuentaAhorroComercial.LNK_DOCUMENTOS;
import static com.banistmo.certification.userinterfaces.Depositos.LNK_CUENTA_AHORRO_COMERCIAL;
import static com.banistmo.certification.userinterfaces.PaginaPrincipalEmpresas.*;


public class NavegarDocumento implements Interaction {



    public static NavegarDocumento navegarDocumento() {
        return Tasks.instrumented(NavegarDocumento.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_ACEPTAR_COOKIES, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(BTN_ACEPTAR_COOKIES),
                WaitUntil.the(LNK_PRODUC_SERVIC, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LNK_PRODUC_SERVIC),
                WaitUntil.the(LNK_DEPOSITOS, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LNK_DEPOSITOS),
                WaitUntil.the(LNK_CUENTA_AHORRO_COMERCIAL, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LNK_CUENTA_AHORRO_COMERCIAL),
                WaitUntil.the(LNK_DOCUMENTOS, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(LNK_DOCUMENTOS),
                WaitUntil.the(IMG_PDF, WebElementStateMatchers.isClickable()).forNoMoreThan(5).seconds(),
                Click.on(IMG_PDF)
        );
    }
}
