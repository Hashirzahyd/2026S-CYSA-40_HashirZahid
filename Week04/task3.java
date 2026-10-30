import java.util.Scanner;

class Marksheet {
    private int rollNum;
    private String[] subjects;
    private int[] marks;

    public Marksheet(int rollNum, String[] subjects) {
        this.rollNum = rollNum;
        this.subjects = subjects;
        this.marks = new int[subjects.length];
    }

    public int getRollNum() {
        return rollNum;
    }

    public void takeInput(Scanner in) {
        System.out.println("Enter marks for Roll No " + rollNum + ":");
        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + ": ");
            marks[i] = in.nextInt();
        }
    }

    public void display() {
        System.out.println("Roll No: " + rollNum + " Marksheet");
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] mySubjects = {"Maths", "English", "Science", "Urdu"};
        
        Marksheet[] students = new Marksheet[3];
        students[0] = new Marksheet(41, mySubjects);
        students[1] = new Marksheet(22, mySubjects);
        students[2] = new Marksheet(3, mySubjects);

        while (true) {
            System.out.println("1. Update/Add Marks");
            System.out.println("2. View Marksheet");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");
            int choice = in.nextInt();

            if (choice == 0) {
                System.out.println("Exit.");
                break;
            }

            if (choice == 1 || choice == 2) {
                System.out.print("Enter Roll Number: ");
                int searchRoll = in.nextInt();
                boolean found = false;

                for (int i = 0; i < students.length; i++) {
                    if (students[i].getRollNum() == searchRoll) {
                        found = true;
                        if (choice == 1) {
                            students[i].takeInput(in);
                            students[i].display(); 
                        } else {
                            students[i].display(); 
                        }
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Roll Number not found!");
                }
            } else {
                System.out.println("Invalid option! Try again.");
            }
        }
        in.close();
    }
}