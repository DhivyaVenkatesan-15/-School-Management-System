import java.util.ArrayList;

public class School {
    private ArrayList<Management> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();

    public void addStudent(Management s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void addTeacher(Teacher t) {
        teachers.add(t);
        System.out.println("Teacher added successfully!");
    }

    public void listStudents() {
        System.out.println("\n--- STUDENTS LIST ---");
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Management s : students) {
                System.out.println(s);
            }
        }
    }

    public void listTeachers() {
        System.out.println("\n--- TEACHERS LIST ---");
        if (teachers.isEmpty()) {
            System.out.println("No teachers found.");
        } else {
            for (Teacher t : teachers) {
                System.out.println(t);
            }
        }
    }
}