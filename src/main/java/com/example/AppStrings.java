package com.example;

import java.util.Arrays;

public class AppStrings {

    public static void main(String[] args){

        // STRING = "ASPAS DUPLAS"
        // char = 'aspas simples'!

        // POOL DE STRINGS:
        // quando uma nova string é criada mas JÁ EXISTE uma string igual, o java dá o mesmo endereço pra elas
        // para GARANTIR que estejam em POSIÇÕES(ENDEREÇOS) DIFERENTES, usa-se o:
        String frase1 = new String("escreva aqui");
        String frase2 = new String("escreva aqui");
        System.out.println(frase1 == frase2); //false

        // para verificar o CONTEUDO, usa-se o .equals:
        System.out.println(frase1.equals(frase2)); // true

        // obs: o .equals() existe pra QUALQUER OBJETO, para verificar o CONTEÚDO

        // MÉTODOS STRING:
        // toLowerCase(), toUpperCase()
        // substring()
        // isEmpty() -> COMPLETAMENTE VAZIO
        // isBlank() -> vazio OU só espaços em branco (melhor que o isEmpty() pq verifica mais)
        // split() -> dividir uma string usando um "delimitador"
        // trim() -> tira os ESPAÇOS (ANTES E DEPOIS)
        // equals()
        // equalsIgnoreCase() -> equals mas ignora maiusculas e minusculas
        //length()
        // replace(" ", "") -> nesse caso retira os espaços

        // charAt()

        String nome = "  Roderico  Neto  ";
        String nomeUpperTrimmed = nome.toUpperCase().trim(); // RODERICO  NETO
        System.out.println(nomeUpperTrimmed.getClass());

        String nomeSemEspaço = nome.replace(" ", "");
        System.out.println(nomeSemEspaço); 
        // RodericoNeto

        String[] nomeSplitedArray = nomeUpperTrimmed.split(" "); 
        System.out.println(Arrays.toString(nomeSplitedArray)); // [RODERICO, , NETO]

        // System.out.println(nomeSplited);

        System.out.println(frase1.length()); // 12


    }
    
}
