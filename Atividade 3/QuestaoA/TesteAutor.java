public class TesteAutor {

    public static void main(String [] args){

        Livro l1 = new Livro("1984", "Distopia");
        Livro l2 = new Livro("A revolução dos Bichos", "Distopia");
        Livro l3 = new Livro("Dentro da baleia e outros ensaios", "Politica");

        Autor a1 = new Autor("George Orwell", "2901A");

        a1.addLivro(l1);
        a1.addLivro(l2);
        a1.addLivro(l3);

        System.out.println(a1);


    }
}
