package com.mycompany.atividades;

import java.util.Scanner;

public class Atividade1 {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int maior=0;
            double matriz[][] = new double[4][4];

            for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                            System.out.println("Informe um valor do vetor: ");
                            matriz[i][j] = sc.nextDouble();

                            if (matriz[i][j] > 10) {
                                    maior++;
                            }
                    }
            }

            System.out.println("A matriz possui " + maior + " valor(es) maior(es) que 10");
    }
}