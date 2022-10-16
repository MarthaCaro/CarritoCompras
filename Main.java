package ejercicioCarrito;

public class Main {

    public static void main(String[] args) {

        // estado: Vacio
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto(10.0,"Pera");
        Producto producto2 = new Producto(15.0,"Naranja");
        Producto producto3 = new Producto(18.0,"Uva");

        // estado: Cargando
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);

        carrito.cancelarCompra();

        // estado: Vacio
        // estado: Cargando
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.mostrarProductos();

        carrito.siguienteEstado();
        //estado: Pagando

        carrito.agregarProducto(producto3);
        // Error
        
        carrito.anteriorEstado();

        //estado: cargando
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto3);

        carrito.siguienteEstado();
        //estado: Pagando

        carrito.siguienteEstado();
        //estado: Cerrado

        carrito.siguienteEstado();
        //estado: Vacio

    }
}
