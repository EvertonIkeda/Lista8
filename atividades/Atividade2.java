package com.mycompany.atividades;

public class Atividade2 {
    
    public static void main(String[] args) {

            int matriz[][] = new int[5][5];

            for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz.length; j++) {
                            matriz[i][j] = 0;
                            if (i == j) {
                                    matriz[i][j] = 1;
                            }
                    }
            }

            for (int i = 0; i < matriz.length; i++) {
                    System.out.println();
                    for (int j = 0; j < matriz.length; j++) {
                            System.out.print(matriz[i][j] + "  ");
                    }
            }
    }
}