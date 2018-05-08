
package videolistas;


public class VideoListas {

    
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        
        lista.añadirElemento("Nuevo elemento");//Añadir elementos
        lista.añadirElemento(83);
        lista.añadirElemento(9);
        lista.añadirElemento("Pablo Andres");
        
        for(int n = 0; n < lista.obtenerTamaño(); n++){
            System.out.println(n + ": " +lista.obtener(n));//Mostrar elementos
        }
        
        lista.eliminar(1);//Eliminar un elemento
        
        System.out.println("");
        System.out.println("nuevos elementos");
        for(int n = 0; n < lista.obtenerTamaño(); n++){
            System.out.println(n + ": " +lista.obtener(n));
        }
        
        lista.añadirUltimo("Buenas tardes");//Agregar un nodo al final
        
        System.out.println("");
        System.out.println("nuevos elementos");
        for(int n = 0; n < lista.obtenerTamaño(); n++){
            System.out.println(n + ": " +lista.obtener(n));
        }
        
        System.out.println("");//Modificar el primero nodo
        System.out.println("Ingrese nuevo valor");
        lista.modNodo(0);
        
        System.out.println("");
        System.out.println("Nuevo valor en 0");
        System.out.println(lista.obtener(0));
    }
    
}
