// Piña Becerra Victor Osvaldo
package back_end;


public final class Postre extends Producto{
    private int cantAzucar;
    private boolean glutenFree;

    public Postre() {
    }

    public Postre(String idProducto, String nombreProducto, double precio, String rutaImagen, int cantAzucar, boolean glutenFree) {
        super(idProducto, nombreProducto, precio, rutaImagen);
        this.cantAzucar = cantAzucar;
        this.glutenFree = glutenFree;
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        this.glutenFree = glutenFree;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad de azucar: " + cantAzucar + "\nLibre de gluten?: " + glutenFree;
    }
    
    
}
