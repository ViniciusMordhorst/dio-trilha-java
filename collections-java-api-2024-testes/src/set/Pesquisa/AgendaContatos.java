package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int num) {
        contatoSet.add(new Contato(nome, num));
    }

    public void exibirContato() {
        for (Contato c : contatoSet) {
            System.out.println(c);
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int newNum) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNum(newNum);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Ana", 123456);
        agenda.adicionarContato("João", 654321);
        agenda.adicionarContato("Maria", 111111);

        System.out.println("Contatos na agenda:");
        agenda.exibirContato();

        System.out.println("\nPesquisando contatos com nome 'Ana':");
        Set<Contato> resultadoPesquisa = agenda.pesquisarPorNome("Ana");
        for (Contato c : resultadoPesquisa) {
            System.out.println(c);
        }

        System.out.println("\nAtualizando número de 'João':");
        Contato atualizado = agenda.atualizarNumeroContato("João", 999999);
        if (atualizado != null) {
            System.out.println("Contato atualizado: " + atualizado);
        } else {
            System.out.println("Contato não encontrado.");
        }

        System.out.println("\nContatos na agenda após atualização:");
        agenda.exibirContato();
    }
}