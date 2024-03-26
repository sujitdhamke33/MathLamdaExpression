package LambdaExpression;

@FunctionalInterface
interface Mathcalculator{
    public int calculator(int a, int b);
}

public class LambdaCalculator {
    public static void main(String[] args) {
        System.out.println("Calculator using the Lambda Functions");

        Mathcalculator add = (a,b)-> a + b ;
        System.out.println("Addition : " + add.calculator(10,20));
        Mathcalculator sub = (a,b)-> a - b ;
        System.out.println("Substraction : " + sub.calculator(40,20));
        Mathcalculator div = (a,b)-> a / b ;
        System.out.println("Division : " + div.calculator(20,10));

    }
}
