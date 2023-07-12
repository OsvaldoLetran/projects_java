/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaLibroCalificaciones;

/**
 *
 * @author jaime
 */

import java.util.Scanner;

public class LibroCalificaciones {

    private String nombreDelCurso; // el nombre del curso que representa este libro
    
    // inicializa el constructor a nombreDelCurso
    public LibroCalificaciones(String nombre)
    {
        nombreDelCurso = nombre;
    }
    
    //metodo para establecer nombre del curso
    public void establecerNombreDelCurso(String nombre)
    {
        nombreDelCurso = nombre;
    }
    
    // obtiene el nombre del curso
    public String ObtenerNombreDelCurso()
    {
        return nombreDelCurso;
    }
    
    // para mostrar mensaje de bienvenida
    public void mostrarMensaje()
    {
        //obtener el nombre del curso
        System.out.printf("Bienvenido al libro de calificaciones para \n%s\n\n", ObtenerNombreDelCurso());
    }
    
    // determina el probmedio de la clase con 10 notas
    
    public void determinarPromedioClase()
    {
        Scanner entrada= new Scanner(System.in);
        
        int total = 0;
        int contadorCalif = 1;
        int calificacion;
        int promedio;
        
        while (contadorCalif <= 10)
        {
            System.out.print("Escriba la nota " + contadorCalif + ": ");
            calificacion = entrada.nextInt();
            total += calificacion;
            contadorCalif += 1;
        }
        
        promedio = total / 10;
        
        System.out.printf("El total de las 10 notas es %d\n", total);
        System.out.printf("El promedio de la clase es %d\n", promedio);

        entrada.close();
    }
    
}
