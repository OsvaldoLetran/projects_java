/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps2021;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jaime
 */
public class Craps2021 {

    // crea un generador de numeros aleatorios para usarlo en el metodo tirarDado
    private static final Random numerosAleatorios = new Random();

    // enumeracion con constantes que representan el estado del juego
    private enum Estado {CONTINUA, GANO, PERDIO};

    // constantes que representan tiros comunes del dado
    private static final int DOS_UNOS = 2;
    private static final int TRES = 3;
    private static final int SIETE = 7;
    private static final int ONCE = 11;
    private static final int DOCE= 12;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Desea continuar");
        int tecla = entrada.nextInt();
        while(tecla != 8)
        {
        int miPunto = 0; //punto si no gana o pierde en el primer tiro.
        Estado estadoJuego; //puede contener CONTINUA, GANO O PERDIO

        int sumaDeDados = tirarDados(); //primer tiro de los dados.

        //determinar el estado del juego y el punto con base en el primer tiro.
        switch(sumaDeDados)
        {
            case SIETE: //GANA CON 7 EN EL PRIMER TIRO
            case ONCE: //gana con 11 en el primer tiro.
                estadoJuego = Estado.GANO;
                break;
            case DOS_UNOS: //PIRERDE CON 2 EN EL PRIMER TIRO
            case TRES: //PIERDE CON 3 EN EL PRIMER TIRO.
            case DOCE: //PIERDE CON 12 EN EL PRIMER TIRO
                estadoJuego = Estado.PERDIO;
                break;
            default:
                estadoJuego = Estado.CONTINUA; //no ha terminado el juego.
                miPunto = sumaDeDados; //guarda el punto.
                System.out.printf("El punto es %d\n", miPunto);
                break;
        }

        //mientras el juego no este terminado.
        while(estadoJuego == Estado.CONTINUA)//no gano ni perdio
        {
            sumaDeDados = tirarDados();//tirar los dados de nuevo

            //determina el estado del juego
            if(sumaDeDados == miPunto)//gana haciendo un punto
                estadoJuego = Estado.GANO;
            else
                if(sumaDeDados == SIETE)//pierde al tirar 7 antes del punto
                    estadoJuego = Estado.PERDIO;
        }

        //muestra mensaje de que gano o perdio
        if (estadoJuego == Estado.GANO)
            System.out.println("El jugador gana");
        else
            System.out.println("El jugador pierde");
        tecla = miPunto;
        }

        entrada.close();

    }

    // tirar los dados y calcula la suma y muestra los resultados.
    public static int tirarDados()
    {
        //elige valores aleatorios para los dados
        int dado1 = 1 + numerosAleatorios.nextInt(6); // primer tiro del dado
        int dado2 = 1 + numerosAleatorios.nextInt(6); // segundo tiro del dado
        int suma = dado1 + dado2;//suma de los valores de los dados.

        //mostrar el resultado del tiro de dados.

        System.out.printf("El jugador tiro %d + %d = %d\n", dado1, dado2, suma);
        return suma;//devuelve la suma de los dados.
    }

}