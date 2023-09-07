package LedesmaGarciaRodrigo_Carrera100.controles;

//Rodrigo Ledesma Garcia https://rodrigoledesmagarcia.com.mx/

import LedesmaGarciaRodrigo_Carrera100.Atleta;

import java.util.Scanner;

//====================================================================================================
public class Controles {


    public static double masRapido(Atleta corredor[]) {
        double tiempo;
        int indice = 0;

        tiempo = corredor[0].getTiempoCarrera();
        for (int i = 1; i < corredor.length; i++) {
            if (corredor[i].getTiempoCarrera() < tiempo){
                tiempo = corredor[i].getTiempoCarrera();
                indice = i;
            }
        }
        return indice;
    }




//=====================================================================================================
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

//========================= VARIABLES GLOBALES =======================================================
 int numeroAtleta;
 String nombre;
 double tiempoCarrera;

 int numeroParticipantes;
 int indiceGanador;

//===================================================================================================
        System.out.println(" ");
        System.out.println("INGRESE UN GRUPO DE ATLETAS A CONCURSAR EN EL PROGRAMA SEGUIDO DE UN NOMBRE, NUMERO DE ATLETA Y SU " +
                "\nTIEMPO DE CARRERA. ejemplo \"Nombre: Mario, Numero: 10, Tiempo de carrera 9.45 segundos\" Y EL PROGRAMA" +
                "\nHARA LA SIMULACION DE UNA CARRERA Y MOSTRARA AL GANADOR AL FINAL. ");
        System.out.println(" ");
        System.out.println("** Ingrese la cantidad de atletas a participar en la carrera **");
        numeroParticipantes = teclado.nextInt();

        Atleta atletas[] = new Atleta[numeroParticipantes];
        for (int i = 0; i < atletas.length; i++ ){
            teclado.nextLine();
            System.out.println("Ingrese los datos del atleta N° "+(i+1));
            System.out.println("Ingrese el nombre del atleta ");
            nombre = teclado.nextLine();
            System.out.println("Digite el numero del atleta");
            numeroAtleta = teclado.nextInt();
            System.out.println("Ingrese el tiempo de carrera del atleta");
            tiempoCarrera = teclado.nextDouble();

            atletas[i] = new Atleta(numeroAtleta, nombre, tiempoCarrera);

        }


         indiceGanador = (int) masRapido(atletas);
        System.out.println(" ");
        System.out.println(atletas[indiceGanador].verDatos());

    }
}
