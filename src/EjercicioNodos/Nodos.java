/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioNodos;

/**
 *
 * @author Alan De Nova
 */
public class Nodos {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        
        arbol.insertar(20,"nodo");
        arbol.insertar(23,"nodo");
        arbol.insertar(0,"null");
        arbol.insertar(57,"null");
        arbol.insertar(0,"Null");
        arbol.insertar(19,"nodo");
        arbol.insertar(67,"nodo");
        arbol.insertar(99,"nodo");
        arbol.insertar(0,"null");
        
        arbol.recorrer(arbol.raiz);
        
    }
    
}