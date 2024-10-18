package com.banistmo.certification.tasks;

import com.banistmo.certification.interactions.NavegarDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DescargarPDF implements Task {

    public static Performable descargarPDF() {
        return Tasks.instrumented(DescargarPDF.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
            NavegarDocumento.navegarDocumento()
    );
    }
}
