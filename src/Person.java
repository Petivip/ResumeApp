import java.util.ArrayList;

public class Person {

    private String fname;
    private String lname;
    private String email;
    private String phone;
    private ArrayList<Education> education;
    private ArrayList<Exprience> exprience;
    private ArrayList<Skills> skills;

    public Person() {
    }
    public Person(String fname, String lname,String email,String phone,ArrayList<Education> educ, ArrayList<Exprience> expr,ArrayList<Skills> skil){
        this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.phone=phone;
        this.education=educ;
        this.exprience= expr;
        this.skills=skil;


    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public ArrayList<Exprience> getExprience() {
        return exprience;
    }

    public void setExprience(ArrayList<Exprience> exprience) {
        this.exprience = exprience;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }


}
