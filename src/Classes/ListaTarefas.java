package Classes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> listaTarefas;

    public ListaTarefas(){
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        this.listaTarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        // Criando lista para armazenar os elementos que derem 'match' no if
        List<Tarefa> listaRemover = new ArrayList<>();

        for(Tarefa t: this.listaTarefas){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                listaRemover.add(t);
            }
        }

        // Remover todos os objetos pertencentes a listaRemover da listaTarefas.
        this.listaTarefas.removeAll(listaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return this.listaTarefas.size();
    }

    public void obterDescricoesTarefas(){
        int count = 1;

        for(Tarefa t: this.listaTarefas){
            System.out.printf("%d - %s%n",count, t.getDescricao());
            count++;
        }

        System.out.println();
    }
}
