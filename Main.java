import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== School Management ===");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Add Teacher");
            System.out.println("4. List Teachers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Enter Student Name: ");
                    String sname = sc.nextLine();
                    System.out.print("Enter Student Age: ");
                    int sage = sc.nextInt();
                    school.addStudent(new Management(sid, sname, sage));
                    break;

                case 2:
                    school.listStudents();
                    break;

                case 3:
                    System.out.print("Enter Teacher ID: ");
                    int tid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Teacher Name: ");
                    String tname = sc.nextLine();
                    System.out.print("Enter Subject: ");
                    String subject = sc.nextLine();
                    school.addTeacher(new Teacher(tid, tname, subject));
                    break;

                case 4:
                    school.listTeachers();
                    break;

                case 5:
                    System.out.println("Exiting application. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}