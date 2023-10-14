package set.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable <Produto> {
    
    private long codigoProduto;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(long codigoProduto, String nome, double preco, int quantidade) {
        this.codigoProduto = codigoProduto;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto [codigoProduto=" + codigoProduto + ", nome=" + nome + ", preco=" + preco + ", quantidade="
                + quantidade + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigoProduto ^ (codigoProduto >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigoProduto != other.codigoProduto)
            return false;
        return true;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }
}

class ComparatorPorPreco implements Comparator <Produto> {

    public int compare(Produto p1, Produto p2) {
       return Double.compare(p1.getPreco(), p2.getPreco());
    }
    
}





