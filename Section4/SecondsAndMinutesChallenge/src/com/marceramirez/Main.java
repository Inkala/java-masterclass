package com.marceramirez;


public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        System.out.println(getDurationString(16342L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long remMinutes = minutes % 60;
        String hoursString = hours < 10 ? "0" + hours + "h" : hours + "h";
        String minutesString = remMinutes < 10 ? "0" + remMinutes + "m" : remMinutes + "m";
        String secondsString = seconds < 10 ? "0" + seconds + "s" : seconds + "s";

        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remSeconds = seconds % 60;

        return getDurationString(minutes, remSeconds);
    }

}
