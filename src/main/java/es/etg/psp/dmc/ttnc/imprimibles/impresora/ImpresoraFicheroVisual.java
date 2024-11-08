package es.etg.psp.dmc.ttnc.imprimibles.impresora;

import es.etg.psp.dmc.ttnc.util.Escritura;
import static es.etg.psp.dmc.ttnc.util.Variables.*;

public class ImpresoraFicheroVisual extends Impresora implements Escritura{
    @Override
    public void imprimir(String contenido) {
        System.out.print(contenido);
        Escritura.escribir(rutaFichero, contenido);
    }

}
