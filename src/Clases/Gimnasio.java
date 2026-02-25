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
        int posicionSocio = -1;
        int posicionPrimerHuecoLibre = -1;

        posicionSocio = buscarSocio(s.getNumeroSocio());

        //1º Llamamos a buscarSocio para comprobar si el Socio ya esta registrado en el Gimnasio
        if (posicionSocio != -1) {
            //Si no existe buscamos el primer hueco vacio del array listasSocios
            posicionPrimerHuecoLibre = buscarPrimerHuecoLibreSocio();
            if (posicionPrimerHuecoLibre != -1) {
                listaSocios[posicionPrimerHuecoLibre] = s;
                registrado = true;
            }
        }

        return registrado;
    }

    /** EXPULSAR_SOCIO
     *
     * @param numeroSocio
     * @return
     */
    private Socio expulsarSocio(int numeroSocio) {
        boolean expulsado = false;
        int posicionSocio;
        Socio s = null;

        posicionSocio = buscarSocio(numeroSocio);

        if (posicionSocio >= 0 && posicionSocio < MAX_SOCIOS) {
            s = listaSocios[posicionSocio];
            listaSocios[posicionSocio] = null;
            expulsado = true;
        }

        return s;
    }

    /** DESIGNAR_RESPONSABLE
     *
     * @param numeroSocio
     * @return
     */
    private boolean designarResponsable(int numeroSocio) {
        boolean resultado = false;
        int posicionSocio;

        posicionSocio = buscarSocio(numeroSocio);

        if (posicionSocio != -1) {
            responsableId = posicionSocio;
            resultado = true;
        }

        return resultado;
    }

    /** BUSCAR_PRIMER_HUECO_LIBRE_SOCIO
     *
     * @return
     */
    private int buscarPrimerHuecoLibreSocio () {
        boolean huecoEncontrado = false;
        int posicionPrimerHuecoLibre = -1;
        int i = 0;

        while (i < MAX_SOCIOS && !huecoEncontrado) {
            if (listaSocios[i] == null) {
                posicionPrimerHuecoLibre = i;
                huecoEncontrado = true;
            }
            i++;
        }
        return posicionPrimerHuecoLibre;
    }

    /**BUSCAR_SOCIO
     *
     * @param numeroSocio
     * @return
     */
    private int buscarSocio(int numeroSocio) {
        boolean socioEncontrado = false;
        int posicionSocio = -1;
        int i = 0;

        while (i < MAX_SOCIOS && !socioEncontrado) {
            if (listaSocios[i].getNumeroSocio() == numeroSocio) {
                socioEncontrado = true;
                posicionSocio = i;
            }
            i++;
        }
        return posicionSocio;
    }

    /**EXISTE_SOCIO
     *
     * @param numSocio
     * @return
     */
    private boolean existeSocio(int numSocio) {
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

    /**INCORPORAR_SALA
     *
     * @param sala
     * @return
     */
    private boolean incorporaraSala(Sala sala){
        boolean incorporada = false;
        int posicionSala = -1;
        int posicionPrimerHuecoLibre = -1;

        posicionSala = buscarSala(sala.getCodigoSala());

        //1º Llamamos a buscarSala para comprobar si el Socio ya esta registrado en el Gimnasio
        if (posicionSala != -1) {
            //Si no existe buscamos el primer hueco vacio del array listasSocios
            posicionPrimerHuecoLibre = buscarPrimerHuecoLibreSocio();
            if (posicionPrimerHuecoLibre != -1) {
                listaSalas[posicionPrimerHuecoLibre] = sala;
                incorporada = true;
            }
        }

        return incorporada;
    }

    /**BUSCAR_PRIMER_HUECO_LIBRE_SALA
     *
     * @return
     */
    private int buscarPrimerHuecoLibreSala () {
        boolean huecoEncontrado = false;
        int posicionPrimerHuecoLibre = -1;
        int i = 0;

        while (i < MAX_SALAS && !huecoEncontrado) {
            if (listaSocios[i] == null) {
                posicionPrimerHuecoLibre = i;
                huecoEncontrado = true;
            }
            i++;
        }
        return posicionPrimerHuecoLibre;
    }

    /**BUSCAR_SALA
     *
     * @param codigoSala
     * @return
     */
    private int buscarSala(int codigoSala) {
        boolean salaEncontrado = false;
        int posicionSala = -1;
        int i = 0;

        while (i < MAX_SALAS && !salaEncontrado) {
            if (listaSalas[i].getCodigoSala() == codigoSala) {
                salaEncontrado = true;
                posicionSala = i;
            }
            i++;
        }
        return posicionSala;
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
