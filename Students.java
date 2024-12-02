
import java.util.Scanner;

class Student {
    String usn;
    String name;
    int[] marks = new int[3];
    int[] credits = new int[3];

    // Constructor to initialize credits
    Student() {
        credits[0] = 4;
        credits[1] = 3;
        credits[2] = 2;
    }

    void getDetails() {
        Scanner sc = new Scanner(System.in); 

        System.out.println("Enter USN:");
        usn = sc.nextLine();

        System.out.println("Enter Name:");
        name = sc.nextLine(); 

        System.out.println("Enter marks in 3 subjects:");
        for (int i = 0; i < 3; i++) {
            marks[i] = sc.nextInt();
        }
    }

    int compute(int mark) {
        if (mark >= 90) {
            return 10;
        } else if (mark >= 80) {
            return 9;
        } else if (mark >= 70) {
            return 8;
        } else if (mark >= 60) {
            return 7;
        } else {
            return 0; 
        }
    }

    double sgpa() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < 3; i++) {
            totalPoints += credits[i] * compute(marks[i]);
            totalCredits += credits[i];
        }

        return totalCredits > 0 ? totalPoints / totalCredits : 0;
    }
}

public class Students {
    public static void main(String[] args) {
        int size = 3;
        Student[] arrayObj = new Student[size]; 
        for (int i = 0; i < size; i++) {
            arrayObj[i] = new Student();
            arrayObj[i].getDetails();
            double ans = arrayObj[i].sgpa();
            System.out.println("SGPA for Student " + (i + 1) + ": " + ans);
        }
    }
}
