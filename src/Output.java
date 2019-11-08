import java.util.ArrayList;

public class Output {


    public void output(ArrayList<Person> per) {
        for (Person p : per) {
            System.out.println(p.getFname() + " " + p.getLname());
            System.out.println(p.getEmail());
            System.out.println(p.getPhone());
            System.out.println(" ");
            System.out.println("Education ");
            for (Education edu : p.getEducation()) {
                System.out.println(edu.getDegreeType() + " in " + edu.getMajor());
                System.out.println(edu.getUniversityName() + ", " + edu.getGraduationYear());
                System.out.println(" ");
            }
            System.out.println("Experience");
            for (Exprience exp : p.getExprience()) {
                System.out.println(exp.getJobTitle());
                System.out.println(exp.getCompany() + ", " + exp.getStartDate() + " - " + exp.getEndDate());
                System.out.println(exp.getDescription());
                System.out.println(" ");
            }
            System.out.println("Skills");
            for (Skills ski : p.getSkills()) {
                System.out.println(ski.getSkillName() + " " + ski.getProficiency());
                System.out.println(ski.getSkill1Name() + " " + ski.getProficiency1());
                System.out.println(ski.getSkill2Name() + " " + ski.getProficiency2());
                System.out.println(" ");
                System.out.println(" ");
            }
        }
    }
    }
