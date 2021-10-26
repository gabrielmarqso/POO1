public class ComputadorTeste {

    public static void main(String [] args){

        Teclado t1 = new Teclado("Logitech", "L20");
        Pc p = new Pc("Gabriel",t1);
        Webcam w1 = new Webcam("Multilaser", "WEB32");

        p.addWebcam(w1);

        System.out.println(p);
    }
}
