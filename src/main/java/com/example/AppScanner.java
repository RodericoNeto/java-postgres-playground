package com.example;

import java.util.Scanner;

public class AppScanner {
    
    //OBS: o scanner precisa do import:
    // import java.util.Scanner;

    // scanner.nextLine() -> STRING
    // scanner.nextInt()
    // scanner.nextDouble()


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // o scanner.NEXTLINE() retorna uma STRING
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        Integer idade = scanner.nextInt();


        scanner.nextLine(); // OBSSS: ESSE scanner nextline extra é pra PEGAR O ENTER que vem DEPOIS DE UM NÚMERO!
        // quando pega um nextInt e depois um nextLine, da esse probleminha, ai usa esse extra pra captar esse ENTER SOLTO.

        System.out.print("Digite o sexo: ");
        // obs: para conseguir um CHAR (pois não tem nextchar): usa-se o CHARAT(0)
        String sexoString = scanner.nextLine();
        char sexo = sexoString.charAt(0);

        System.out.printf("O %s tem %d anos e é %c ", nome, idade, sexo);
    }
}
