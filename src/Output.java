import java.util.ArrayList;

public class Output {


    public void output(ArrayList<Person> per) {

            System.out.println(per.get(0).getFname()+" "+per.get(0).getLname());
            System.out.println(per.get(0).getEmail());
            System.out.println(per.get(0).getPhone());
            System.out.println(" ");
            System.out.println("Education ");
            for(Education edu:per.get(0).getEducation()) {
                System.out.println(edu.getDegreeType() + " in " + edu.getMajor());
                System.out.println(edu.getUniversityName() + ", " + edu.getGraduationYear());
                System.out.println(" ");
            }
            System.out.println("Experience");
            for(Exprience exp:per.get(0).getExprience()) {
                System.out.println(exp.getJobTitle());
                System.out.println(exp.getCompany() + ", " + exp.getStartDate() + " - " + exp.getEndDate());
                System.out.println(exp.getDescription());
                System.out.println(" ");
            }
            System.out.println("Skills");
            for(Skills ski:per.get(0).getSkills()) {
                System.out.println(ski.getSkillName() + " " + ski.getProficiency());
                System.out.println(ski.getSkill1Name() + " " + ski.getProficiency1());
                System.out.println(ski.getSkill2Name() + " " + ski.getProficiency2());
            }
        }
    }
