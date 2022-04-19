package lab1;
public class Main {
    public static void main(String[] args) {
        CourseAbstract course1 = new AdvancedJavaCourse("The Advanced Java Course", "J123");
        CourseAbstract course2 = new IntroJavaCourse("Intro to Java Course", "P111");
        CourseAbstract course3 = new IntroToProgrammingCourse("Intro To Programming Course", "P123");

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
