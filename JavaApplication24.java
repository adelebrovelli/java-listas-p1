/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication24;

import java.util.Scanner;


public class JavaApplication24 {

    public static boolean bi(int ano) {
        if (ano % 4 == 0) {
            if (ano % 100 != 0) {
                return true;
            }
        }
        if (ano % 400 == 0) {
            return true;
        }

        return false;
    }

    public static boolean valido(int dia, int mes, int ano) {
        boolean bissexto = bi(ano);
        boolean valid;
        if (dia > 31 || dia < 1 || mes < 1 || mes > 12 || ano > 2399 || ano < 1900) {

            valid = false;
        } else if ((dia == 31) && (mes == 4 || mes == 6 || mes == 9 || mes == 11)) {
            valid = false;
        } else if (bissexto == false && mes == 2 && dia == 29) {
            valid = false;
        } else {
            valid = true;

        }
        return valid;
    }

    public static int criterioC(int mes) {
        int x;
        switch (mes) {
            case 1:
                x = 0;
                break;
            case 2:
                x = 3;
                break;
            case 3:
                x = 3;
                break;
            case 4:
                x = 6;
                break;
            case 5:
                x = 1;
                break;
            case 6:
                x = 4;
                break;
            case 7:
                x = 6;
                break;
            case 8:
                x = 2;
                break;
            case 9:
                x = 5;
                break;
            case 10:
                x = 0;
                break;
            case 11:
                x = 3;
                break;
            case 12:
                x = 5;
                break;
            default:
                x = 0;
                break;
        }
        return x;
    }

    public static String mess(int mes) {
        String x;
        switch (mes) {
            case 1:
                x = " Janeiro ";
                break;
            case 2:
                x = " Fevereiro ";
                break;
            case 3:
                x = " Março ";
                break;
            case 4:
                x = " Abril ";
                break;
            case 5:
                x = " Maio ";
                break;
            case 6:
                x = " Junho ";
                break;
            case 7:
                x = " Julho ";
                break;
            case 8:
                x = " Agosto ";
                break;
            case 9:
                x = " Setembro ";
                break;
            case 10:
                x = " Outubro ";
                break;
            case 11:
                x = " Novembro ";
                break;
            case 12:
                x = " Dezembro ";
                break;
            default:
                x = " ";
                break;
        }
        return x;
    }

    public static int ds(int dia, int mes, int ano) {
        int a, b, c, d, ds;
        a = ano - 1900;
        if (bi(ano) == true && (dia <= 29 || mes == 2 || mes == 1)) {
            b = (a / 4) - 1;
        } else {
            b = a / 4;
        }
        c = criterioC(mes);
        d = dia - 1;
        ds = (a + b + c + d) % 7;
        return ds;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, ano;
        char resp;
        do {
            System.out.println("Irei te dizer o dia da semana da data inserida. Insira primeiro o dia desejado: ");
            dia = in.nextInt();
            System.out.println("Insira o mês: ");
            mes = in.nextInt();
            System.out.println("Insira o ano: ");
            ano = in.nextInt();
            boolean teste = valido(dia, mes, ano);
            while (teste == false) {
                System.out.println("Insira uma data válida. Insira primeiro o dia: ");
                dia = in.nextInt();
                System.out.println("Insira o mês: ");
                mes = in.nextInt();
                System.out.println("Insira o ano: ");
                ano = in.nextInt();
            }

            if (ds(dia, mes, ano) == 0) {
                System.out.println("Você nasceu em " + dia + " de" + mess(mes) + "de " + ano + ". Esta data foi segunda-feira.");
            }
            if (ds(dia, mes, ano) == 1) {
                System.out.println("Você nasceu em " + dia + " de" + mess(mes) + "de " + ano + ". Esta data foi terça-feira.");
            }
            if (ds(dia, mes, ano) == 2) {
                System.out.println("Você nasceu em " + dia + " de" + mess(mes) + "de " + ano + ". Esta data foi quarta-feira.");
            }
            if (ds(dia, mes, ano) == 3) {
                System.out.println("Você nasceu em " + dia + " de" + mess(mes) + "de " + ano + ". Esta data foi quinta-feira.");
            }
            if (ds(dia, mes, ano) == 4) {
                System.out.println("Você nasceu em " + dia + " de" + mess(mes) + "de " + ano + ". Esta data foi sexta-feira.");
            }
            if (ds(dia, mes, ano) == 5) {
                System.out.println("Você nasceu em " + dia + " de" + mess(mes) + "de " + ano + ". Esta data foi sábado.");
            }
            if (ds(dia, mes, ano) == 6) {
                System.out.println("Você nasceu em " + dia + " de" + mess(mes) + "de " + ano + ". Esta data foi domingo.");
            }
            System.out.println("Você deseja inserir outra data? Digite 's' para sim e 'n' para não: ");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while (resp != 'n' && resp != 's') {
                System.out.println("Você só tem duas opções: 's' ou 'n', insira de novo: ");
                resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }

        } while (resp == 's');
    }

}
