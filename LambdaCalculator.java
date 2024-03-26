package LambdaExpression;

@FunctionalInterface
interface Mathcalculator{
    public int calculator(int a, int b);
    static void printResult(int a,int b,String Functions,Mathcalculator obj){
        System.out.println("Result of " + Functions + " is " + obj.calculator(a,b));
    }
}

public class LambdaCalculator {
    public static void main(String[] args) {
        Mathcalculator sub = (a,b)-> a - b ;

        Mathcalculator div = (a,b)-> a / b ;

        Mathcalculator add = (a,b)-> a + b ;


        System.out.println("Calculator using the Lambda Functions with printresult ");

        Mathcalculator.printResult(100,20,"Addition",add);
        Mathcalculator.printResult(100,20,"Substrraction",sub);
        Mathcalculator.printResult(20,20,"Division",div);




    }
}
