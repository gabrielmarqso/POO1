public class Pc {
    private String dono;
    private Webcam webcam;
    private Teclado teclado;

    public Pc(String dono, Teclado teclado){
        if (teclado == null){
            throw new NullPointerException("A referência do Teclado não pode ser nula!");

        }
        this.dono = dono;
        this.teclado = teclado;
    }
    public boolean addWebcam(Webcam webcam){
        boolean sucesso = false;

        if(this.webcam == null){
            this.webcam = webcam;
            sucesso = true;
        }
        return sucesso;
    }
    public boolean removeWebcam(Webcam webcam){
        boolean sucesso = false;

        if(this.webcam != null){
            this.webcam = null;
            sucesso = true;
        }
        return sucesso;
    }
    public Webcam getWebcam(){
        return webcam;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "dono='" + dono + '\'' +
                ", webcam=" + webcam +
                ", teclado=" + teclado +
                '}'+ System.lineSeparator();
    }
}

