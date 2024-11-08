package es.etg.psp.dmc.ttnc.imprimibles.fichero;
import es.etg.psp.dmc.ttnc.imprimibles.TipoFichero;

public interface FicheroFactory {

    public static final String ENLACE_NOMBRE_EXTENSION = ".";
    public static final String HTML = "html";
    public static final String XML = "xml";
    public static final String RTF = "rtf";
    public static final String TXT = "txt";
    public static final String MD = "md";

    static String definir(TipoFichero tipo, String rutaFichero){
        if (tipo == TipoFichero.MD) {
            return rutaFichero + ENLACE_NOMBRE_EXTENSION + MD;
        } else if (tipo == TipoFichero.TXT){
            return rutaFichero + ENLACE_NOMBRE_EXTENSION + TXT;
        } else if (tipo == TipoFichero.RTF) {
            return rutaFichero + ENLACE_NOMBRE_EXTENSION + RTF;
        } else if (tipo == TipoFichero.XML) {
            return rutaFichero + ENLACE_NOMBRE_EXTENSION + XML;
        } else {
            return rutaFichero + ENLACE_NOMBRE_EXTENSION + HTML;
        }
    }

}
