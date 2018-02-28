import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.function.Predicate;

public class exercise1 {

    //Lambda expressions are basically a way to access a function without having to create an object
    //So just like we have types like int,String,double and then a name for the value the lambda expression is also
    //a name for a function. Since Java doesnt have a type Function the lambda expression has to use an interface in
    //order for the compiler to understand what type it is
    //Since the lambda expression uses an interface to recognize what is what, some details used in a ordinary function
    //syntax are disregarded. For exmaple public void perform(){System.out.println("Hello World");} using an interface like
    //interface MyLambda(){ void perform();} can easily get rid of "public void perform" because the interface
    //already takes care of that so the lambda expression becomes MyLambda mylambda=()->{System.out.println("Hello World");}

    public static void main(String[] args){
        List<Person> people= Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Caroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Matthew","Arnold",30)
        );

        //Sort list ny last name
        Collections.sort(people,( h1, h2) -> h1.getLastname().compareTo(h2.getLastname()));

        System.out.println("Printing all persons");
        printConditionally(people,p-> true);

        //Method that prints all people with last name beginning with C
        System.out.println("Printing all persons with last name beginning with C");
        printConditionally(people, p-> p.getLastname().startsWith("C"));
    }

    //Method that prints based on the given condition which is a lambda expression passed that uses the functional interface
    //Predicate is an out of the box interface that has a ready test method which you can use for your lambda expression instead
    //of making your own interface like Condition(see further down in comments). Alot of these ready out of the box interfaces can
    //be found in java.util.function library
    private static void printConditionally(List<Person> people,Predicate<Person> condition){
        for (Person p:people) {
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

    //Interface used for lambda expression
    //interface Condition{
    //    boolean test(Person p);
    //}



}
