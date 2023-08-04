package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.example.dao.ConnectionManager;
import com.example.dao.DAO;
import com.example.dao.EstadoDAO;
import com.example.dao.ProdutoDAO;
import com.example.model.Estado;
import com.example.model.Marca;
import com.example.model.Produto;

public class AppBd {

    public static void main(String[] args) {

        new AppBd();

    }

    public AppBd() {
        try (var conn = ConnectionManager.getConnection()) {


            var estadoDAO = new EstadoDAO(conn);

            var listaEstados = estadoDAO.listar();

            for(Estado estado : listaEstados){
                System.out.println(estado);
            }

            estadoDAO.localizar("CE");

            

            var marca = new Marca();
            marca.setId(1L);

            // # PARA INSERIR PRODUTO #
            // var produto = new Produto();
            // produto.setMarca(marca);
            // produto.setNome("Produto teste");
            // produto.setValor(100);

            // # PARA ALTERAR PRODUTO #
            var produto = new Produto();
            produto.setId(205L);
            produto.setMarca(marca);
            produto.setNome("Produto Novo (alterado)");
            produto.setValor(90);



            var produtoDAO = new ProdutoDAO(conn);
            //inserirProduto(conn, produto);
            produtoDAO.alterar(produto);
            produtoDAO.excluir(203L);

            //var dao = new DAO(conn);

            //dao.listar("produto");

        } catch (SQLException e) {
            System.err.println("Não foi possível conectar ao banco de dados: " + e.getMessage());
        }
    }

    

    

    

    private void carregarDriverJDBC() {
        try {
            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {
            System.err.println("Não foi possível não carregar a Classe para acesso ao BD: " + e.getMessage());
        }
    }
}
