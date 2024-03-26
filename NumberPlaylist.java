package LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberPlaylist {

    public static void main(String[] args)
    {
        List<Integer> np=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
            np.add(i);
        }

        Iterator<Integer> it=np.iterator();
        while(it.hasNext())
        {
            Integer i=it.next();
            System.out.println(i+" ");
        }
        System.out.println();

        //Here i have used the  Anonymous class
        class myConsumer implements Consumer<Integer> {
            @Override
            public void accept(Integer t) {

                System.out.println("Here using Anonymous class : "+t);
            }
        }
        myConsumer action1=new myConsumer();
        np.forEach(action1);
        System.out.println();

        //Explicit  Lambda Expression
        Consumer<Integer> action= n ->{
            System.out.println("Number List element by using Lambda Expression : "+n);
        };
        np.forEach(action);
        System.out.println();

        //Implicit Lambda Expression
        np.forEach(n ->{
            System.out.println("Number List element by using for Each is : "+n);
        });

        Function<Integer, Double> convertTodouble= n -> n.doubleValue();
        np.forEach(n -> System.out.println("Value after converting is : "+convertTodouble.apply(n)));
    }

}