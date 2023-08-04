package com.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Aplicação Java de Exemplo\n");
        listarEstados();
    }

    public static void listarEstados(){
        System.out.println("Listando estados cadastrados no banco de dados");
        try{
            Class.forName("org.postgresql.Driver");
            try(var conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "gitpod", "")){
                var stn = conn.createStatement();
                var result = stn.executeQuery("select * from estado");
                while(result.next()){
                    System.out.println(result.getString("nome"));
                }
            }
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }

    /* 
    public static void main(String[] args) {
        System.out.println("uoba");

        int idade = 10;
        final int age = 20;
        double peso = 73.20, nota = 9.8;
        boolean necessidadesEspeciais = true;
        System.out.println(age);

        //CHAR : ASPAS SIMPLES!
        char sinal = 'x'; 

        //OBS: TIPO "VAR"!! não precisa especificar o tipo da variável
        //obs2: VAR apenas para VARIÁVEIS LOCAIS
        //obs3: com VAR precisa SER INICIALIZADA LOGO QUANDO DECLARA -> é ai que ele adiciona o tipo da variável, então não da certo mudar depois
        
        var pcd = false;
        var peso2 = 42; // -> INT
        var peso3 = 60.5; // -> DOUBLE

        // TIPOS COMPOSTOS
        // permitem armazenar multiplos valores
        // >>> ARRAYS: apenas UM TIPO
            // - VETORES(uma dimensão (linha)) ou
            // - MATRIZES
        

    }
    */

}
