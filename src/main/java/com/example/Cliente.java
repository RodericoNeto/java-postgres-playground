package com.example;

public class Cliente {

    // ATRIBUTOS (geralmente PRIVATE)
    // OBS: se não botar public / private, por padrão o atributo fica ACESSIVEL SOMENTE DENTRO DO PACOTE
    private double renda;
    private char sexo;


    // >>> CONSTRUCTOR <<<
    // MESMO NOME da classe, inclusive com Maiuscula
    // não tem o Void ou o tipo que retorna (até pq ele retorna a própria classe, ficaria esquisito)
    public Cliente(){
        
    }

    // GETTERS
    public double getRenda(){
        return renda;
    }

    public char getSexo(){
        return sexo;
    }

    // SETTERS

    public void setRenda(double renda){
        if(renda >= 0){
            this.renda = renda;
        } else {
            System.out.println("A renda tem que ser maior que 0");
        }
        
    }

    public void setSexo(char sexo){
        if(sexo == 'M' || sexo == 'F')
            this.sexo = sexo;
        else
            System.out.println("O sexo tem que ser M ou F");
    }






    

}
