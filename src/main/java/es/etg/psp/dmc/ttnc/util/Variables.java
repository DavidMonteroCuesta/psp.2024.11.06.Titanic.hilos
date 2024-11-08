package es.etg.psp.dmc.ttnc.util;

import es.etg.psp.dmc.ttnc.comandos.Comando;
import es.etg.psp.dmc.ttnc.imprimibles.fichero.FicheroFactory;
import es.etg.psp.dmc.ttnc.imprimibles.impresora.Impresora;
import es.etg.psp.dmc.ttnc.imprimibles.impresora.ImpresoraFactory;
import static es.etg.psp.dmc.ttnc.util.Texto.*;

public class Variables {
    public static final Impresora impresora = ImpresoraFactory.definir(TIPO_IMPRESORA);
    public static final Comando comandosFecha = new Comando(COMANDO1, PARAMETROS_1);
    public static final Comando comandosBarca = new Comando(COMANDO2, PARAMETROS_2);
    public static final String rutaFichero = FicheroFactory.definir(TIPO_FICHERO, RUTA_FICHERO);
}
