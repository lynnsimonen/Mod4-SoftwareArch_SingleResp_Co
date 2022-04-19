package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here.
 *
 * @author Lynn Simonen
 * @version 1.00
 */
public class AdvancedJavaCourse extends CourseAbstract {

    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return super.toString() +
                "AdvancedJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }





}
