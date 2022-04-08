
package herenciaejer2;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import Entidades.Televisor;

public class HerenciaEjer2 {

    public static void main(String[] args) {

     Lavadora lav=new Lavadora();  
     lav.crearLavadora();
     lav.precioFinalL();

     Televisor tv=new Televisor();
     tv.crearTelevisor();
    tv.precioFinalT();
   
    }
    
}
