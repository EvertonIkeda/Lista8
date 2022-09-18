package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double maior=0;
        double matriz[][] = new double[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Informe um valor: ");
                matriz[i][j] = sc.nextDouble();
                if (i == 0 && j == 0) {
                    maior = matriz[0][0];
                }
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
            }
        }
        
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
        }
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] == maior) {
                    System.out.println("O maior valor é " + maior + " na linha "+ i + " e coluna " + j);
                }
            }
        }
    }
}