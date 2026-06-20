import java.util.ArrayList;
import java.util.List;

public class CourseSoftware {
    private String courseCode;
    private String courseName;
    private int credits;
    private String instructor;
    private int capacity;
    private List<String> registeredStudents;

    public CourseSoftware(String courseCode, String courseName, int credits,
                  String instructor, int capacity) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
        this.instructor = instructor;
        this.capacity = capacity;
        this.registeredStudents = new ArrayList<>();
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public int getCredits() { return credits; }
    public String getInstructor() { return instructor; }
    public int getCapacity() { return capacity; }
    public List<String> getRegisteredStudents() { return registeredStudents; }

    public boolean isFull() {
        return registeredStudents.size() >= capacity;
    }

    public boolean registerStudent(String studentName) {
        if (isFull()) {
            return false;
        }
        registeredStudents.add(studentName);
        return true;
    }

    @Override
    public String toString() {
        return courseCode + " - " + courseName +
               " (" + credits + " credits) | Instructor: " + instructor +
               " | Enrolled: " + registeredStudents.size() + "/" + capacity;
    }
}
