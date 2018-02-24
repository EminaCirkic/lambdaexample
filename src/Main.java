public class Main {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Main greeter=new Main();

      Greeting myLambdaFunction= ()-> System.out.println("Hello World!");
      MyAdd addFunction= (int a,int b)->a+b;

      myLambdaFunction.perform();
    }
}

interface MyAdd{
    int addup(int a,int b);
}