import dependencies.*;
public class App {
    public static void main(String[] args) throws Exception {
        Triangle X = new Triangle();        
        Triangle Y = new Triangle();

        X.a = 4;
        Y.b = 6;

        double Z = X.a + Y.b;

        System.out.println(Z);
    }
}