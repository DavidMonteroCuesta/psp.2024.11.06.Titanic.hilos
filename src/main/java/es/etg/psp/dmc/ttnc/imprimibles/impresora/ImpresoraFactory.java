package es.etg.psp.dmc.ttnc.imprimibles.impresora;

import es.etg.psp.dmc.ttnc.imprimibles.TipoImpresion;

public interface ImpresoraFactory {

    static Impresora definir(TipoImpresion tipo){
        if (tipo == TipoImpresion.FICHERO)
            return new ImpresoraFichero();
        else if (tipo == TipoImpresion.VISUAL)
            return new ImpresoraVisual();
        else
            return new ImpresoraFicheroVisual();
    }

}