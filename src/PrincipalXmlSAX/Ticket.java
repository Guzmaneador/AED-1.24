package PrincipalXmlSAX;

import java.util.ArrayList;

/**
 *
 * @author 2dama
 */
public class Ticket {
    private ArrayList <Producto> listaProductos;
    int numeroProducto=0;

    public Ticket() {
        this.listaProductos = new ArrayList<>();
 
        


    }
     public void añadirProducto(int numeroProducto){
       for (int i = 0; i < numeroProducto; i++) {
            listaProductos.add(new Producto());
        }
        this.numeroProducto += numeroProducto;
    }
    
}
