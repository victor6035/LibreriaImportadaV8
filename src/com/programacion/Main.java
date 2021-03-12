package com.programacion;

import libreria.DatosDeEntrada;
import libreria.DatosDeSalida;
import libreria.FactoriaDeEntrada;
import libreria.FactoriasSalida;

public class Main {

    public static void main(String[] args) {

        DatosDeEntrada unaConsola = FactoriaDeEntrada.get(1);
        unaConsola.intruducirDatos();

        DatosDeSalida unaventana = FactoriasSalida.getProductoSalida(2);
        unaventana.visualizar();








    }

}
