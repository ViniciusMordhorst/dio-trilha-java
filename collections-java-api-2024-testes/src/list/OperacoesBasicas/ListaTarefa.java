package list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;
public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefalist.add(new Tarefa(descricao));

    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);

            }

        }
        tarefalist.removeAll(tarefasParaRemover);

    }

    public int obterNumeroTotalTarefas(){
    return tarefalist.size();

    }

    public void obterDescricaoTarefas() {
        System.out.println(tarefalist);

    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O nº total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");

      
        System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
