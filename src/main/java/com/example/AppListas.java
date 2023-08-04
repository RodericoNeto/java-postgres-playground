package com.example;

import java.util.ArrayList;
import java.util.List;

import com.example.model.Cliente;


public class AppListas {
    public static void main(String[] args) {
        // criando VETOR (número já definido de elemtos)
        Cliente[] vetorClientes = new Cliente[5];

        // criando uma interface LIST:
        // obs: dentro do <> tem que ser uma CLASSE, não poderia usar "long", "boolean" por exemplo, teria que ser Long ou Boolean (inclusive os tipos primitivos NÃO ACEITAM NULO, enquanto as CLASSES ACEITAM NULO)
        // List<Long> listaClientes;
        List<Cliente> listaClientes = new ArrayList<>();

        var cliente1 = new Cliente();
        cliente1.setNome("Manoel");
        var cliente2 = new Cliente();
        cliente2.setNome("rod");


        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        listaClientes.add(cliente2);
        // PODE ELEMENTOS DUPLICADOS!

        // tem que criar na classe Cliente um método TOSTRING() pra retornar algo (senão retorna um monte de endereço)
        System.out.println(listaClientes);

        for (var cliente : listaClientes) {
            System.out.println(cliente);
        }


        listaClientes.remove(1);

        for(Cliente cliente : listaClientes){
            System.out.println(cliente);
        }

        listaClientes.add(cliente1);
        listaClientes.remove(cliente1);

        // tamanho = SIZE()
        System.out.println(listaClientes.size()); // 3

        // >>> LINKEDLIST<>() <<< em vez do ArrayList<>()
        // NÃO USA VETOR INTERNAMENTE, cria nova memória pra cada elemento que vai entrando

        

    }
}
