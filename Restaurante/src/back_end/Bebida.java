// Piña Becerra Victor Osvaldo
package back_end;


public final class Bebida extends Producto{
    private int ml;
    private boolean esAlcoholica;

    public Bebida() {
    }

    public Bebida( String idProducto, String nombreProducto, double precio, String rutaImagen, int ml, boolean esAlcoholica) {
        super(idProducto, nombreProducto, precio, rutaImagen);
        this.ml = ml;
        this.esAlcoholica = esAlcoholica;
    }

    public int getMl() {
        return ml;
    }

    public void setMl(int ml) {
        this.ml = ml;
    }

    public boolean isEsAlcoholica() {
        return esAlcoholica;
    }

    public void setEsAlcoholica(boolean esAlcoholica) {
        this.esAlcoholica = esAlcoholica;
    }

    @Override
    public String toString() {
        return super.toString() + "\nMililitros: " + ml + "\nContiene alcohol?: " + esAlcoholica;
    }

    
    
}
