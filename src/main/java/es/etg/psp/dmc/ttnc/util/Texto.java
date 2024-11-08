package es.etg.psp.dmc.ttnc.util;

import es.etg.psp.dmc.ttnc.imprimibles.TipoFichero;
import es.etg.psp.dmc.ttnc.imprimibles.TipoImpresion;

public class Texto {
    public static final TipoImpresion TIPO_IMPRESORA = TipoImpresion.FICHERO;
    public static final TipoFichero TIPO_FICHERO = TipoFichero.MD;

    private static final String MARCA_AQUI = "./";
    private static final String MARCA_ATRAS = "../";
    private static final String MARCA_NOMBRE_FICHERO = "informacion";

    public static final String SEPARADOR = ";;";
    public static final String VACIO = "";
    public static final String ESPACIO_EN_BLANCO = " ";
    public static final String MSG_ERROR_ENCONTRAR_F = "NO SE HA ENCONTRADO EL FICHERO";
    public static final String MSG_ERROR_STR_ENTERO = "HA OCURRIDO UN ERROR AL PASAR A ENTERO";
    public static final String CERO = "0";
    public static final String MSG_ERR_THREAD = "SE HA INTERRUMPIDO EL THREAD";
    public static final String TOTAL = "TOTAL";
    public static final String PREFIJO = "B";
    public static final String DOS_PUNTOS = ":";
    public static final String COMANDO1 = "date";
    public static final String PARAMETRO_1_1 = "+%d/%m/%Y %H:%M:%S";
    public static final String[] PARAMETROS_1 = {PARAMETRO_1_1};
    public static final String COMANDO2 = "java";
    public static final String PARAMETRO_2_1 = "es.etg.psp.dmc.ttnc.brc.ProgramaBarca";
    public static final String[] PARAMETROS_2 = {PARAMETRO_2_1};
    public static final String RUTA_FICHERO = MARCA_AQUI + MARCA_ATRAS + MARCA_ATRAS + MARCA_NOMBRE_FICHERO;
    public static final String SALTO_DE_LINEA = "\n";
	public static final String MSG_ERROR = "SE HA PRODUCIDO UN ERROR AL EJECUTAR EL COMANDO";
    public static final String MSG_ERROR_ESCRITURA_FICHERO = "HA OCURRIDO UN ERROR AL ESCRIBIR EL FICHERO: ";
    public static final String MSG_ERROR_VACIAR = "HA OCURRIDO UN ERROR AL VACIAR EL FICHERO";

    public static final int INICIO_BARCAS_TOTAL = 1;
    public static final int VALOR_CERO = 0;
    public static final int VALOR_UNO = 1;
    public static final int VALOR_FINAL = 50;
    public static final int MAX_TIEMPO_EJEC_MILISEC = 6000;
    public static final int MIN_TIEMPO_EJEC_MILISEC = 2000;
    public static final int MAX_PASAJEROS = 100;
    public static final int MIN_PASAJEROS = 0;
    public static final int VALOR_NUMERICO_COMANDO = 1;
    public static final int MINIMO_CON_DOS_CIFRAS = 10;
    public static final int VALOR_INICIAL = 0;
}
