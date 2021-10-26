import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nomeAutor;
    private String codAutor;

    private List<Livro> listaLivro = new ArrayList<Livro>();

    public Autor(String nomeAutor, String codAutor){
        this.nomeAutor = nomeAutor;
        this.codAutor = codAutor;
    }
    public boolean addLivro (Livro livro){
        boolean sucesso = false;

        if (livro != null){
            listaLivro.add(livro);
            sucesso = true;
        }return sucesso;
    }
    public boolean removerLivro(Livro livro){
        boolean sucesso = false;

        if(listaLivro.size() > 0 && listaLivro.contains(livro)){
            listaLivro.remove(livro);
            sucesso = true;
        }return sucesso;
    }
    public String getNomeAutor(){
        return nomeAutor;
    }
    public String getCodAutor(){
        return codAutor;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nomeAutor='" + nomeAutor + '\'' +
                ", codAutor='" + codAutor + '\'' +
                ", listaLivro=" + System.lineSeparator() + listaLivro +
                '}';
    }
}
