
package videolistas;


public class Nodo {
    Object valor;
    Nodo enlaceSiguiente, enlaceAnterior;
    
    //Creacion del nodo---------------------------------------------------------------------------
    public Nodo(Object v){
        
        valor = v;
        
        enlaceSiguiente = null;
        enlaceAnterior = null;
    }
    
    //Ver valor del nodo--------------------------------------------------------------------------
    public Object obtenerValor(){
        return valor;
    }
    
    //Enlazar con el soguiente nodo----------------------------------------------------------------
    public void enlazarSiguiente(Nodo n){
        enlaceSiguiente = n;
    }
    
    //Enlazar con el nodo anterior-------------------------------------------------------------------
    public void enlazarAnterior(Nodo n){
        enlaceAnterior = n;
    }
    
    //Ver la informacion en el enlace siguiente-----------------------------------------------------
    public Nodo obtenerSiguiente(){
        return enlaceSiguiente;
    }
    
    //Ver el valor del enlace anterior---------------------------------------------------------------
    public Nodo obtenerAnterior(){
        return enlaceAnterior;
    }
    
}
