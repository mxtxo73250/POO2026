public class Student {
    private final String studentId;
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;

    public Student(String studentId, String name, double grade1, double grade2, double grade3) {
        this.studentId = studentId;
        this.name = (name != null && !name.trim().isEmpty()) ? name : "Unknown";
        this.grade1 = isValidGrade(grade1) ? grade1 : 0.0;
        this.grade2 = isValidGrade(grade2) ? grade2 : 0.0;
        this.grade3 = isValidGrade(grade3) ? grade3 : 0.0;
    }

    private boolean isValidGrade(double grade) {
        return grade >= 0.0 && grade <= 5.0;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public boolean setName(String newName) {
        if (newName != null && !newName.trim().isEmpty()) {
            this.name = newName;
            return true;
        }
        return false;
    }

    public double getGrade1() {
        return grade1;
    }

    public boolean setGrade1(double grade) {
        if (isValidGrade(grade)) {
            this.grade1 = grade;
            return true;
        }
        return false;
    }

    public double getGrade2() {
        return grade2;
    }

    public boolean setGrade2(double grade) {
        if (isValidGrade(grade)) {
            this.grade2 = grade;
            return true;
        }
        return false;
    }

    public double getGrade3() {
        return grade3;
    }

    public boolean setGrade3(double grade) {
        if (isValidGrade(grade)) {
            this.grade3 = grade;
            return true;
        }
        return false;
    }

    public double getAverage() {
        return (grade1 + grade2 + grade3) / 3.0;
    }
}