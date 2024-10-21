/*import java.util.Scanner;

class Bank{
Bank(){}
}

class Account extends Bank{
String cus_name;
int acc_no;
String acc_type;
double balance;

Account(){
balance=0.0;

}}


class savingsacc extends Account{
double compoundint;
 SavingsAcc() {
    }


void compdeposit(){
Scanner sc = new Scanner(System.in);
double p;
double t;
double r;
System.out.println("Enter the principal amount,time,rate of interest:");
p=sc.nextDouble();
t=sc.nextDouble();
r=sc.nextDouble();
compoundInterest = (p * t * r) / 100;
System.out.println("The interest is: " + compoundInterest);



void withdrawbalanace(){
Scanner sc = new Scanner(System.in);

double w;
System.out.println("Enter the withdraw amount:");
w=sc.nextDouble();
check(w);
}

private void check(double w){
if(w>balance){
System.out.println("Cant perform withdraw PENALTY!");
return;
}
else{
balance=balance-w;
System.out.println("The new balance is:"+balance);
}}

}


class currentacc extends Account{
currentacc(){
String chequebook;
double balance;}

void updatebalance(){
double deposit;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the deposit:");
deposit=sc.nextDouble();
balance=balance+deposit;
}

void displaybalance(){
System.out.println("The new balance is:"+balance);}}

class Banksss{
public static void main(String[] args){
savingsacc sca=new savingsacc();
currentacc curr=new currentacc();
sca.compdeposit();
sca.withdrawbalance();
curr.updatebalance();
curr.displaybalance();}} */


import java.util.Scanner;

class Bank {
    Bank() {}
}

class Account extends Bank {
    String cus_name;
    int acc_no;
    String acc_type;
    double balance;

    Account() {
        // Initialize account details if needed
        balance = 0.0; // Default balance
    }
}

class SavingsAcc extends Account {
    double compoundInterest;

    SavingsAcc() {
        // Initialize if needed
    }

    void compDeposit() {
        Scanner sc = new Scanner(System.in);
        double p, t, r;
        System.out.println("Enter the principal amount, time (in years), and rate of interest:");
        p = sc.nextDouble();
        t = sc.nextDouble();
        r = sc.nextDouble();
        compoundInterest = (p * t * r) / 100;
        System.out.println("The interest is: " + compoundInterest);
    }

    void withdrawBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdraw amount:");
        double w = sc.nextDouble();
        check(w);
    }

    private void check(double w) {
        if (w > balance) {
            System.out.println("Can't perform withdraw. PENALTY!");
        } else {
            balance -= w;
            System.out.println("The new balance is: " + balance);
        }
    }
}

class CurrentAcc extends Account {
    String chequeBook;

    CurrentAcc() {
        // Initialize if needed
    }

    void updateBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the deposit amount:");
        double deposit = sc.nextDouble();
        balance += deposit;
    }

    void displayBalance() {
        System.out.println("The current balance is: " + balance);
    }
}

class Banksss {
    public static void main(String[] args) {
        SavingsAcc sca = new SavingsAcc();
        CurrentAcc curr = new CurrentAcc();

        // Example usage of SavingsAcc
        sca.compDeposit();
        sca.withdrawBalance();

        // Example usage of CurrentAcc
        curr.updateBalance();
        curr.displayBalance();
    }
}





