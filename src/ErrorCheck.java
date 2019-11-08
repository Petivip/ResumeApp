import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ErrorCheck {

    //blank space checker
    public  String blankChecker(String sent ) throws NullPointerException{
        Scanner sc = new Scanner(System.in);
        String rName;

        do {

            System.out.print(sent);
            rName = sc.nextLine();
            try {
                if (rName.isEmpty()) {
                    //throw and exception
                    throw new NullPointerException("Space cannot be blank");
                }
            } catch (NullPointerException e) {
                //print the exception
                System.out.println(e.getMessage());
            }

        } while (rName.isEmpty());

        return rName;
    }

    //blank space and date format checker

    public  String blankDateChecker(String sent ) throws NullPointerException{
        Scanner sc = new Scanner(System.in);
        String Name;

        do {

            System.out.print(sent);
            Name = sc.nextLine();
            try {
                if (!isValidDate(Name)) {
                    //throw and exception
                    throw new NullPointerException("Please use the right date format as specified above");
                }
            } catch (NullPointerException e) {
                //print the exception
                System.out.println(e.getMessage());
            }

        } while (!isValidDate(Name));

        return Name;

    }
    public static boolean isValidDate(String d)
    {
        String regex = "^(1[0-2]|0[1-9])/(3[01]"
                + "|[12][0-9]|0[1-9])/[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher((CharSequence)d);
        return matcher.matches();
    }



    //email format checker

    public  String blankEmailChecker(String sent ) throws NullPointerException{
        Scanner sc = new Scanner(System.in);
        String Name;

        do {

            System.out.print(sent);
            Name = sc.nextLine();
            try {
                if (!isValid(Name)) {
                    //throw and exception
                    throw new NullPointerException("please use the right Email format");
                }
            } catch (NullPointerException e) {
                //print the exception
                System.out.println(e.getMessage());
            }

        } while (!isValid(Name));

        return Name;

    }

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

  //blank and phone number checker

    public  String blankPhoneChecker(String sent ) throws NullPointerException{
        Scanner sc = new Scanner(System.in);
        String Name;

        do {

            System.out.print(sent);
            Name = sc.nextLine();
            try {
                if (!validatePhoneNumber(Name)) {
                    //throw and exception
                    throw new NullPointerException("please put valid phone number ");
                }
            } catch (NullPointerException e) {
                //print the exception
                System.out.println(e.getMessage());
            }

        } while (!validatePhoneNumber(Name));

        return Name;

    }
  private static boolean validatePhoneNumber(String phoneNo) {
      //validate phone numbers of format "1234567890"
      if (phoneNo.matches("\\d{10}")) return true;
          //validating phone number with -, . or spaces
      else if(phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) return true;
          //validating phone number with extension length from 3 to 5
      else if(phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) return true;
          //validating phone number where area code is in braces ()
      else if(phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) return true;
          //return false if nothing matches the input
      else return false;

  }

  //The right word checker

    public  String blankWordChecker(String sent ) throws NullPointerException{
        Scanner sc = new Scanner(System.in);
        String Name;
        boolean check=false;

        do {

            System.out.print(sent);
            Name = sc.nextLine();
            if(Name.equalsIgnoreCase("Fundamental" )||Name.equalsIgnoreCase("Novice")||Name.equalsIgnoreCase("Intermediate")||Name.equalsIgnoreCase("Advanced")||Name.equalsIgnoreCase("expert")){
                check=true;
            }
            try {
                if (!check){
                    //throw and exception
                    throw new NullPointerException("please choose and put one of the above specified words");
                }
            } catch (NullPointerException e) {
                //print the exception
                System.out.println(e.getMessage());
            }

        } while (!check);

        return Name;

    }


}
