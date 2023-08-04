package com.example.model;

public class Cliente {

    // ATRIBUTOS (geralmente PRIVATE)
    // OBS: se não botar public / private, por padrão o atributo fica ACESSIVEL SOMENTE DENTRO DO PACOTE
    private double renda;

    private char sexo;

    private String nome;


    private boolean clienteEspecial;
    //obs: todo atributo boolean vem com "FALSE" POR PADRÃO


    // >>> CONSTRUCTOR <<<
    // MESMO NOME da classe, inclusive com Maiuscula
    // não tem o Void ou o tipo que retorna (até pq ele retorna a própria classe, ficaria esquisito)
    // obs: podem ser criados vários construtores diferentes com o mesmo nome "Cliente()" MAASSS os PARAMÊTROS TEM QUE SER DIFERENTES (e cada construtor é executado individualmente(dependendo do parametro que for colocado lá na instanciação))
    public Cliente(){
        System.out.println("Criando um Cliente SEM DEFINIR PARAMETROS!");  
    }

    public Cliente(double renda){

        // é possível um CONSTRUTOR CHAMAR OUTRO! (um mais complexo chamar outro mais simples)
        // para isso, é necessário que o construtor mais simples seja colocado NO COMEÇO do construtor mais complexo. 
        // usa-se o "THIS(params);":
        this();

        System.out.println("Criando um Cliente COM DEFINIÇÃO DE PARÂMETROS");
        this.renda = renda;
        // obs: pode inicializar todos ou só alguns parâmetros, nesse caso por exemplo, só renda foi inicializado, sexo fica por conta do setSexo().
        // obs: pode ser usado tb os SETTERS AQUI!
        // os setters podem já ter IMPLEMENTADO VERIFICAÇÕES, que deverão estar presentes também no constructor, então faz sentido usar
        //>>> setRenda(renda)
    }

    // GETTERS
    public double getRenda(){
        return renda;
    }

    public char getSexo(){
        return sexo;
    }


    
    public String getNome() {
        return nome;
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


    
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String toString(){
        return "Cliente: " + nome + ". Renda: " + renda;
    }







    

}
