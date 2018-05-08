
package videolistas;
import java.util.Scanner;

public class ListaDoblementeEnlazada {
    Nodo primero, ultimo;//Los nodos extremos
    int tamañoLista;//Tamaño de la lista
    
    Scanner entrada = new Scanner(System.in);
    
    public ListaDoblementeEnlazada(){
        primero = null;
        ultimo = null;
        tamañoLista = 0;
    }
    
    
    public void añadirElemento(Object valor){
        
        //Verificar si ya existe algun elemento en la lista, si no, crear una nueva lista
        if(tamañoLista == 0){
            primero = new Nodo(valor);
            ultimo = new Nodo(valor);
            
            //Si hay un elemento almenos, guardar el primero nodo, enlazarlo con el nuevo nodo y hacer del nuevo
            //el priemro nodo
        }else{
            Nodo auxiliar = primero;
            Nodo nuevo = new Nodo(valor);
            nuevo.enlazarSiguiente(auxiliar);
            primero = nuevo;
            auxiliar.enlazarAnterior(primero);
        }
        tamañoLista++;//Aumentar el tamaño
    }
    
    public void añadirUltimo(Object valor){
        //guardar el ultimo nodo, enlazarlo con el nuevo nodo y hacer del nuevo
        //el ultimo nodo
        Nodo auxiliar = ultimo;
        Nodo nuevo = new Nodo(valor);
        nuevo.enlazarAnterior(auxiliar);
        ultimo = nuevo;
        auxiliar.enlazarSiguiente(ultimo);
        tamañoLista++;
    }
    
    public Object obtener(int posicion){
        int cont = 0;
        Nodo temp = primero;
        
        if(posicion == obtenerTamaño()-1){//Si se desea ver el ultimo nodo
            temp = ultimo;
        }
        else{//Ir contando las posiciones e ir guardando los nodos por los que se pasa hasta detenerse en la posicion deseada
            while(cont < posicion){
            temp = temp.obtenerSiguiente();
            cont++;
        }
        }
        return temp.obtenerValor();//Retornar el nodo guardado
    }
    
    public void eliminar(int posicion){
        if(posicion == 0){
            primero = primero.obtenerSiguiente();
        }
        else if(posicion == obtenerTamaño()-1){
            ultimo = ultimo.obtenerAnterior();
        }
        else{//Ir contando las posiciones e ir guardando los nodos por los que se pasa hasta detenerse en la posicion deseada
            Nodo temp = primero;
            int contador = 0;
            while(contador < posicion-1){
                temp = temp.obtenerSiguiente();
                contador++;
            }
            temp.enlazarSiguiente(
                    temp.obtenerSiguiente().obtenerSiguiente()
            );//Saltarse le nodo siguiente, hasta el siguiente
            
//            temp.obtenerSiguiente().obtenerSiguiente().enlazarAnterior(temp);
        }
        
        tamañoLista--;
    }
    
    public void modNodo(int posicion){
        if(posicion == 0){
            Object a = entrada.next();
            añadirElemento(a);
            primero.enlazarSiguiente(primero.obtenerSiguiente().obtenerSiguiente());
            primero.obtenerSiguiente().enlazarAnterior(primero);
        }
    }
    
    public int obtenerTamaño(){
        return tamañoLista;
    }
}
