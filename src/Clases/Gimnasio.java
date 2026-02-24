package Clases;

public class Gimnasio {

    private final int codigo;
    private final String nombre;
    private final Socio [] listaSocios;
    private final Sala [] listaSalas;
    private int responsableId;

    //Maximos para los array
    private final int MAX_SOCIOS = 35;
    private final int MAX_SALAS = 8;


    /** CONSTRUCTOR:
     * @param codigo
     * @param nombre
     */
    public Gimnasio(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaSocios = new Socio[MAX_SOCIOS];
        this.listaSalas = new Sala[MAX_SALAS];
        this.responsableId = -1;
    }

    //Metodos Generales

    /** REGISTRAR_SOCIO:
     * Registra el socio en el array
     * @param s
     * @return
     */
    private boolean registrarSocio(Socio s) {
        boolean registrado = false;
        int posicion;

        //1º Llamamos a socioEsxisteEnGym para comprobar si el Socio ya esta registrado en el Gimnasio
        if (socioEsxisteEnGym(s.getNumeroSocio())){
            //Si no existe buscamos el primer hueco vacio del array listasSocios
            posicion = buscarPrimerHuecoLibreSocio();
            if (posicion >= 0 && posicion < MAX_SOCIOS) {
                listaSocios[posicion] = s;
                registrado = true;
            }
        }

        return registrado;
    }

    /** BUSCAR_PRIMER_HUECO_LIBRE_SOCIO
     *
     * @return
     */
    private int buscarPrimerHuecoLibreSocio () {
        boolean huecoEncontrado = false;
        int i = 0;

        while (i < MAX_SOCIOS && !huecoEncontrado) {
            if (listaSocios[i] == null) {
                huecoEncontrado = true;
            } else {
                i++;
            }
        }
        return i;
    }

    /** SOCIO_EXISTE_EN_GYM
     *
     * @param numSocio
     * @return
     */
    private boolean socioEsxisteEnGym(int numSocio) {
        boolean socioEncontrado = false;
        int i = 0;

        while (i < MAX_SOCIOS && !socioEncontrado) {
            if (listaSocios[i].getNumeroSocio() == numSocio) {
                socioEncontrado = true;
            }
            i++;
        }

        return socioEncontrado;
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
