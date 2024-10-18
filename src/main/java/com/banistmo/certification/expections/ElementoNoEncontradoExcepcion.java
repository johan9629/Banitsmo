package com.banistmo.certification.expections;

public class ElementoNoEncontradoExcepcion extends RuntimeException {
    public static final String ELEENTO_NO_ENCONTRADO = "Elemento no visible, por favor validar";

    public ElementoNoEncontradoExcepcion(String message) {
        super(message);
    }
}
