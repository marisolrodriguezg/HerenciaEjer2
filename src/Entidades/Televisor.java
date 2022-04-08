
package Entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    protected int pulgadas;
    protected boolean sincronizador;
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Televisor() {
    }

    public Televisor(int pulgadas, boolean sincronizador) {
        this.pulgadas = pulgadas;
        this.sincronizador = sincronizador;
    }

    public Televisor(int pulgadas, boolean sincronizador, Double precio, String color, char consumuEnergetico, Double peso) {
        super(precio, color, consumuEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sincronizador = sincronizador;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSincronizador() {
        return sincronizador;
    }

    public void setSincronizador(boolean sincronizador) {
        this.sincronizador = sincronizador;
    }
    
    public void crearTelevisor(){
        System.out.println("crearemos un televisor");
        crearElectromomentico();
        System.out.println("de cuantas pulgadas es ");
        setPulgadas(leer.nextInt());
        
        System.out.println("tiene sincronizador?");
        String rta;
        rta=leer.next();
    
         if(rta.equalsIgnoreCase("si")){
             setSincronizador(true);

         }
        
        System.out.println("pulgadas " + getPulgadas() + "sincronizador " + isSincronizador());
    }
    

    public void precioFinalT() {
        precioFinal();
        // if ( isSincronizador() == false) { //no me funciona este condional
        if (getPulgadas() > 40) {
            precioFinal();
            setPrecio(getPrecio() * 1.3);
        } else {

            //if (isSincronizador() == true) {
            if (getPulgadas() > 40) {
                precioFinal();
                setPrecio(getPrecio() * 1.3 + 500);
                //   }
                //}
            }
        }
        System.out.println("precio final del tv $ " + getPrecio());
    }

}
