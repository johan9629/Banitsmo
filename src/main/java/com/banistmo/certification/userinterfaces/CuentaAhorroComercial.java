package com.banistmo.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CuentaAhorroComercial {

    public static final Target LNK_DOCUMENTOS = Target.the("Link documentos")
            .located(By.xpath("//li/a[contains(text(),'Documentos')]"));
    public static final Target IMG_PDF = Target.the("imagen pdf")
            .located(By.xpath("//*[@id=\"tab5\"]/table/tbody/tr/td[2]/a"));


}
