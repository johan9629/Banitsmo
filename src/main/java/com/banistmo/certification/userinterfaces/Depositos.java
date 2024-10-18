package com.banistmo.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Depositos {

    public static final Target LNK_CUENTA_AHORRO_COMERCIAL = Target.the("Link depositos")
            .located(By.xpath("//h2/a[@title='Cuenta de Ahorro Comercial']"));
}
