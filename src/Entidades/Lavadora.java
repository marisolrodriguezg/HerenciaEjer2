
package Entidades;

public class Lavadora extends Electrodomestico{
    protected int carga;

    public Lavadora() {
    }

    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(int carga, Double precio, String color, char consumuEnergetico, Double peso) {
        super(precio, color, consumuEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        System.out.println("crearemos una lavadora");
        crearElectromomentico();
        System.out.println("cuantos kilos de carga soporta");
        setCarga(leer.nextInt());
        System.out.println("carga"+ getCarga());
    }
    
    public void precioFinalL(){
      precioFinal();
        if(getCarga()>30 ){
            precioFinal();
           setPrecio(getPrecio() + 500);
            
        }
        System.out.println("precio de la lavadora que soporta mas de 30 kg es de $ " + getPrecio());
    }
}

  
