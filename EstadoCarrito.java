package ejercicioCarrito;

public interface EstadoCarrito {

    void agregarProducto(Producto producto);

    void cancelarCompra();

    void siguienteEstado();

    void anteriorEstado();
}
