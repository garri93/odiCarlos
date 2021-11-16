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
public class funciones {
    
     private static void veredicto (String matriculas, String horasestudio) {
         String resultado = "";
      if (matriculas.equals(horasestudio)) {
          resultado = "Bien. Pero una hora de estudio para cada módulo puede ser insuficiente.";
      }
      if (Integer.valueOf(matriculas) < Integer.valueOf(horasestudio)) {
          resultado  ="Ideal. Trabajas los contenidos en casa.";
      }
      if (Integer.valueOf(matriculas) > Integer.valueOf(horasestudio)) {
          resultado = "Poco tiempo de estudio. Debes dedicar más tiempo.";
      }
      resultado = resultado;
     
       System.out.println(resultado);
        }
    
}



