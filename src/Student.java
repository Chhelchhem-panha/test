public class Student extends Person{

    private int numCourse;
    private String course;
    private String grade;

    public Student(String name, String address, int numCourse, String grade, String course) {
        super(name, address);
        this.numCourse = numCourse;
        this.grade = grade;
        this.course = course;
    }

    public int getNumCourse() {
        return numCourse;
    }

    public String getCourse() {
        return course;
    }

    public String getGrade() {
        return grade;
    }
}
