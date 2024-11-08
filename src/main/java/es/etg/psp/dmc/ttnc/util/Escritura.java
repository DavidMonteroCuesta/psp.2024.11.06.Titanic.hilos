package es.etg.psp.dmc.ttnc.util;

import java.io.FileOutputStream;
import java.io.IOException;
import static es.etg.psp.dmc.ttnc.util.Texto.*;

public interface Escritura {

    static void escribir(String rutaFichero, StringBuilder output) {
        escribir(rutaFichero, output.toString());
    }

    static void escribir(String rutaFichero, String contenido) {
        try (FileOutputStream fos = new FileOutputStream(rutaFichero, true)) {
            String datos = contenido;
            byte[] byteArray = datos.getBytes();
            fos.write(byteArray);
        } catch (IOException e) {
            System.err.println(MSG_ERROR_ESCRITURA_FICHERO + e.getMessage());
        }
    }

    static void vaciar(String rutaFichero) {
        try (FileOutputStream fos = new FileOutputStream(rutaFichero)) { 
            
        } catch (IOException e) {
            System.err.println(MSG_ERROR_VACIAR + e.getMessage());
        }
    }
}
