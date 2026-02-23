
import Clases.Socio;
import Clases.Sala;
import Clases.Gimnasio;

public static void main(String[] args) {

    //Zona declarativa
    Socio socio_01;
    Socio socio_02;

    Sala sala_01;
    Sala sala_02;

    //Zona ejecutiva
    socio_01 = new Socio(1, "Clases.Socio 01");
    socio_02 = new Socio(2, "Clases.Socio 02");

    sala_01 = new Sala(2, "Clases.Sala 01");
    sala_02 = new Sala(2, "Clases.Sala 02");

    //Imprimimos por pantalla
    System.out.println(socio_01.toString());
    System.out.println(socio_02.toString());

    System.out.println(sala_01.toString());
    System.out.println(sala_02.toString());

}
