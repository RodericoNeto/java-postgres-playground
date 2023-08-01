package com.example;

import java.util.Scanner;

public class AppScanner {
    
    //OBS: o scanner precisa do import:
    // import java.util.Scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        Integer idade = scanner.nextInt();

        System.out.printf("%s tem %d anos", nome, idade);

    }
}
