public class Professor {

    private String nomeProfessor;
    private String codTurma;

    public Professor(String nomeProfessor, String codTurma){
        this.nomeProfessor = nomeProfessor;
        this.codTurma = codTurma;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public String getCodTurma() {
        return codTurma;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nomeProfessor='" + nomeProfessor + '\'' +
                ", codTurma='" + codTurma + '\'' +
                '}'+ System.lineSeparator();
    }
}
