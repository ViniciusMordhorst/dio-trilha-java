package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // Atributo
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    
    }

    public void exibirConvidados(){

        System.out.println(convidadosSet);

    }

    public static void main(String[] args) {
        ConjuntoConvidados cj = new ConjuntoConvidados();

        System.out.println("Existem " + cj.contarConvidados() + " dentro do SET");

        cj.adicionarConvidado("Carlo",01);
        cj.adicionarConvidado("Jonson", 02);
        cj.adicionarConvidado("V", 03);
        cj.adicionarConvidado("aaaa",05);
        cj.adicionarConvidado("bbbb",05);

        cj.exibirConvidados();

        System.out.println("Existem " + cj.contarConvidados() + " dentro do SET");

        cj.removerConvidadoPorConvite(01);
        cj.removerConvidadoPorConvite(03);

        System.out.println("Existem " + cj.contarConvidados() + " dentro do SET");

        cj.exibirConvidados();
    }

}
