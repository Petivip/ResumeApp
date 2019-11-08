import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner key=new Scanner(System.in);
        ArrayList<Person> person=new ArrayList<>();
        String var="yes";
        while(var.equalsIgnoreCase("yes")) {
            Compiler compiler = new Compiler();
            compiler.display(person);
            System.out.println("Do you want to add another resume?");
            if(key.next().equalsIgnoreCase("no")){
                var="no";
            }
        }
            System.out.println(" ");
            Output output = new Output();
            output.output(person);
    }

    }

