package com.guatex.impresiones.datos;

public class Utils {

    public static String quitaNulo(String txt) {
        return txt == null ? "" : txt.trim();
    }
}
