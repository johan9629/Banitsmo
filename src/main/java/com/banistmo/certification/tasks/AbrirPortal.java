package com.banistmo.certification.tasks;

import com.banistmo.certification.expections.ElementoNoEncontradoExcepcion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static com.banistmo.certification.userinterfaces.PaginaPrincipalEmpresas.IMG_BANISTMO;
import static com.banistmo.certification.utils.Constantes.URI;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirPortal implements Task {

    private String url;

    public AbrirPortal(String url) {
        this.url = url;
    }

    public static Performable WebBanistmo() {
        return instrumented(AbrirPortal.class, URI);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(url));

        try {
            if (!IMG_BANISTMO.resolveFor(actor).isVisible()) {
                throw new ElementoNoEncontradoExcepcion(ElementoNoEncontradoExcepcion.ELEENTO_NO_ENCONTRADO);
            }
        } catch (ElementoNoEncontradoExcepcion e) {
            throw new ElementoNoEncontradoExcepcion(ElementoNoEncontradoExcepcion.ELEENTO_NO_ENCONTRADO);
        }
    }
}
