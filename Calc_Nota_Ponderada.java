package com.mycompany.calc_nota_ponderada;

import java.util.Scanner;

public class Calc_Nota_Ponderada {

    public static void main(String[] args) {
        
        double a, b, resFinal;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a nota do 1º Bimestre \n >");
        a = input.nextDouble();
        
        System.out.print("Insira a nota do 2º Bimestre \n >");
        b = input.nextDouble();
        
        resFinal = ((a*2)+(b*3))/5;
        
        System.out.println("A média do aluno é: " +resFinal);
    }
}
