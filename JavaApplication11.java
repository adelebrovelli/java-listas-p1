package javaapplication11;

import java.util.Scanner;

public class JavaApplication11 {

    public static double cubo(double x) {
        double vol;
        vol = x * x * x;
        return vol;
    }

    public static double esfera(double r) {
        double vol;
        vol = (4 * Math.PI * Math.pow(r, 3)) / 3;
        return vol;
    }

    public static double cilindro(double a, double r) {
        double vol;
        vol = Math.PI * Math.pow(r, 2) * a;
        return vol;
    }

    public static double paralp(double c, double l, double a) {
        double vol;
        vol = c * l * a;
        return vol;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double forma, vol;
        char resp;

        do {
            System.out.println("Calcule o volume da from geométrica desejada. Selecione: ");
            System.out.println("1. Cubo "
                    + "2. Esfera "
                    + "3. Cilindro "
                    + "4. Paralelepípedo ");
            forma = in.nextInt();
            while (forma != 1 && forma != 2 && forma != 3 && forma != 4) {
                System.out.println("Digite uma forma de 1 a 4: ");
                forma = in.nextInt();
            }
            if(forma==1){
                System.out.println("Insira o lado do cubo: ");
            double lado=in.nextDouble();
            vol=cubo(lado);
                System.out.println("O volume do cubo é: "+vol);
            }
            if(forma==2){
                System.out.println("Insira o raio da esfera: ");
                double raio=in.nextDouble();
                vol=esfera(raio);
                System.out.println("O volume da esfera é: "+vol);
            }
            if(forma==3){
                System.out.println("Insira a altura do cilindro: ");
               double altura=in.nextDouble();
                System.out.println("Insira o raio da base do cilindro: ");
                double raio=in.nextDouble();
                vol=cilindro(altura, raio);
                System.out.println("O volume do cilindro é: "+vol);
            }
            if(forma==4){
                System.out.println("Insira a altura do paralelepípedo: ");
               double a=in.nextDouble();
                System.out.println("Insira a largura do paralelepípedo: ");
                double l=in.nextDouble();
                System.out.println("Insira o comprimento do paralelepípedo: ");
                double c=in.nextDouble();
                vol=paralp(a,l,c);
                System.out.println("O volume do paralelepípedo é: "+vol);
            }
            System.out.println("Deseja calcular outro volume? Digite 's' para sim ou 'n' para não");
            resp = in.next().charAt(0);
            resp = Character.toLowerCase(resp);
            while (resp != 's' && resp != 'n') {
                System.out.println("Digite 's' ou 'n': ");
                resp = in.next().charAt(0);
                resp = Character.toLowerCase(resp);
            }
        } while (resp == 's');
        System.out.println("Obrigada por testar!");
    }

}
