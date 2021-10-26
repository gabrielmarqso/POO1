import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nomeDisc;
    private String codDisc;

    private List<Professor> listaProf = new ArrayList<Professor>();

    public Disciplina(String nomeDisc, String codDisc, Professor professor){
        if (professor == null){
            throw new NullPointerException("A referência de professor não poder ser nula!");
        }

        this.nomeDisc = nomeDisc;
        this.codDisc = codDisc;
        listaProf.add(professor);
    }
    public boolean addProfessor(Professor professor){
        boolean sucesso = false;

        if(professor != null && listaProf.size() < 10){
            listaProf.add(professor);
            sucesso = true;
        }return sucesso;
    }
    public boolean removerProfessor(Professor professor){
        boolean sucesso = false;

        if(listaProf.size() > 1 && listaProf.contains(professor)){
            listaProf.remove(professor);
            sucesso = true;
        }
        return sucesso;
    }

    public String getNomeDisc() {
        return nomeDisc;
    }

    public String getCodDisc() {
        return codDisc;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nomeDisc='" + nomeDisc + '\'' +
                ", codDisc='" + codDisc + '\'' +
                ", listaProf="+ System.lineSeparator() + listaProf +
                '}';
    }
}
