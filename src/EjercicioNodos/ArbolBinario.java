package EjercicioNodos;

public class ArbolBinario {
    Nodo raiz;
    public ArbolBinario(){
        raiz=null;
    }
    
    public void insertar(int i, Object fruta){
        Nodo n = new Nodo(i);
        n.datos = fruta;
        if (raiz==null){
            raiz=n;
        }
        else{
            Nodo aux = raiz;
            while(aux!=null){
                n.primero = aux;
                if(n.llave >= aux.llave){
                    aux=aux.derecha;
                }
                else{
                    aux=aux.izquierda;
                }
            }
            if (n.llave < n.primero.llave){
                n.primero.izquierda = n;
            } 
            else{
                n.primero.derecha = n;
            }          
        }   
    }
    
    public void recorrer(Nodo n){
        if (n !=null){
            recorrer(n.izquierda);
            System.out.println("Indice "+n.llave+"fruta "+n.datos);
            recorrer(n.derecha);
        }
    }
    
    private class Nodo{
        public Nodo primero;
        public Nodo izquierda;
        public Nodo derecha;
        public int llave;
        public Object datos;
        
        public Nodo(int indice){
            llave=indice;
            izquierda=null;
            derecha=null;
            primero=null;
            datos=null;
        }
    }
}