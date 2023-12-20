package org.example;

import org.example.ProdutoMaisBarato.Compras;
import org.example.ProdutoMaisBarato.Produto;


public class Aplicacao {


    public static void main(String[] args) {

        Produto produto1 = new Produto("Produto 1", 20.0);
        Produto produto2 = new Produto("Produto 2", 15.0);
        Produto produto3 = new Produto("Produto 3", 25.0);


        Produto produtoMaisBarato = Compras.produtoMaisBarato(produto1, produto2, produto3);


        System.out.println("Você deve comprar o " + produtoMaisBarato.getNome());
    }
}
