package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    private List<Tarefa> tarefaList;

    public void ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        if (!tarefaList.isEmpty()) {
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
            tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
        } else {
        System.out.println("A lista está vazia!");
        }
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        if (!tarefaList.isEmpty()) {
        System.out.println(tarefaList);
        } else {
        System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.adicionarTarefa("tarefa 01");
        listaTarefa.adicionarTarefa("tarefa 02");
        listaTarefa.adicionarTarefa("tarefa 03");
        listaTarefa.adicionarTarefa("tarefa 04");
        listaTarefa.adicionarTarefa("tarefa 05");
        listaTarefa.adicionarTarefa("tarefa 06");
        listaTarefa.adicionarTarefa("tarefa 01");

        System.out.println("Você possui: " + listaTarefa.obterNumeroTotalTarefas() + " tarefas em aberto.");


        listaTarefa.removerTarefa("Tarfa 01");
        listaTarefa.removerTarefa("Tarefa 05");
        System.out.println("Você possui: " + listaTarefa.obterNumeroTotalTarefas() + " tarefas em aberto.");




    }
}
