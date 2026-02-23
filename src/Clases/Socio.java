package Clases;

public class Socio {

    private final int numeroSocio;
    private final String nombre;

    /** CONSTRUCTOR:
     * @param numeroSocio
     * @param nombre
     */
    public Socio(int numeroSocio, String nombre) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
    }

    //Gets
    public int getNumeroSocio() {
        return numeroSocio;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        new StringBuilder(numeroSocio + " " + nombre);
        return toString();
    }
}
