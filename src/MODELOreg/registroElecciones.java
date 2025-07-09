/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELOreg;
import MODELOobj.*;
/**
 *
 * @author rodri
 */
public class registroElecciones {
    private eleccion[] e;
    private int n ;
    private static final int MAX =100;

    public registroElecciones(){
    e = new eleccion[MAX];
    n=0;
}


 
  
    public int longitud(){
        return n ;
    }
    
    public void agregar (eleccion m){
        if (n<MAX) {
            e[n] = m;
        n++;
        }else{
            System.out.println("No hay Espacio en el Registro");
        }
            
    }
    
    public eleccion iesimo (int x){
        if (x>=0 && x<n) {
            return e[x];
        }
        return null;
    }
   
    public void saludar(){
        System.out.println("saluda carajo");
    }
    
     public void quitar(int indice) {
    if (indice < 0 || indice >= n) {
        System.out.println("Índice fuera de rango");
        return;
    }

    for (int i = indice; i < n - 1; i++) {
        e[i] = e[i + 1];
        
    }
    e[n- 1] = null;

    n--;
}
    
}