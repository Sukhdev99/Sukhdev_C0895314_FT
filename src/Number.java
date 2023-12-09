public class Number extends ArithmeticExp{

    public int value; // this will contain the number

    public Number(int value){
        this.value = value;

    }

    @Override
    public int evaluate() {

        return value;
    }
}
