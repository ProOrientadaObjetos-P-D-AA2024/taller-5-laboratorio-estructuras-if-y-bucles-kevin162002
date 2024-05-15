package ejecutarproducto;

import java.util.Scanner;

/**
 *
 * @author KEVIN
 */
public class EjecutarProducto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de productos");
        int numProductos = sc.nextInt();
        
        System.out.println("Ingrese el precio del producto");
        int precio = sc.nextInt();
        
        Producto uno = new Producto(numProductos, precio);
        
        uno.setnProductos(numProductos);
        uno.setPrecio(precio);
        uno.setDescuento();
        uno.setPrecioFinal();
        
        System.out.println("");
        System.out.println("------------------------------");
        System.out.println("Productos: " + uno.getnProductos());
        System.out.println("Precio: " + uno.getPrecio());
        System.out.println("Descuento: " + uno.getDescuento());
        System.out.println("Precio Final: " + uno.getPrecioFinal());
    }
    
}
