package org.example.ProdutoMaisBarato;

import org.example.ProdutoMaisBarato.Produto;

public class Compras {


    public static Produto produtoMaisBarato(Produto produto1, Produto produto2, Produto produto3) {
        if (produto1.getPreco() <= produto2.getPreco() && produto1.getPreco() <= produto3.getPreco()) {
            return produto1;
        } else if (produto2.getPreco() <= produto1.getPreco() && produto2.getPreco() <= produto3.getPreco()) {
            return produto2;
        } else {
            return produto3;
        }
    }
}
