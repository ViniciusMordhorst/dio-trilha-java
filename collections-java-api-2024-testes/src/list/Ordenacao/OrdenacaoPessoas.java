package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoPessoas {
    
private List<Pessoa> pessoaList;

public OrdenacaoPessoas(List<Pessoa> pessoaList) {
    this.pessoaList = new ArrayList<>();
}

public void adicionarPessoa(String nome, int idade, double altura ) {

pessoaList.add(new Pessoa(nome, idade, altura));


}

public List<Pessoa> ordenarPorIdade(){

    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);

    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;


}
public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

public static void main(String[] args) {
        List<Pessoa> listaInicial = new ArrayList<>();
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas(listaInicial);

        ordenacaoPessoas.adicionarPessoa("Ana", 25, 1.65);
        ordenacaoPessoas.adicionarPessoa("João", 30, 1.75);
        ordenacaoPessoas.adicionarPessoa("Maria", 22, 1.60);

        System.out.println("Ordenado por Idade:");
        for (Pessoa p : ordenacaoPessoas.ordenarPorIdade()) {
            System.out.println(p);
        }

        System.out.println("Ordenado por Altura:");
        for (Pessoa p : ordenacaoPessoas.ordenarPorAltura()) {
            System.out.println(p);
        }
    }
}

class ComparatorPorAltura implements Comparator<Pessoa> {
    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }
}




