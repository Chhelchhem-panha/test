public class Student extends Person{

    int numCourse;
    String course;
    String grade;

    public Student(String name, String address, int numCourse, String grade, String course) {

        super(name, address);
        this.numCourse = numCourse;
        this.grade = grade;
        this.course = course;
    }

}
