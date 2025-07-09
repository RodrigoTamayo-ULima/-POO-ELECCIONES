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
public class registroActas {
    private actaElectoral[]a;
    private int n;

    public registroActas() {
        a= new actaElectoral[100];
        n=0;
    }
    
    public void agregar(actaElectoral p) {

        if (n < 100) {
            a[n]=p;
            n++;
     
    }
    }
    public int longitud(){
        return n;
    }
    
    

    
    
    public actaElectoral iesimo (int n){
        if (n>=0 && n<100) {
            return a[n];
        }
        else{return null;}
       
        
    }
     public void quitar(int indice) {
    if (indice < 0 || indice >= n) {
        System.out.println("Índice fuera de rango");
        return;
    }

    for (int i = indice; i < n - 1; i++) {
        a[i] = a[i + 1];
        
    }
    a[n- 1] = null;

    n--;
}
    
}
    
    
    
    
    
    
    
    

