package com.shellcore.java.timeHelper.utils;

/**
 * Created by Cesar. 17/04/2017.
 */
public class TimeHelper {

    // Constantes
    private static final int SECONDS = 1;
    private static final int MINUTES = 2;
    private static final int HOURS = 3;

    // Variables
    private long seconds;

    public TimeHelper(int seconds) {
        this.seconds = seconds;
    }

    /**
     * Función para calcular los minutos que se encuentran en los segundos almacenados
     * @return Número de minutos
     */
    public String inMinutes() {
        long numMinutos = seconds / 60;
        return formattedValue(numMinutos, MINUTES);
    }

    /**
     * Función para calcular las horas que se encuentran en los segundos almacenados
     * @return Número de horas
     */
    public String inHours() {
        long numHoras = seconds / 3600;
        return formattedValue(numHoras, HOURS);
    }

    /**
     * Función para imprimir las horas, minutos y segundos almacenados en la variable global.
     * @return Cantidad de horas, minutos y segundos
     */
    @Override
    public String toString() {
        long numHoras = seconds / 3600; // Número de segundos en una hora
        long numMinutosRestantes = (seconds % 3600) / 60; // Numero de segundos restantes, pasado a segundos
        long numSegundosRestantes = seconds % 60;
        return formattedValue(numHoras, HOURS)
                + ", " + formattedValue(numMinutosRestantes, MINUTES)
                + ", " + formattedValue(numSegundosRestantes, SECONDS);
    }

    private String formattedValue(long value, int type) {
        switch(type) {
            case SECONDS:
                if (value == 1) {
                    return "1 second";
                }
                return "" + value + " seconds";
            case MINUTES:
                if (value == 1) {
                    return "1 minute";
                }
                return "" + value + " minutes";
            case HOURS:
                if (value == 1) {
                    return "1 hour";
                }
                return "" + value + " hours";
            default:
                return "";
        }
    }


}
