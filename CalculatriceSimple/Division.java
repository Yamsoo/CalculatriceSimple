public class Division extends Operation {
    
    public Division(Expression Val1, Expression Val2) {
        super(Val1, Val2);
    }

    public double valeur() {
        if (getOperande2().valeur() == 0) {
            throw new ArithmeticException("Division par 0 impossible");
        }
        return getOperande1().valeur()/getOperande2().valeur();
    } 

    public String toString() {
        return ("("+getOperande1()+" / "+getOperande2()+")");
    }
}

