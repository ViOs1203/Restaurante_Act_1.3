// Piña Becerra Victor Osvaldo
package back_end;


public final class Platillo extends Producto {
    private double peso;
    private int calorias;

    public Platillo() {
    }

    public Platillo( String idProducto, String nombreProducto, double precio, String rutaImagen, double peso, int calorias) {
        super(idProducto, nombreProducto, precio, rutaImagen);
        this.peso = peso;
        this.calorias = calorias;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPeso: " + peso + "\nCalorias: " + calorias;
    }
    
    
    
    
}
