public class Entrada {
   
    private String pelicula;
    private double precioBase;
    private int edadEspectador;


    public Entrada(String pelicula, double precioBase, int edadEspectador) {
        this.pelicula = pelicula;
        this.precioBase = precioBase < 0 ? 0 : precioBase;
        this.edadEspectador = edadEspectador < 0 ? 0 : edadEspectador;
    }

 
    public boolean tieneDescuento() {
        return edadEspectador < 12 || edadEspectador > 65;
    }


    public double calcularPrecioFinal() {
        if (tieneDescuento()) {
            return precioBase * 0.5;
        }
        return precioBase;
    }


    public void mostrarEntrada() {
       
        System.out.println("Película: " + pelicula);
        System.out.println("Edad del espectador: " + edadEspectador + " años");
        System.out.println("¿Tiene descuento?: " + (tieneDescuento() ? "Sí (50% de descuento)" : "No"));
        System.out.println("Precio final: $" + calcularPrecioFinal());
        
    }
}