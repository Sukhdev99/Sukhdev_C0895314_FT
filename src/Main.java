// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Constructing the expression 3 + 2 * 5
        ArithmeticExp ae = new Sum(
                new Number(10),
                new Product(
                        new Number(7),
                        new Number(8)
                )
        );
        System.out.println("Addition and Multiplication");
        System.out.println("Expression: " + ae.toString());
        System.out.println("Result: " + evaluate(ae));


        System.out.println("Division");
        ArithmeticExp ae2 = new Modulo(new Number(300), new Number(30));
        System.out.println("Expression: " + ae2.toString());
        System.out.println("Result: " + evaluate(ae2));



}

    /** Evaluating the expression recursively */
    public static int evaluate(ArithmeticExp term) {
        return term.evaluate();
    }
}