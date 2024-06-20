public class Nombre extends Expression{
    private double valeurNombre;

    public Nombre(double valeurNombre) {
        this.valeurNombre = valeurNombre;
    }

    public double valeur() {
        return this.valeurNombre;
    } 

    public String toString() {
        return String.valueOf(this.valeurNombre);
    }
}
