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
public class Carta {
    private String cara;//cara de la carta(As, dos, ...)
    private String palo;//palo de la carta(corazones, diamentes
    
    //el constructor de dos argumentos inicializa la cara y el palo de la cara
    public Carta(String caraCarta, String paloCarta)
    {
        cara = caraCarta;//inicializa la cara de la carta
        palo = paloCarta;//inicializa el palo de la carta
    } //fin del constructor de Carta con 2 arguments
    
    //devolveremos la representación del String de la carta
    public String toString()
    {
        return cara + " de " + palo;
    } //fin del método toString
    
}//fin de la clase Carta
