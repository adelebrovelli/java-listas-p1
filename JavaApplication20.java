/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

import java.util.Scanner;

// este programa calcula a média simples e o conceito de um aluno.

public class JavaApplication20 {

    public static char conceito(double media) {
        char conceito;
        if (media < 5) {
            conceito = 'D';

        } else if (media >= 5 && media < 7) {
            conceito = 'C';

        } else if (media >= 7 && media < 9) {
            conceito = 'B';
        } else {
            conceito = 'A';
        } 
        return conceito;
    }
    
    public static void media(double nota1, double nota2){
        double media=(nota1+nota2)/2;
        char conc=conceito(media);
        System.out.println("A média é "+media+" e o conceito é "+conc);
        
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2;
        int cont=0;
        while(cont<60){
            cont=cont+1;
        System.out.println("Insira a primeira nota do aluno "+cont+":");
        nota1=in.nextDouble();
        while (nota1<=0||nota1>10){
            System.out.println("A nota deve ser de 0 a 10. Insira novamente: ");
        nota1=in.nextDouble();
        }
        System.out.println("Insira a segunda nota do aluno "+cont+":");
        nota2=in.nextDouble();
        while (nota2<=0||nota2>10){
            System.out.println("A nota deve ser de 0 a 10. Insira novamente: ");
        nota2=in.nextDouble();
        } 
        media(nota1,nota2);
        
        
        }
        
        
        
        
        
        
        
        }
    }


