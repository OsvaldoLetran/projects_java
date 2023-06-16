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
public class BarajarYReparteCartas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PaqueteDeCartas mipaquetecartas = new PaqueteDeCartas();
        mipaquetecartas.barajar();//coloca las cartas en orden aleatorio
        
        //imprimir las 52 cartas en el orden en el que se reparten
        
        for(int i=1; i<=52; i++)
        {
            //reparte e imprime una carta
            System.out.printf("%-19s", mipaquetecartas.repartirCarta());
            if(i%4 == 0)//imprimie una nueva linea despues de cada 4 cartas
                System.out.println();
        }//fin de for
    }//fin de void main
    
}//fin de la clase barajaryrepartecartas
