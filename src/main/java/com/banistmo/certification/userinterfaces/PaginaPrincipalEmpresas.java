package com.banistmo.certification.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipalEmpresas {
    public static final Target BTN_ACEPTAR_COOKIES = Target.the("Boton aceptar cookies")
            .located(By.id("btn-aceptar-cookies"));
    public static final Target IMG_BANISTMO = Target.the("Imagen Banistmo")
            .located(By.xpath("//img[@src='/wps/wcm/connect/www.banistmo.com11237/f0f014f2-9c5f-44c4-b47a-114aa6f7d6ad/Logo-Banistmo.webp?MOD=AJPERES&CACHEID=ROOTWORKSPACE.Z18_7O9GHBG0O0M4A0Q3JGMS8408B6-f0f014f2-9c5f-44c4-b47a-114aa6f7d6ad-oIUWl0t']"));
    public static final Target LNK_EMPRESAS = Target.the("Link empresas")
            .located(By.xpath("//li/a[contains(text(),'Empresas')]"));
    public static final Target LNK_PRODUC_SERVIC = Target.the("Link productos y servicios")
            .located(By.xpath("//li/a[contains(text(),'Productos & Servicios')]"));
    public static final Target LNK_DEPOSITOS = Target.the("Link depositos")
            .located(By.xpath("//li/a[contains(text(),'Depósitos')]"));

}
