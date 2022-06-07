/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.util.Scanner;

/**
 *
 * @author borba
 */
public class JavaApplication19 {

     public static void maior(int um, int dois, int tres){
        
if(um>dois&&um>tres){
    System.out.println("O maior valor é "+um);}
if(um<dois&&um<tres){
    System.out.println("O menor valor é "+um);}
if(dois>um&&dois>tres){
    System.out.println("O maior valor é "+dois);}
if(dois<um&&dois<tres){
    System.out.println("O menor valor é "+dois);}
if(tres>dois&&tres>um){
    System.out.println("O maior valor é "+tres);}
if(tres<dois&&tres<um){
    System.out.println("O menor valor é "+um);}

}
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int um,dois,tres;
        System.out.println("Exibir maior e menor valor: ");
        System.out.println("Insira três números inteiros: "
                + "1: ");
        um=in.nextInt();
        System.out.println("2: ");
        dois=in.nextInt();
        System.out.println("3: ");
        tres=in.nextInt();
        maior(um,dois,tres);
    }
    
}
