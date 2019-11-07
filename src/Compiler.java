import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Compiler {
   public String fname, lname,email,phone;
   public ArrayList<Education> educationArrayList=new ArrayList<>();
   public ArrayList<Exprience> exprienceArrayList=new ArrayList<>();
   public ArrayList<Skills> skillsArrayList=new ArrayList<>();
   ErrorCheck errorCheck=new ErrorCheck();


    public void display(ArrayList<Person> person) {

            Scanner key = new Scanner(System.in);
            person();
            education();
            exprience();
            skill();
            Person per= new Person(fname, lname, email,phone, educationArrayList, exprienceArrayList,skillsArrayList);
            person.add(per);
    }
    public void person(){
        fname=errorCheck.blankChecker("Enter your first name: ");
        lname=errorCheck.blankChecker("Enter your last name: ");
        email=errorCheck.blankEmailChecker("Enter your email address: ");
        phone=errorCheck.blankPhoneChecker("Enter your phone number: ");
        System.out.println(" ");
    }

    public void education(){
        Scanner key = new Scanner(System.in);

        String ver=" ";
        System.out.println("Do you to add educational achievements?(yes/no)");
        ver=key.next();
        if(ver.equalsIgnoreCase("yes")) {
            while (ver.equalsIgnoreCase("yes")) {

                System.out.println("Enter at least 1 educational achievement");
                String degree = errorCheck.blankChecker("Enter your degree type (Associate's, Bachelor's, Master's, PhD, etc.): ");
                String major = errorCheck.blankChecker("Enter  major: ");
                String university = errorCheck.blankChecker("Enter university name: ");
                String year = errorCheck.blankDateChecker("Enter your graduation year (only dd/MM/yyyy format accepted) : ");
                System.out.println(" ");
                educationArrayList.add(new Education(degree, major, university, year));
                System.out.println("Do you want to add another one?(yes/no)");
                ver = key.next();
            }
        }else{
            System.out.println(" ");
        }
    }
    public void exprience(){
        Scanner key = new Scanner(System.in);
        String ver=" ";
        System.out.println("Do you to add educational achievements?(yes/no)");
        ver=key.next();
        if(ver.equalsIgnoreCase("yes")) {
        while(ver.equalsIgnoreCase("yes")) {
        System.out.println("Enter at least 1 work experience");
        String company=errorCheck.blankChecker("Enter your company : ");
        String title=errorCheck.blankChecker("Enter your job title :" );
        String sDate=errorCheck.blankDateChecker("Enter start date (only dd/MM/yyyy format accepted):");
        String eDate=errorCheck.blankDateChecker("Enter end date (only dd/MM/yyyy format accepted):");
        String description=errorCheck.blankChecker("Enter job description : ");
        System.out.println(" ");
        exprienceArrayList.add(new Exprience(company, title,sDate,eDate,description));
        System.out.println("Do you want to add another one?(yes/no)");
        ver=key.next();
        }
        }else{
            System.out.println(" ");
        }

    }
    public void skill(){
        Scanner key = new Scanner(System.in);
        String ver=" ";
        System.out.println("Do you to add educational achievements?(yes/no)");
        ver=key.next();

        if(ver.equalsIgnoreCase("yes")) {
        while(ver.equalsIgnoreCase("yes")) {
        System.out.println("Enter at least 3 skills");
        String skill1=errorCheck.blankChecker("Enter your first skill : ");
        String prof1=errorCheck.blankChecker("Enter your rating/proficiency (Fundamental, Novice, Intermediate, Advanced, Expert): ");
        String skill2=errorCheck.blankChecker("Enter your second skill : ");
        String prof2=errorCheck.blankChecker("Enter your rating/proficiency (Fundamental, Novice, Intermediate, Advanced, Expert) : ");
        String skill3=errorCheck.blankChecker("Enter your third skill : ");
        String prof3=errorCheck.blankChecker("Enter your rating/proficiency (Fundamental, Novice, Intermediate, Advanced, Expert) : ");
        System.out.println(" ");
        skillsArrayList.add(new Skills(skill1,prof1,skill2,prof2,skill3,prof3));
        System.out.println("Do you want to add another one?(yes/no)");
            ver=key.next();
        }
        }else{
            System.out.println(" ");
        }

    }
}