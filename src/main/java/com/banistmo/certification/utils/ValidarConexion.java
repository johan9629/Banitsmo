package com.banistmo.certification.utils;

import com.banistmo.certification.expections.ConexionExcepcion;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ValidarConexion {

    private static final Logger LOGGER = LogManager.getLogger(ValidarConexion.class.getName());
    private URL url;

    public ValidarConexion() {
    }

    public ValidarConexion(URL url) {
        this.url = url;
    }

    public void conexionBanistmo() {
        try {
            URL urlConexion = new URL(String.valueOf(url));
            HttpURLConnection huc = (HttpURLConnection) urlConexion.openConnection();
            huc.connect();
        } catch (IOException e) {
            LOGGER.error("No hay conexion");
            throw new ConexionExcepcion(ConexionExcepcion.CONEXION_FALLIDA);
        }
    }
}
