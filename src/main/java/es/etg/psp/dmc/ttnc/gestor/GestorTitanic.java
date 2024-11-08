package es.etg.psp.dmc.ttnc.gestor;

import java.io.File;

import es.etg.psp.dmc.ttnc.util.Lectura;
import es.etg.psp.dmc.ttnc.util.Escritura;
import static es.etg.psp.dmc.ttnc.util.Texto.*;

public class GestorTitanic implements Escritura, Lectura{

    public static int contarPersonas(String rutaFichero){
        int total = VALOR_CERO;
        String contenido[] = Lectura.leer(new File(rutaFichero)).split(SEPARADOR);
        
        try {
            for (int i = INICIO_BARCAS_TOTAL; i <= VALOR_FINAL; i++) {
                total += Integer.parseInt(contenido[i].substring(contenido[i].length() - 2));
            }
        } catch (Exception e) {
            System.err.println(MSG_ERROR_STR_ENTERO);
        }

        return total;
    }
}
