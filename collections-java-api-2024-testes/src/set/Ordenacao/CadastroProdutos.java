package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        return new TreeSet<>(produtoSet);
    }

    public Set<Produto> exibirPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Produto A", 10.99, 5);
        cadastro.adicionarProduto(2, "Produto B", 5.49, 10);
        cadastro.adicionarProduto(3, "Produto C", 15.89, 3);

        System.out.println("Produtos ordenados por nome:");
        Set<Produto> produtosPorNome = cadastro.exibirProdutosPorNome();
        for (Produto p : produtosPorNome) {
            System.out.println(p);
        }

        System.out.println("\nProdutos ordenados por preço:");
        Set<Produto> produtosPorPreco = cadastro.exibirPorPreco();
        for (Produto p : produtosPorPreco) {
            System.out.println(p);
        }
    }
}