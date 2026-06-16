public class Main {

    public static void main(String[] args) {

       
        Categoria categoria = new Categoria(1, "Electrónicos");

      
        Producto producto1 = new Producto(101, "Laptop", 500.00, 650.00, categoria);
        Producto producto2 = new Producto(102, "Mouse", 10.00, 15.00, categoria);

       
        Cliente cliente = new Cliente(1, "Juan Pérez");
        cliente.setTelefono("7777-7777");
        cliente.setEmail("juan@gmail.com");

    
        Empleado empleado = new Empleado(1, "María López", "Vendedora");
        empleado.setDireccion("San Salvador");
        empleado.setFechaIngreso("15/06/2026");
        empleado.setHorarioEntrada("08:00");
        empleado.setHorarioSalida("17:00");

       
        Venta venta = new Venta(1001, "15/06/2026", cliente, empleado);

    
        DetalleVenta detalle1 = new DetalleVenta(1, 2, producto1);
        DetalleVenta detalle2 = new DetalleVenta(2, 3, producto2);

       
        venta.agregarDetalle(detalle1);
        venta.agregarDetalle(detalle2);

       
        System.out.println("===== CATEGORIA =====");
        System.out.println(categoria);

        System.out.println("\n===== PRODUCTOS =====");
        System.out.println(producto1);
        System.out.println(producto2);

        System.out.println("\n===== CLIENTE =====");
        System.out.println(cliente);

        System.out.println("\n===== EMPLEADO =====");
        System.out.println(empleado);

        System.out.println("\n===== DETALLES DE VENTA =====");
        System.out.println(detalle1);
        System.out.println(detalle2);

        System.out.println("\n===== VENTA =====");
        System.out.println(venta);

        System.out.println("\nTotal calculado: $" + venta.calcularTotal());
    }
}

