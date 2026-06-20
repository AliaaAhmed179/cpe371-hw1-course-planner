import java.util.ArrayList;
import java.util.List;

public class CoursePlanner {
    private List<Course> courses;

    public CoursePlanner() {
        courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void listAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }
        for (Course c : courses) {
            System.out.println(c);
        }
    }

    public Course searchCourse(String courseCode) {
        for (Course c : courses) {
            if (c.getCourseCode().equalsIgnoreCase(courseCode)) {
                return c;
            }
        }
        return null;
    }

    public boolean registerStudent(String courseCode, String studentName) {
        Course course = searchCourse(courseCode);
        if (course == null) {
            System.out.println("Course not found.");
            return false;
        }
        boolean success = course.registerStudent(studentName);
        if (!success) {
            System.out.println("Course is full. Registration failed.");
        }
        return success;
    }

    public void displayFullCourses() {
        boolean foundAny = false;
        for (Course c : courses) {
            if (c.isFull()) {
                System.out.println(c);
                foundAny = true;
            }
        }
        if (!foundAny) {
            System.out.println("No courses are currently full.");
        }
    }
}