package ejercicioCarrito;

public class Vacio implements EstadoCarrito {

    Carrito carrito;

    public Vacio(Carrito carrito) {
        System.out.println("Estado: Vacio");
        this.carrito = carrito;
    }

    @Override
    public void agregarProducto(Producto producto) {
        carrito.setEstado(new Cargando(carrito));
        carrito.getProductos().add(producto);
        System.out.println("se agrega producto con exito: "+producto.toString());
    }

    @Override
    public void cancelarCompra() {
        System.out.println("Error: El carrito ya esta vacío.");
    }

    @Override
    public void siguienteEstado() {
        carrito.setEstado(new Cargando(carrito));
    }

    @Override
    public void anteriorEstado() {
        System.out.println("Error: Este es el primer paso");
    }
}
