package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
   
    private Set<Produto> produtoSet;
        
        public CadastroProdutos() {
            this.produtoSet = new HashSet<>();
        }


        public void adicionarProduto(long codigoProduto, String nome, double preco, int quantidade) {
            produtoSet.add(new Produto(codigoProduto, nome, preco, quantidade));
        }

        public Set<Produto> exibirProdutosNome() {
            Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
                return produtosPorNome;
            }
            
        public Set<Produto> exibirProdutosPreco() {
            Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
            produtosPorPreco.addAll(produtoSet);
            return produtosPorPreco;
        }


public static void main(String[] args) {

        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(789, "Iogurte Natural", 1.99, 1);
        cadastroProdutos.adicionarProduto(790, "Iogurte Natural Integral", 2.99, 1);
        cadastroProdutos.adicionarProduto(791, "Iogurte Natural Light", 3.99, 1);
        cadastroProdutos.adicionarProduto(792, "Iogurte Natural Zero Lac", 4.99, 1);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosNome());

        System.out.println(cadastroProdutos.exibirProdutosPreco());






}



}
