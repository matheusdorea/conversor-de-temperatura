package com.temperatura;

import java.util.Scanner;

public class Main {
    public static Temperatura temp = new Temperatura(0);
    public static void main(String[] args) {
        //criando variáveis de critério de saída e escolha de operação
        int escolha;
        char opt;
        Scanner scan = new Scanner(System.in);

        //laço infinito
        do {
            //escrevendo menu na tela
            temp.menu();

            //pegando escolha
            escolha = scan.nextInt();

            //pegando temperatura

            System.out.println("Digite a temperatura desejada");
            temp.setTemp(scan.nextDouble());

            //definindo ações para cada escolha
            switch (escolha) {
                //Celsius para Fahrenheit
                case 1:
                    temp.CelsiusFahrenheit();
                    break;

                //Fahrenheit para Celsius
                case 2:
                    temp.fahrenheitCelsius();
                    break;

                //Celsius para Kelvin
                case 3: 
                    temp.CelsiusKelvin();
                    break;

                //Kelvin para Celsius
                case 4: 
                    temp.kelvinCelsius();
                    break;

                //Celsius para Réaumur
                case 5: 
                    temp.CelsiusReaumur();
                    break;

                //Réaumur para Celsius
                case 6: 
                    temp.reaumurCelsius();
                    break;

                //Kelvin para Rankine
                case 7:
                    temp.kelvinRankine();
                    break;

                //Rankine para Kelvin
                case 8: 
                    temp.rankineKelvin();
                    break;
            
                default:
                System.out.println("opção inválida");
                    break;
            }

            //critério de saída do programa
            System.out.println("Deseja sair do programa? (y)");
            opt = scan.next().charAt(0);
            if (opt == 'y') {
                break;
            }
        } while (true);
    }
}