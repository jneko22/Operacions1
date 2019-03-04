/**
 * Created by eloy on 6/04/17.
 */
public class Principal {
    public static void main(String[] args){
        Factorial fact = new Factorial();
        try{
            double valor = fact.getIterativa(-3);
            System.out.println(valor);
        }
        catch (IllegalArgumentException e){
            System.out.println("No es poden fer servir nombres negatius.");
        }
    }
}
