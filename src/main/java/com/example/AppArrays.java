package com.example;

import java.util.Arrays;
import java.util.Random;

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


        // Alerando UMA LINHA TODA:
        matriz[1] = new double[]{400, 500, 600};
        System.out.println(Arrays.deepToString(matriz));

        System.out.printf("%6.2f", vetor[1]);
        System.out.println(); 

        double[] arrayNumDouble = new double[5];
        System.out.println(Arrays.toString(arrayNumDouble));
        
        Random random = new Random();

        for (int i = 0; i < arrayNumDouble.length; i++){
            
            double randomDouble = random.nextDouble();
            arrayNumDouble[i] = randomDouble;
        }

        System.out.printf(Arrays.toString(arrayNumDouble));

        for (int i = 1; i <= arrayNumDouble.length; i++){
            System.out.println(arrayNumDouble[arrayNumDouble.length - i]);
        }

        System.out.println();

        System.out.printf("O primeiro número formatado é %-8.2f", arrayNumDouble[0]);

        double numAleat = Math.round(Math.random() * 10);


    }
}
