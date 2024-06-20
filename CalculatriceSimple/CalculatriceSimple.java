public class CalculatriceSimple {
    public static void main(String[] args) {
        /* 
        Nombre six = new Nombre(6);
        Nombre dix = new Nombre(10);
        Nombre zero = new Nombre(0);

        Operation s = new Soustraction(dix,six) ;
        System.out.println(s + " = " + s.valeur()) ; // doit afficher : (10 – 6) = 4
        Operation a = new Addition(dix, six);
        System.out.println(a + " = " + a.valeur()) ; // doit afficher : (10 + 6) = 16
        Operation m = new Multiplication(dix, six);
        System.out.println(m + " = " + m.valeur()) ; // doit afficher : (10 * 6) = 60 
        Operation d1 = new Division(dix, six);
        System.out.println(d1 + " = " + d1.valeur()) ; // doit afficher : (10 / 6) = 1 car le type est int et pas float/double 

        try {
            Operation d2 = new Division(dix, zero);
            System.out.println(d2 + " = " + d2.valeur()); // doit afficher : (Erreur : Division par 0 impossible)
        } catch (ArithmeticException e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        */

        Expression deux = new Nombre(2) ;
        Expression trois = new Nombre(0) ;
        Expression dixSept = new Nombre(17);
        Expression s = new Soustraction(dixSept, deux) ;
        Expression a = new Addition(deux, trois) ;
        Expression d = new Division(deux, trois) ;
        System.out.println(d +"=" + d.valeur()); // affiche ((17 - 2) / (2 + 3)) = 3

        
        
    }
}