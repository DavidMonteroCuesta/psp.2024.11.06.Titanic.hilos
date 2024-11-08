package es.etg.psp.dmc.ttnc;

import es.etg.psp.dmc.ttnc.gestor.GestorTitanic;
import es.etg.psp.dmc.ttnc.imprimibles.fichero.FicheroFactory;
import es.etg.psp.dmc.ttnc.imprimibles.impresora.ImpresoraFactory;
import es.etg.psp.dmc.ttnc.util.Escritura;
import es.etg.psp.dmc.ttnc.util.Lectura;
import static es.etg.psp.dmc.ttnc.util.Texto.*;
import static es.etg.psp.dmc.ttnc.util.Variables.*;

import es.etg.psp.dmc.ttnc.brc.BarcaHilo;

public class Titanic implements Escritura, Lectura, ImpresoraFactory, FicheroFactory{

    public static void main(String[] args) throws InterruptedException {
        Escritura.vaciar(rutaFichero);
        impresora.imprimir(comandosFecha.ejecutar());
        Thread[] barcas = new Thread[VALOR_FINAL - VALOR_INICIAL];

        for (int i = VALOR_INICIAL; i < VALOR_FINAL; i++) {
            barcas[i - VALOR_INICIAL] = new Thread(new BarcaHilo());
            barcas[i - VALOR_INICIAL].start();
        }

        for (Thread barca : barcas)
            barca.join();
        impresora.imprimir(TOTAL + DOS_PUNTOS + ESPACIO_EN_BLANCO + String.valueOf(GestorTitanic.contarPersonas(rutaFichero)) + SALTO_DE_LINEA);
    }
}