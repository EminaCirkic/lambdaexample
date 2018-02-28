import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class exercise2 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 30)
        );

        //Sort list ny last name
        Collections.sort(people, (h1, h2) -> h1.getLastname().compareTo(h2.getLastname()));

        System.out.println("Printing all persons");
        performConditionally(people, p -> true,p->System.out.println(p));

        //Method that prints all people with last name beginning with C
        System.out.println("Printing all persons with last name beginning with C");
        performConditionally(people, p -> p.getLastname().startsWith("C"),p->System.out.println(p));

        //Method that prints all people with first name beginning with C
        System.out.println("Printing all persons with first name beginning with C");
        performConditionally(people, p -> p.getFistname().startsWith("C"),p->System.out.println(p.getFistname()));

    }


    //Further there is a way to make this method accept a behaviour instead of having hardcoded behaviour like
    //in exercise 2.Meaning there is an functional interface which can accept an input but does not need to give a result
    //so one can use this interface to make a lambda expression that is adaptable to any kind of behaviour
    //which we declare in our lambda expression. That out of the box interface is called Consumer also avaliable
    //in the java.util.funtion library
    private static void performConditionally(List<Person> people, Predicate<Person> condition, Consumer<Person> behaviour) {
        for (Person p : people) {
            if (condition.test(p)) {
                behaviour.accept(p);
            }
        }
    }



}