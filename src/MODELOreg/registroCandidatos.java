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
public class registroCandidatos {

    private candidato[] c;
    private int n;
    private static final int MAX = 100;


    public registroCandidatos() {
        c = new candidato[MAX];
        n = 0;
      
    }

    public void agregarCandidato(candidato p) {

        if (n < MAX) {
            c[n]=p;
            n++;
     
    }
    }
    public int longitud(){
        return n;
    }
    
    public void eliminarCandidato(String nombre) {
        String a = nombre.trim();
        for (int i = 0; i < c.length; i++) {

            if (a.equals(c[i].getNombre().trim())) {
                for (int j = 0; j < c.length - 1; j++) {
                    c[j] = c[j + 1];
                }
                c[c.length - 1] = null;
                n--;
            }
        }

    }
    
    public candidato iesimo (int n){
        if (n>=0 && n<MAX) {
            return c[n];
        }
        else{return null;}
       
        
    }
    
     public void quitar(int indice) {
    if (indice < 0 || indice >= n) {
        System.out.println("Índice fuera de rango");
        return;
    }

    for (int i = indice; i < n - 1; i++) {
        c[i] = c[i + 1];
        
    }
    c[n- 1] = null;

    n--;
}
    
}