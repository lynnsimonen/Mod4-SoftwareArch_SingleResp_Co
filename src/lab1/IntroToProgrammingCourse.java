package lab1;

import javax.swing.*;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author your name goes here
 * @version 1.00
 */
public class IntroToProgrammingCourse extends CourseAbstract{

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super.setCourseName(courseName);
        super.setCourseNumber(courseNumber);
    }

    @Override
    public String toString() {
        return super.toString() +
                "IntroToProgrammingCourse{}";
    }
}
