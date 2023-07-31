package com.example;

import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args){
        System.out.println("app arrays");

        // criando um VETOR:
        double vetor[] = {10,20,30}; //fica com 3 elementos pra sempre
        System.out.println(vetor); // ENDEREÇO
        System.out.println(Arrays.toString(vetor)); //VETOR MESMO

        double[] vetor2 = {40,50,60};
        System.out.println(Arrays.toString(vetor2));

        // tanto faz o [] no final do tipo ou da variável então

        //criar um vetor com N elementos:
        int vetorInt[] = new int[4];


        // MATRIZ: tipo nome[lin][col] = new tipo[l][c];
        // imprime com DEEP TO STRING. Arrays.deepToString(matriz)
        
        double matriz[][] = {{10,20,30}, {40,50,60}};
        System.out.println(Arrays.deepToString(matriz));

        matriz[0][1] = 200;
        System.out.println(Arrays.deepToString(matriz));




    }
}
