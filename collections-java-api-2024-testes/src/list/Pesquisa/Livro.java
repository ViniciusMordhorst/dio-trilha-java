package list.Pesquisa;

public class Livro {

    private String titulo;
    private String autor;
    private int ano_pub;

    
    public Livro(String titulo, String autor, int ano_pub) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_pub = ano_pub;
    }

    public String getTitulo() {
        return titulo;
    }


    public String getAutor() {
        return autor;
    }


    public int getAno_pub() {
        return ano_pub;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano_pub=" + ano_pub + "]";
    }
    


}
