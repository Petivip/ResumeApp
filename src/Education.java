public class Education {
    private String degreeType;

    public Education(String degreeType, String major, String universityName, String graduationYear) {
        this.degreeType = degreeType;
        this.major = major;
        this.universityName = universityName;
        this.graduationYear = graduationYear;
    }

    private String major;
    private String universityName;
    private String graduationYear;

    public Education() {
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }


}
