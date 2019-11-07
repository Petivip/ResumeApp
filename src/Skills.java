public class Skills {

    private String skillName;
    private String proficiency;
    private String skill1Name;
    private String proficiency1;
    private String skill2Name;
    private String proficiency2;



    public Skills() {
    }

    public Skills(String skillName, String proficiency, String skill1Name, String proficiency1, String skill2Name, String proficiency2) {
        this.skillName = skillName;
        this.proficiency = proficiency;
        this.skill1Name = skill1Name;
        this.proficiency1 = proficiency1;
        this.skill2Name = skill2Name;
        this.proficiency2 = proficiency2;
    }

    public String getSkill1Name() {
        return skill1Name;
    }

    public void setSkill1Name(String skill1Name) {
        this.skill1Name = skill1Name;
    }

    public String getProficiency1() {
        return proficiency1;
    }

    public void setProficiency1(String proficiency1) {
        this.proficiency1 = proficiency1;
    }

    public String getSkill2Name() {
        return skill2Name;
    }

    public void setSkill2Name(String skill2Name) {
        this.skill2Name = skill2Name;
    }

    public String getProficiency2() {
        return proficiency2;
    }

    public void setProficiency2(String proficiency2) {
        this.proficiency2 = proficiency2;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }



}
