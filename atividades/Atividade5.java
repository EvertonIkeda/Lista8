package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean encontrou=false;
        double x;
        double matriz[][] = new double[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Informe um valor: ");
                matriz[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Informe o valor de x: ");
        x = sc.nextDouble();
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("O valor de x: " + x + " encontra-se na linha " + i + " e coluna " + j);
                    encontrou = true;
                }
            }
        }
        
        if (!encontrou) {
            System.out.println("Valor de x: " + x + " não foi encontrado na matriz");
        }
    }
}