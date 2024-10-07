/*import java.util.Scanner;

class Student{
String usn;
String name;
int[] marks=new marks[3];
int[] credits=new int[3];
credits[0]=4;
credits[1]=3;
credits[2]=2; 


Scanner sc=new Scanner(System.In);

System.out.println("Enter usn");
usn=sc.nextln();

System.out.println("Enter name");
name=sc.nextln(0;

System.out.println("Enter marks in 3 subjects");
for(int i=0;i<3;i++){
marks[i]=sc.nextInt();}

int compute(int marks){
if(marks[i]>=90){
return 10;}
else if(marks[i]>=80){
return 9;}
else if(marks[i]>=70){
return 8;}
else if(marks[i]>=60){
return 7;}
}

int sgpa(){
int sum=0;
for(int i=0;i<3;i++){
sum+=credits[i]*compute(marks[i]);
sum=sum/9;
return sum;
}
}
}

class Student{
public static void Student(String[] args){
int size=3;
int[] array_obj=new int[size];
for(int i=0;i<size;i++){
Student array_obj[i]=new Student();
int ans=array_object[i].sgpa;
System.out.println(ans);
}
}
}*/

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
        Scanner sc = new Scanner(System.in); // Fix casing for 'System.in'

        System.out.println("Enter USN:");
        usn = sc.nextLine(); // Fixed method name to nextLine()

        System.out.println("Enter Name:");
        name = sc.nextLine(); // Fixed method name to nextLine()

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
            return 0; // Handle cases for less than 60
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
        Student[] arrayObj = new Student[size]; // Fixed object declaration
        for (int i = 0; i < size; i++) {
            arrayObj[i] = new Student(); // Fixed instantiation
            arrayObj[i].getDetails(); // Call to get details
            double ans = arrayObj[i].sgpa(); // Call to sgpa method
            System.out.println("SGPA for Student " + (i + 1) + ": " + ans);
        }
    }
}
