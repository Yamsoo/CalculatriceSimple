public class Multiplication  extends Operation {
    
    public Multiplication (Expression Val1, Expression Val2) {
        super(Val1, Val2);
    }

    public double valeur() {
        return getOperande1().valeur()*getOperande2().valeur();
    } 

    public String toString() {
        return ("("+getOperande1()+" * "+getOperande2()+")");
    }
}
