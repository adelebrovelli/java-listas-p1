/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication15;

import java.util.Scanner;

public class JavaApplication15 {

    public static boolean tri(double a, double b, double c) {
        boolean tri = a < b + c && b < a + c && c < a + b;
        return tri;
    }

    public static int ver(double a, double b, double c) {
        if (a == b && a == c) {
            return 1;
        } else if (a != b && a != c && b != c) {
            return 2;
        } else {
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        int veri;
        boolean tria;
        char resp;
        do {
            System.out.println("Verificando se é um triângulo e qual o tipo de acordo com as retas: ");
            System.out.println("Insira o valor da reta 1: ");
            a = in.nextDouble();
            while (a <= 0) {
                System.out.println("Insira o valor da reta 1 acima de zero: ");
                a = in.nextDouble();
            }

            System.out.println("Insira o valor da reta 2: ");
            b = in.nextDouble();
            while (b <= 0) {
                System.out.println("Insira o valor da reta 2 acima de zero: ");
                b = in.nextDouble();
            }
            System.out.println("Insira o valor da reta 3: ");
            c = in.nextDouble();
            while (c <= 0) {
                System.out.println("Insira o valor da reta 3 acima de zero: ");
                c = in.nextDouble();
            }
            tria = tri(a, b, c);
            if (tria == true) {
                veri = ver(a, b, c);
                if (veri == 1) {
                    System.out.println("O triângulo é equilátero. ");
                }
                if (veri == 2) {
                    System.out.println("O triângulo é escaleno. ");
                }
                if (veri == 3) {
                    System.out.println("O triângulo é isoscéles. ");
                }

            } else {
                System.out.println("Não é possível formar um triângulo. ");
            }
            System.out.println("Deseja inserir outro triângulo? Digite 's' para sim e 'n' para não");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while (resp != 's' && resp != 'n') {
                System.out.println("Insira um comando válido: ");
                resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }
        } while (resp == 's');
        System.out.println("Obrigada por testar!");
    }

}
