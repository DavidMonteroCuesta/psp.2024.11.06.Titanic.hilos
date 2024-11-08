package es.etg.psp.dmc.ttnc.brc;

import static es.etg.psp.dmc.ttnc.util.Texto.*;
import es.etg.psp.dmc.ttnc.util.Lectura;

import static es.etg.psp.dmc.ttnc.util.Variables.*;

import java.io.File;

public class BarcaHilo implements Lectura, Runnable{    
    public void run() {
        String respuesta = comandosBarca.ejecutar();
        synchronized(this){
            int numeroLinea = Lectura.contarLineas(new File(rutaFichero));
            impresora.imprimir(PREFIJO + ((numeroLinea < MINIMO_CON_DOS_CIFRAS)? CERO + numeroLinea : numeroLinea)+ DOS_PUNTOS + ESPACIO_EN_BLANCO + respuesta);
        }
        //imprimirBarca(respuesta);
    }

    synchronized private void imprimirBarca(String respuesta){
        int numeroLinea = Lectura.contarLineas(new File(rutaFichero));
        impresora.imprimir(PREFIJO + ((numeroLinea < MINIMO_CON_DOS_CIFRAS)? CERO + numeroLinea : numeroLinea)+ DOS_PUNTOS + ESPACIO_EN_BLANCO + respuesta);
    }
}
