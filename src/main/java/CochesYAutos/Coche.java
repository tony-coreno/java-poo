
package CochesYAutos;

public class Coche {
    
    //Atributos
    String marca;
    String color;
    int km;
    
    //Método main
    
    public static void main(String args[]){
        
        Coche coche1 = new Coche();
        coche1.color= "Blanco";
        coche1.marca= "VW";
        coche1.km = 0;
        System.out.println("El color es: "+coche1.color);
        
        
        
    }
    
    
}
