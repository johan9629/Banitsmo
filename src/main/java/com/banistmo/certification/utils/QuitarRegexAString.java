package com.banistmo.certification.utils;

public class QuitarRegexAString {

    public static String StringRegex(String texto){
        String textoRetorado = texto.replaceAll("\\r\\n.*", "");
        return textoRetorado;
    }
}
