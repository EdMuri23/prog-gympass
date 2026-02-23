package Clases;

public class Gimnasio {

    private final int codigo;
    private final String nombre;
    final Socio [] listaSocio;
    final Sala [] listaSala;
    int responsableId;

    /** CONSTRUCTOR:
     * @param codigo
     * @param nombre
     */
    public Gimnasio(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaSocio = new Socio[35];
        this.listaSala = new Sala[8];
        this.responsableId = -1;
    }

    //Gets
    public int getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        new StringBuilder(codigo + " " + nombre);
        return toString();
    }
}
