package com.banistmo.certification.expections;

public class ConexionExcepcion extends RuntimeException {
    public static final String CONEXION_FALLIDA = "No se pudo establecer conexión a Banistmo, por favor valide ";

    public ConexionExcepcion(String message) {
        super(message);
    }
}
