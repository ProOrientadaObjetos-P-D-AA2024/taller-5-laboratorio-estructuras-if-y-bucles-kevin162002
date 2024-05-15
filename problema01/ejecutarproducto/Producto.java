package ejecutarproducto;

/**
 *
 * @author KEVIN
 */
public class Producto {

    private int nProductos;
    private int precio;
    private double descuento;
    private double precioFinal;

    public Producto(int nProductos, int precio) {
        this.nProductos = nProductos;
        this.precio = precio;
    }

    public int getnProductos() {
        return nProductos;
    }

    public void setnProductos(int numero) {
        nProductos = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int p) {
        precio = p;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento() {

        if ((precio >= 1000) && (nProductos < 10)) {
            descuento = precio * 0.10;
        } else {
            if (precio < 1000) {
                descuento = precio * 0.05;
            }
        }
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal() {
        precioFinal = precio - descuento;
    }

}
