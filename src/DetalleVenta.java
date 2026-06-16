public class DetalleVenta {
    private int idDetalle;
    private int cantidad;
    private double subtotal;
    private Producto producto;

    public DetalleVenta(int id, int cant, Producto prod) {
        this.idDetalle = id;
        this.cantidad = cant;
        this.producto = prod;
        this.subtotal = calcularSubtotal();
    }

    public int getIdDetalle() { return idDetalle; }
    public int getCantidad() { return cantidad; }
    
    public void setCantidad(int cant) { 
        this.cantidad = cant; 
        this.subtotal = calcularSubtotal(); 
    }

    public Producto getProducto() { return producto; }
    public void setProducto(Producto prod) { 
        this.producto = prod; 
        this.subtotal = calcularSubtotal();
    }

    private double calcularSubtotal() {
        if (producto != null) {
            return this.cantidad * producto.getPrecioVenta();
        }
        return 0.0;
    }

    public double getSubtotal() { return subtotal; }

   
    public String toString() {
        return "DetalleVenta{" + "id=" + idDetalle + ", cant=" + cantidad + ", subtotal=" + subtotal + '}';
    }
}