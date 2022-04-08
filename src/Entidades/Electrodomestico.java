
package Entidades;

import java.util.Scanner;

public class Electrodomestico {
 
    protected double precio;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Electrodomestico() {
        
    }

    public Electrodomestico(Double precio, String color, char consumuEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumuEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumuEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumuEnergetico(char consumuEnergetico) {
        this.consumoEnergetico = consumuEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public void comprobarConsumoEnergetico (char consumoEnergetico){
    
        switch (getConsumuEnergetico()) {
            case 'A':
                System.out.println("el consumo es A");
                break;
            case 'B':
                System.out.println("el consumo es B");
                break;
            case 'C':
                System.out.println("el consumo es C");
                break;
            case 'D':
                System.out.println("el consumo es D");
                break;
            case 'E':
                System.out.println("el consumo es E");
                break;
            default:
                System.out.println("el consumo es F");

        }
    }
    public void comprobarColor (String color){
    
        switch (getColor()) {
            case "blanco":
                System.out.println("es de color blanco");
                break;
            case "negro":
                System.out.println("es de color negro");
                break;
            case "rojo":
                System.out.println("es de color rojo");
                break;
            case "azul":
                System.out.println("es de color azul");
                break;
            case "gris":
                System.out.println("es de color gris");
                break;
            default:
                System.out.println("es de color blanco");
            setColor(color);//falta setear blanco

        }
}
    
    public Electrodomestico crearElectromomentico() {
        Electrodomestico electro = new Electrodomestico();
        System.out.println("precio del electrodomestico");
        setPrecio(leer.nextDouble()+1000);
       
        System.out.println("color del electrodomestico");
        
        setColor(leer.next());
        color = getColor();
        comprobarColor(color);
        
        System.out.println("consumo electrio");
        char aux = leer.next().charAt(0);
        setConsumuEnergetico(aux);
        comprobarConsumoEnergetico(getConsumuEnergetico());
       
        System.out.println("peso del electro");
       setPeso(leer.nextDouble());
       
        System.out.println("precio  "+ getPrecio()+ " color  " + getColor()+ " consumo  "+ getConsumuEnergetico()+ " peso  "+ getPeso());
     
      
        return electro;
    }

    public void precioFinal() {
        switch (getConsumuEnergetico()) {
            case 'A':
                if (getPeso() < 1 && getPeso() > 19) {
                    setPrecio(getPrecio() + 1000 + 100);
                    System.out.println("el nuevo precio es " + getPrecio());
                } else {
                    if (getPeso() > 20 && getPeso() < 49) {
                        setPrecio(getPrecio() + 1000 + 500);
                        System.out.println("el nuevo precio es " + getPrecio());
                    } else {
                        if (getPeso() > 49 && getPeso() < 79) {
                            setPrecio(getPrecio() + 1000 + 800);
                            System.out.println("el nuevo precio es " + getPrecio());
                        } else {
                            if (getPeso() < 80) {
                                setPrecio(getPrecio() + 1000 + 1000);
                                System.out.println("el nuevo precio es " + getPrecio());
                            }}}}
                break;

            case 'B':
                   if (getPeso() < 1 && getPeso() > 19) {
                    setPrecio(getPrecio() + 800 + 100);
                    System.out.println("el nuevo precio es " + getPrecio());
                } else {
                    if (getPeso() > 20 && getPeso() < 49) {
                        setPrecio(getPrecio() + 800 + 500);
                        System.out.println("el nuevo precio es " + getPrecio());
                    } else {
                        if (getPeso() > 50 && getPeso() < 79) {
                            setPrecio(getPrecio() + 800 + 800);
                            System.out.println("el nuevo precio es " + getPrecio());
                        } else {
                            if (getPeso() < 80) {
                                setPrecio(getPrecio() + 800 + 1000);
                                System.out.println("el nuevo precio es " + getPrecio());
                            }}}}
                break;
            case 'C':
                     if (getPeso() < 1 && getPeso() > 19) {
                    setPrecio(getPrecio() + 600 + 100);
                    System.out.println("el nuevo precio es " + getPrecio());
                } else {
                    if (getPeso() > 20 && getPeso() < 49) {
                        setPrecio(getPrecio() + 600 + 500);
                        System.out.println("el nuevo precio es " + getPrecio());
                    } else {
                        if (getPeso() > 50 && getPeso() < 79) {
                            setPrecio(getPrecio() + 600 + 800);
                            System.out.println("el nuevo precio es " + getPrecio());
                        } else {
                            if (getPeso() < 80) {
                                setPrecio(getPrecio() + 600 + 1000);
                                System.out.println("el nuevo precio es " + getPrecio());
                            }}}}
                break;
            case 'D':
                       if (getPeso() < 1 && getPeso() > 19) {
                    setPrecio(getPrecio() + 500 + 100);
                    System.out.println("el nuevo precio es " + getPrecio());
                } else {
                    if (getPeso() > 20 && getPeso() < 49) {
                        setPrecio(getPrecio() + 500 + 500);
                        System.out.println("el nuevo precio es " + getPrecio());
                    } else {
                        if (getPeso() > 50 && getPeso() < 79) {
                            setPrecio(getPrecio() + 500 + 800);
                            System.out.println("el nuevo precio es " + getPrecio());
                        } else {
                            if (getPeso() < 80) {
                                setPrecio(getPrecio() + 500 + 1000);
                                System.out.println("el nuevo precio es " + getPrecio());
                            }}}}
                break;
            case 'E':
                      if (getPeso() < 1 && getPeso() > 19) {
                    setPrecio(getPrecio() + 300 + 100);
                    System.out.println("el nuevo precio es " + getPrecio());
                } else {
                    if (getPeso() > 20 && getPeso() < 49) {
                        setPrecio(getPrecio() + 300 + 500);
                        System.out.println("el nuevo precio es " + getPrecio());
                    } else {
                        if (getPeso() > 50 && getPeso() < 79) {
                            setPrecio(getPrecio() + 300 + 800);
                            System.out.println("el nuevo precio es " + getPrecio());
                        } else {
                            if (getPeso() < 80) {
                                setPrecio(getPrecio() + 300 + 1000);
                                System.out.println("el nuevo precio es " + getPrecio());
                            }}}}
                break;
            default:
                       if (getPeso() < 1 && getPeso() > 19) {
                    setPrecio(getPrecio() + 100 + 100);
                    System.out.println("el nuevo precio es " + getPrecio());
                } else {
                    if (getPeso() > 20 && getPeso() < 49) {
                        setPrecio(getPrecio() + 100 + 500);
                        System.out.println("el nuevo precio es " + getPrecio());
                    } else {
                        if (getPeso() > 50 && getPeso() < 79) {
                            setPrecio(getPrecio() + 100 + 800);
                            System.out.println("el nuevo precio es " + getPrecio());
                        } else {
                            if (getPeso() < 80) {
                                setPrecio(getPrecio() + 100 + 1000);
                                System.out.println("el nuevo precio es " + getPrecio());
                            }}}}
                break;

    }
}
}
