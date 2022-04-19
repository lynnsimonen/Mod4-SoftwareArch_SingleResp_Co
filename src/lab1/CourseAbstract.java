package lab1;
import javax.swing.*;

    public abstract class CourseAbstract {

        private String courseName;
        private String courseNumber;
        private double credits;

        public final String getCourseName() {
            return courseName;
        }

        public final void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public final String getCourseNumber() {
            return courseNumber;
        }

        public final void setCourseNumber(String courseNumber) {
            this.courseNumber = courseNumber;
        }

        public final double getCredits() {
            return credits;
        }

        public final void setCredits(double credits) {
            if (credits < 0.5 || credits > 4.0) {
                JOptionPane.showMessageDialog(null,
                        "Error: credits must be in the range 0.5 to 4.0");
                System.exit(0);
            }
            this.setCredits(credits);
        }

        @Override
        public String toString() {
            return "CourseAbstract{" +
                    "courseName='" + courseName + '\'' +
                    ", courseNumber='" + courseNumber + '\'' +
                    ", credits=" + credits +
                    '}';
        }
    }
