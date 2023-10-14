package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List <Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    
    public void removerItens(String nome) {
        List <Item> itensParaRemover = new ArrayList<>();
        if(!itemList.isEmpty());
            for (Item it : itemList) {
                if (it.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(it);
            }   else {
            System.out.println("O carrinho está vazio.");
            }
            itemList.removeAll(itensParaRemover);
                
        }   
    }

    public double calcularValorTotal() {
        double valorTotal = 0d;
        if (!itemList.isEmpty()) {
          for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
          }
          return valorTotal;
        } else {
          throw new RuntimeException("A lista está vazia!");
        }
      }
    
    public void exibirItens() {
        if (!itemList.isEmpty()) {
                System.out.println(this.itemList);
        } else {
            System.out.println("O carrinho está vazio.");
        }
    }

    public String toString() {
        return "CarrinhoDeCompras{" +
            "itens=" + itemList +
            '}';
      }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoDeCompras = new CarrinhoCompras();
        
        carrinhoDeCompras.adicionarItem("Placa mãe B450", 599, 1);
        carrinhoDeCompras.adicionarItem("Processador", 1235, 1);
        carrinhoDeCompras.adicionarItem("Memória Ram 1x8GB 3200Mhz", 109, 4);
        carrinhoDeCompras.adicionarItem("Placa mãe A320", 299, 1);
        carrinhoDeCompras.adicionarItem("Memória Ram 2x8GB 3200Mhz", 209, 2);

        
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.removerItens("Memória Ram 1x8GB 3200Mhz");
        carrinhoDeCompras.removerItens("Placa mãe A320");

        
        carrinhoDeCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());

    }

}
