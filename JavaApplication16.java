/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication16;

import java.util.Scanner;

public class JavaApplication16 {


    public static double km(double m) {
        double novoV = m / 1000;
        return novoV;
    }

    public static double hm(double m) {
        double novoV = m / 100;
        return novoV;
    }

    public static double dam(double m) {
        double novoV = m / 10;
        return novoV;
    }

    public static double dm(double m) {
        double novoV = m * 10;
        return novoV;
    }

    public static double cm(double m) {
        double novoV = m * 100;
        return novoV;
    }

    public static double mm(double m) {
        double novoV = m * 1000;
        return novoV;
    }

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double m, novoV;
        int menu;
        char resp;
        do {
            System.out.println("Conversor de medidas de metros: ");
            System.out.println("Insira o valor em metros: ");
            m = in.nextDouble();

            System.out.println("Selecione em qual medida converter a unidade de metros: ");
            System.out.println("1-quilômetro "
                    + "2-hectômetro "
                    + "3-decâmetro "
                    + "4-decímetro "
                    + "5-centímetros "
                    + " 6-milímetros");
            menu = in.nextInt();
            while (menu != 1 && menu != 2 && menu != 3 && menu != 4 && menu != 5 && menu!=6) {
                System.out.println("Número inválido. Insira novamente");
                menu = in.nextInt();
            }
            switch (menu) {
                case 1 -> {
                    novoV = km(m);
                    System.out.println("O valor em kilometros é: " + novoV);
                }
                case 2 -> {
                    novoV = hm(m);
                    System.out.println("O valor em hectomêtros é: " + novoV);
                }
                case 3 -> {
                    novoV = dam(m);
                    System.out.println("O valor em decâmetros é: " + novoV);
                }
                case 4 -> {
                    novoV = dm(m);
                    System.out.println("O valor em decímetros é: " + novoV);
                }
                case 5 -> {
                    novoV = cm(m);
                    System.out.println("O valor em centímetros é: " + novoV);
                }
                case 6 -> {
                    novoV = mm(m);
                    System.out.println("O valor em milímetros é: " + novoV);
                }
            }
            System.out.println("Deseja inserir outro metro a ser convertido? s para sim e n para não: ");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while (resp != 's' && resp != 'n') {
                System.out.println("Digite S ou N: ");
                resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }
        } while (resp == 's');
            System.out.println("Obrigada por testar!");
            
        }

    }
