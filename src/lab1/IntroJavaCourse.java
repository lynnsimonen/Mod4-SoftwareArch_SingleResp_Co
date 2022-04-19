package lab1;

/**
 * Describe responsibilities here.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroJavaCourse extends CourseAbstract {

    String prerequisites;


    public IntroJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseName(courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return super.toString() +
                "IntroJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
