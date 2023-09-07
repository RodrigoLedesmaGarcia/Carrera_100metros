package LedesmaGarciaRodrigo_Carrera100;

public class Atleta {

    private int numeroAtleta;
    private String nombre;
    private double tiempoCarrera;

    public Atleta() {
    }

    public Atleta(int numeroAtleta, String nombre, double tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }

    public int getNumeroAtleta() {
        return numeroAtleta;
    }

    public void setNumeroAtleta(int numeroAtleta) {
        this.numeroAtleta = numeroAtleta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoCarrera() {
        return tiempoCarrera;
    }

    public void setTiempoCarrera(double tiempoCarrera) {
        this.tiempoCarrera = tiempoCarrera;
    }

    public String verDatos() {
        return "-------------------- Atleta Ganador --------------------"+
                "\nNombre: "+nombre+
                "\numero: "+numeroAtleta+
                "\nTiempo: "+tiempoCarrera+" segundos"+
                "\n ";
    }
}
