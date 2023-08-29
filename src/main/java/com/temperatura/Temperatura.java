package com.temperatura;

public class Temperatura {
    private double temp;

    public Temperatura(double temp) {
        this.temp = temp;
    }

    public void menu() {
        System.out.println("Conversor de temperatura.\n");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("3 - Celsius para Kelvin");
        System.out.println("4 - Kelvin para Celsius");
        System.out.println("5 - Celsius para Réaumur");
        System.out.println("6 - Réaumur para Celsius");
        System.out.println("7 - Kelvin para Rankine");
        System.out.println("8 - Rankine para Kelvin");
    }

    //1 - Celsius para Fahrenhei
    public double CelsiusFahrenheit() {
        System.out.println("Convertendo de Celsius para Fahrenheit");
        temp = (9 * (temp/5) + 32);
        System.out.println("A temperatura em Fahrenheit eh: " + temp + "F");

        return temp;
    }

    //2 - Fahrenheit para Celsius
    public double fahrenheitCelsius() {
        System.out.println("Convertendo de Fahrenheit para Celsius");
        temp = ((temp - 32) * 5/9);
        System.out.println("A temperatura em Celsius eh: " + temp + "C");

        return temp;
    }

    //3 - Celsius para Kelvin
    public double CelsiusKelvin() {
        System.out.println("Convertendo de Celsius para Kelvin");
        temp = temp + 273.15;
        System.out.println("A temperatura em Kelvin eh: " + temp + "K");

        return temp;
    }

    //4 - Kelvin para Celsius
    public double kelvinCelsius() {
        System.out.println("Convertendo de Kelvin para Celsius");
        temp = temp - 273.15;
        System.out.println("A temperatura em Celsius eh: " + temp + "C");

        return temp;
    }

    //5 - Celsius para Réaumur
    public double CelsiusReaumur() {
        System.out.println("Convertendo de Celsius para Réaumur");
        temp = temp * (4/5);
        System.out.println("A temperatura em Réamur eh: " + temp + "Ré");

        return temp;
    }

    //6 - Réaumur para Celsius
    public double reaumurCelsius() {
        System.out.println("Convertendo de Réamur para Celsius");
        temp = temp * (5/4);
        System.out.println("A temperatura em Celsius eh: " + temp + "C");

        return temp;
    }

    //7 - Kelvin para Rankine
    public double kelvinRankine() {
        System.out.println("Convertendo de Kelvin para Rankine");
        temp = temp * 1.8;
        System.out.println("A temperatura em Rankine eh: " + temp + "Ra");

        return temp;
    }

    //8 - Rankine para Kelvin
    public double rankineKelvin() {
        System.out.println("Convertendo de Rankine para Kelvin");
        temp = temp / 1.8;
        System.out.println("A temperatura em Kelvin eh: " + temp + "K");

        return temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
}
