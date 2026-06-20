import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CoursePlanner planner = new CoursePlanner();
        Scanner scanner = new Scanner(System.in);

        // Sample seed data
        planner.addCourse(new Course("CPE371", "Software Engineering", 3, "Dr. Ahmad", 2));
        planner.addCourse(new Course("CPE201", "Data Structures", 3, "Dr. Salem", 1));

        boolean running = true;
        while (running) {
            System.out.println("\n=== Student Course Planner ===");
            System.out.println("1. Add a course");
            System.out.println("2. List all courses");
            System.out.println("3. Search for a course by code");
            System.out.println("4. Register a student in a course");
            System.out.println("5. Display all full courses");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Course code: ");
                    String code = scanner.nextLine();
                    System.out.print("Course name: ");
                    String name = scanner.nextLine();
                    System.out.print("Credits: ");
                    int credits = Integer.parseInt(scanner.nextLine());
                    System.out.print("Instructor: ");
                    String instructor = scanner.nextLine();
                    System.out.print("Capacity: ");
                    int capacity = Integer.parseInt(scanner.nextLine());
                    planner.addCourse(new Course(code, name, credits, instructor, capacity));
                    System.out.println("Course added.");
                    break;

                case "2":
                    planner.listAllCourses();
                    break;

                case "3":
                    System.out.print("Enter course code: ");
                    String searchCode = scanner.nextLine();
                    Course found = planner.searchCourse(searchCode);
                    System.out.println(found != null ? found : "Course not found.");
                    break;

                case "4":
                    System.out.print("Course code: ");
                    String regCode = scanner.nextLine();
                    System.out.print("Student name: ");
                    String student = scanner.nextLine();
                    boolean ok = planner.registerStudent(regCode, student);
                    if (ok) System.out.println("Registration successful.");
                    break;

                case "5":
                    planner.displayFullCourses();
                    break;

                case "6":
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}