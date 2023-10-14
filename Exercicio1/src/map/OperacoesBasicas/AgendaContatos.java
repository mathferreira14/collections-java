package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {


    private Map<String, Integer> agendaContatosMap;

    public AgendaContatos () {
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatosMap.isEmpty()) {
            agendaContatosMap.remove(nome);
        }
    }

    public void exibirContato() {
        System.out.println(agendaContatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
          numeroPorNome = agendaContatosMap.get(nome);
          if (numeroPorNome == null) {
            System.out.println("Contato não encontrado na agenda.");
          }
        } else {
          System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
      }


public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Luna", 123456);
    agendaContatos.adicionarContato("Marina", 234567);
    agendaContatos.adicionarContato("Matheus", 345678);
    agendaContatos.adicionarContato("Enzo", 456789);

    agendaContatos.exibirContato();

    agendaContatos.removerContato("Enzo");

    agendaContatos.exibirContato();

    System.out.println("O número do telefone é: " + agendaContatos.pesquisarPorNome("Luna") );

}




}
