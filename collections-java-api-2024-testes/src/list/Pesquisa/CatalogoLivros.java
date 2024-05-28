package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    
    public void adicionarLivro(String titulo, String autor, int ano_pub){
        livroList.add(new Livro(titulo, autor, ano_pub));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAno_pub() >= anoInicial && l.getAno_pub() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public List<Livro> pesquisarPorTitulo(String titulo){
        List<Livro> livrosPorTitulo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo.add(l);
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Senhor dos Aneis", "abluble", 1994);
        catalogoLivros.adicionarLivro("Harry pote", "kroling", 1996);
        catalogoLivros.adicionarLivro("Devil May Cry", "Dante", 2020);
        catalogoLivros.adicionarLivro("Pizza", "Dante", 2022);
        catalogoLivros.adicionarLivro("livro 5", "autor 5", 2024);
        catalogoLivros.adicionarLivro("livro 6", "autor 6", 2021);

        System.out.println(catalogoLivros.pesquisarPorAutor("Dante"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2023));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Harry pote"));
    }
}
