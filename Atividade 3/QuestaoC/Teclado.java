public class Teclado {

    private String marcaTeclado;
    private String modeloTeclado;

    public Teclado(String marcaTeclado, String modeloTeclado){
        this.marcaTeclado = marcaTeclado;
        this.modeloTeclado = modeloTeclado;
    }

    public String getMarcaTeclado() {
        return marcaTeclado;
    }

    public String getModeloTeclado() {
        return modeloTeclado;
    }

    @Override
    public String toString() {
        return "Teclado{" +
                "marcaTeclado='" + marcaTeclado + '\'' +
                ", modeloTeclado='" + modeloTeclado + '\'' +
                '}'+ System.lineSeparator();
    }

}
