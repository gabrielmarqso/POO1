public class DisciplinaProfessor {

    public static void main(String [] args){

    Professor p1 = new Professor("Renan", "20212EDBSI");
    Professor p2 = new Professor("Cloves", "20212EDECA");

    Disciplina d1 = new Disciplina("Estrutura de Dados", "ED1", p1 );

    d1.addProfessor(p2);

    System.out.println(d1);

    }
}
