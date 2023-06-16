/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barajaryrepartecartas;

/**
 *
 * @author jaime
 */

import java.util.Random;
public class PaqueteDeCartas {
    private Carta[] paquete;//arreglo de objetos Carta
    private int cartaActual;//subindice de la siguiente carta a repartir(0 a 51)
    private static final int NUMERO_DE_CARTAS = 52;//número constante de Cartas
    
    //generador de números aleatorios
    
    private static final Random numerosAleatorios = new Random();
    
    //el constructor que llena el paquete de cartas
    public PaqueteDeCartas()
    {
        String[] caras = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete",
                            "Ocho", "Nueve", "Dies", "Jota", "Quina", "Rey"};
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Espadas"};
        
        paquete = new Carta[NUMERO_DE_CARTAS];//crea arreglo de objetos carta
        cartaActual = 0;//establece cartaActual para que la primera Carta repartida sea paquete[0]
        
        //llenar el paquete con objetos carta
        for (int cuenta=0; cuenta<paquete.length; cuenta++)
            paquete[cuenta] = new Carta(caras[cuenta%13], palos[cuenta/13]);
    }// fin del constructor de PaqueteDeCartas
    
    //barajar el paquete de Cartas con algoritomo de una pasada
    public void barajar()
    {
        //despues de barajar, la repartición debe empezar en paquete[0] 
        cartaActual = 0;//reinicializa carta actual
        
        //para cada carta, selecciona otra carta aleatoria(0 y 51) y las intercambia
        for(int primera=0; primera<paquete.length; primera++)
        {
            //seleccionar un número entre 0 y 51
            int segunda = numerosAleatorios.nextInt(NUMERO_DE_CARTAS);
            
            //INTERCAMBIA CARTA ACTUAL CON LA CARTA SELECCIONA AL AZAR
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp;
        }//fin del for
    }//fin del método barajar
    
    //reparte una carta
    public Carta repartirCarta()
    {
        //determinar si quedan Cartas por reparitr
        if(cartaActual < paquete.length)
            return paquete[cartaActual++];//devolver la carta actual en el arreglo
        else
            return null; //devuelve null para indicar que se repartieron todas las cartas
    }//fin metodo repartir carta
    
}//fin de la clase PaqueteDeCartas
