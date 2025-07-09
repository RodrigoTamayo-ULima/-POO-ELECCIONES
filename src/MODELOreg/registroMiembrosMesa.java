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
public class registroMiembrosMesa {
    private miembroMesa[] registroMiembroMesa;
    private int n ;
    private static final int MAX =100;

    public registroMiembrosMesa(){
    registroMiembroMesa = new miembroMesa[MAX];
    n=0;
}


 
  
    public int longitud(){
        return n ;
    }
    
    public void agregar (miembroMesa m){
        if (n<MAX) {
            registroMiembroMesa[n] = m;
        n++;
        }else{
            System.out.println("No hay Espacio en el Registro");
        }
            
    }
    
    public miembroMesa iesimo (int x){
        if (x>=0 && x<n) {
            return registroMiembroMesa[x];
        }
        return null;
    }
    
    public void quitar(int indice) {
    if (indice < 0 || indice >= n) {
        System.out.println("Índice fuera de rango");
        return;
    }

    for (int i = indice; i < n - 1; i++) {
        registroMiembroMesa[i] = registroMiembroMesa[i + 1];
        
    }

    registroMiembroMesa[n- 1] = null;

    n--;
}
    
}