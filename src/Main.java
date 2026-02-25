
import Clases.Socio;
import Clases.Sala;
import Clases.Gimnasio;

public static void main(String[] args) {

    //Zona declarativa
    Socio socio_01;
    Socio socio_02;

    Sala sala_01;
    Sala sala_02;

    Gimnasio gimnasio_01;

    //Zona ejecutiva
    socio_01 = new Socio(1, "Socio 01");
    socio_02 = new Socio(2, "Socio 02");

    sala_01 = new Sala(1, "Sala 01");
    sala_02 = new Sala(2, "Sala 02");

    gimnasio_01 = new Gimnasio(1, "Gimnasio 01");

    //Zona de Manejo
    gimnasio_01.registrarSocio(socio_01);
    gimnasio_01.registrarSocio(socio_02);

    gimnasio_01.incorporaraSala(sala_01);
    gimnasio_01.incorporaraSala(sala_02);
    
    gimnasio_01.designarResponsable(2);

    //Imprimimos por pantalla
    System.out.println(socio_01.toString());
}
