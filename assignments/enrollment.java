
import java.util.*;
public class enrollment {
    static Stack<String> s = new Stack<>();
    static Scanner sc = new Scanner(System.in);
    static void enroll() {
        System.out.print("enter name: ");
        String name = sc.nextLine();
        s.push(name);
        System.out.println("Learner enrolled successfully");
    }
    static void undo() {
        if (s.isEmpty()) {
            System.out.println("no enrollment to undo");
        } else {
            System.out.println("removed: " + s.pop());
        }
    }
    static void show() {
        if (s.isEmpty()) {
            System.out.println("No learners available");
        } else {
            System.out.println("Last enrolled: " + s.peek());
        }
    }
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n1. enroll 2.undo 3.shiw 4.exit");
            System.out.print("enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    enroll();
                    break;
                case 2:
                    undo();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 4);
        sc.close();
    }
}
