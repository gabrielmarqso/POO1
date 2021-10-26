public class Webcam {
    private String marcaWebcam;
    private String modeloWebcam;

    public Webcam(String marcaWebcam, String modeloWebcam){
        this.marcaWebcam = marcaWebcam;
        this.modeloWebcam = modeloWebcam;
    }

    public String getMarcaWebcam() {
        return marcaWebcam;
    }

    public String getModeloWebcam() {
        return modeloWebcam;
    }

    @Override
    public String toString() {
        return "Webcam{" +
                "marcaWebcam='" + marcaWebcam + '\'' +
                ", modeloWebcam='" + modeloWebcam + '\'' +
                '}'+ System.lineSeparator();
    }
}
