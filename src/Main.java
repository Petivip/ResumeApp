import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Person> person=new ArrayList<>();

            Compiler compiler = new Compiler();
            compiler.display(person);
            System.out.println(" ");
            Output output = new Output();
            output.output(person);
    }

    }

