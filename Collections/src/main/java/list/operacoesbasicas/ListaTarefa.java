package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo 
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adcionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public void obtereDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String [] args){
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista e:"+ listaTarefa.obterNumeroTotalDeTarefas());
        
        listaTarefa.adcionarTarefa("Tarefa 1");
        listaTarefa.adcionarTarefa("Tarefa 1");
        listaTarefa.adcionarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista e:"+ listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista e:"+ listaTarefa.obterNumeroTotalDeTarefas());
        listaTarefa.obtereDescricoesTarefas();

    }

}