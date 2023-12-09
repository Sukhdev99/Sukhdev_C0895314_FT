public abstract class Binary extends ArithmeticExp{

    protected ArithmeticExp left;

    protected ArithmeticExp right;
    protected String opp;

    public Binary(ArithmeticExp left, ArithmeticExp right, String opp){
        this.left = left;
        this.right = right;
        this.opp = opp;
    }

}
