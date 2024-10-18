package com.banistmo.certification.questions;

import com.banistmo.certification.utils.QuitarRegexAString;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.net.URL;
import java.util.Set;

public class VerificarDocumentoQuestion implements Question<Boolean> {
    private String expectedText;

    public VerificarDocumentoQuestion(String expectedText) {
        this.expectedText = expectedText;
    }

    public static VerificarDocumentoQuestion contieneTexto(String expectedText) {
        return new VerificarDocumentoQuestion(expectedText);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String originalWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();

        for (String window : windows) {
            if (!window.equals(originalWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }

        try {
            URL urlPDF = new URL(driver.getCurrentUrl());
            PDDocument documento = PDDocument.load(urlPDF.openStream());
            PDFTextStripper pdf = new PDFTextStripper();
            pdf.setStartPage(1);
            pdf.setEndPage(1);
            String textPDF = pdf.getText(documento);
            String TextoFinal = QuitarRegexAString.StringRegex(textPDF);
            documento.close();
            return TextoFinal.contains(expectedText);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        } finally {
            driver.close();
            driver.switchTo().window(originalWindow);
        }
    }
}
