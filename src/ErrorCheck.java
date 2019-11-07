import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
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
                if (!isValidFormat("dd/MM/yyyy",Name)) {
                    //throw and exception
                    throw new NullPointerException("Please use the right date format as specified above");
                }
            } catch (NullPointerException e) {
                //print the exception
                System.out.println(e.getMessage());
            }

        } while (!isValidFormat("dd/MM/yyyy",Name));

        return Name;

    }
    public static boolean isValidFormat(String format, String value) {
        Date date = null;
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            date = sdf.parse(value);
            if (!value.equals(sdf.format(date))) {
                date = null;
            }
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        return date != null;
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

}
