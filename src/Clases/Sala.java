package Clases;

public class Sala {

    private final int codigoSala;
    private String descripcion;

    /** CONSTRUCTOR:
     * @param numeroSocio
     * @param nombre
     */
    public Sala(int numeroSocio, String nombre) {
        this.codigoSala = numeroSocio;
        this.descripcion = nombre;
    }

    //Gets
    public int getCodigoSala() {
        return codigoSala;
    }
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        new StringBuilder(codigoSala + " " + descripcion);
        return toString();
    }
}
