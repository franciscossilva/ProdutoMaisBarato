package ProdutoMaisBaratoTest;

import org.example.ProdutoMaisBarato.Compras;
import org.example.ProdutoMaisBarato.Produto;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ComprasTest {


    @Test
    public void testProdutoMaisBarato() {
        // Arrange // (preparação)
        Produto produto1 = new Produto("Produto 1", 20.0);
        Produto produto2 = new Produto("Produto 2", 15.0);
        Produto produto3 = new Produto("Produto 3", 25.0);

        // Act // (ação)
        Produto produtoMaisBarato = Compras.produtoMaisBarato(produto1, produto2, produto3);

        // Assert // (verificação)
        assertEquals(produto2, produtoMaisBarato);
    }
}
