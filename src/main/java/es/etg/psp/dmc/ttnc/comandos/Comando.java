package es.etg.psp.dmc.ttnc.comandos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static es.etg.psp.dmc.ttnc.util.Texto.*;

public class Comando{
    private String nombre = ESPACIO_EN_BLANCO;
    private String[] parametros;
    
    public Comando(String nombre, String[] parametros) {
        this.nombre = nombre;
        this.parametros = parametros;
    }

    public String ejecutar(){
        String salida = VACIO;
        try {
            Process process = Runtime.getRuntime().exec(obtenerComando());

            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append(SALTO_DE_LINEA);
            }

            int exitVal = process.waitFor();
            if (exitVal != 0) {
                System.out.println(MSG_ERROR);
                System.exit(1);
            }
            salida = output.toString();

        } catch (IOException | InterruptedException e) {
            System.exit(34);
        }
        return salida;
    }

    private String[] obtenerComando(){
        String[] comando = new String[this.parametros.length + VALOR_NUMERICO_COMANDO];
        comando[VALOR_CERO] = this.nombre;
        for (int i = VALOR_NUMERICO_COMANDO; i <= parametros.length; i++) {
            comando[i] = parametros[i-VALOR_NUMERICO_COMANDO];
        }
        return comando;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getParametros() {
        return parametros;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setParametros(String[] parametros) {
        this.parametros = parametros;
    }

}
