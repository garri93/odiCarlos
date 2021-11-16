/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.futuro;

/**
 *
 * @author Carlos
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Estudiante " + args[0] + " : ");
        String matriculas = args[1];
        String horassemanales = args[2];
        
        funciones.veredicto(matriculas, horassemanales);
        
    }
    
    
    
      
}

