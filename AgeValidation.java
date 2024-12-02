import java.util.Scanner;

class WrongAge extends Exception {

    public WrongAge() {
        super("Age Error");
    }

    
    public WrongAge(String message) {
        super(message);
    }
}


class Father {
    protected int fatherAge;

   
    public Father() throws WrongAge {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Father's Age: ");
        fatherAge = s.nextInt();

        if (fatherAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
    }
}


class Son extends Father {
    private int sonAge;

 
    public Son() throws WrongAge {
        super(); 

        Scanner s = new Scanner(System.in);
        System.out.print("Enter Son's Age: ");
        sonAge = s.nextInt();

        
        if (sonAge < 0) {
            throw new WrongAge("Age cannot be negative");
        }
        if (sonAge >= fatherAge) {
            throw new WrongAge("Son's age cannot be greater than or equal to Father's age");
        }
    }


    public void display() {
        System.out.println("Son's Age: " + sonAge);
    }
}


public class AgeValidation {
    public static void main(String[] args) {
        try {
          
            Son son = new Son();
            son.display(); // Display son's age
        } catch (WrongAge e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}