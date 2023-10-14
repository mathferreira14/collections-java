package list.Pesquisa;

public class Livro {
    
    private String autor;
    private String titulo;
    private int anoPublicacao;

    public Livro (String autor, String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Livro [autor=" + autor + ", titulo=" + titulo + ", anoPublicacao=" + anoPublicacao + "]";
    }

   
}
