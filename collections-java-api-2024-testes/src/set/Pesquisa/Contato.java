package set.Pesquisa;

public class Contato {
    
    private String nome;

    private int num;

    public Contato(String nome, int num) {
        this.nome = nome;
        this.num = num;
    }

    public String getNome() {
        return nome;
    }

    public int getNum() {
        return num;
    }

    

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Contato [nome=" + nome + ", num=" + num + "]";
    }


}
