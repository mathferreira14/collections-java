package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {
    
    private List <Livro> livroList;

    public CatalogoLivro() {
        this.livroList = new ArrayList<>(null);
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(autor, titulo, anoPublicacao));
    }

    public List <Livro> pesquisaAutor (String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>(null);
        if(!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
}


    public List <Livro> pesquisarPorIntervalo (int anoInicial, int anoFinal) {
        List <Livro> intervaloAno = new ArrayList<>(null);
            if (!livroList.isEmpty()) {
                for (Livro l : livroList) {
                    if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                        intervaloAno.add(l);
                    }
                }
            }

            return intervaloAno;
        
    }

    public Livro pesquisarPorTitulo (String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if(l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        
        CatalogoLivro catalogoLivros = new CatalogoLivro();

        catalogoLivros.adicionarLivro("Livro01", "Luna", 2020);
        catalogoLivros.adicionarLivro("Livro01", "Luna", 2021);
        catalogoLivros.adicionarLivro("Livro03", "Marina", 2023);
        catalogoLivros.adicionarLivro("Livro001", "Matheus", 2000);
        catalogoLivros.adicionarLivro("Livro002", "Matheus", 2001);

        System.out.println(catalogoLivros.pesquisaAutor("Matheus"));
        System.out.println(catalogoLivros.pesquisarPorIntervalo(1900, 2020));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro01"));
    }
}
