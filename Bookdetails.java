import java.util.Scanner;

class Books{
String name;
String author;
int price;
int numpages;

Books(String name,String author,int price,int numpages){
this.name=name;
this.author=author;
this.price=price;
this.numpages=numpages;
}

public String toString(){
String name,author,price,numpages;
name="Bookname:"+this.name+"\n";
author="Author:"+this.author+"\n";
price="Price:"+this.price+"\n";
numpages="Numpages:"+this.numpages+"\n";
return name+author+price+numpages;
}
}

public class Bookdetails{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
String name;
String author;
int price;
int numpages;
System.out.println("Enter the number of books:");
n=s.nextInt();
Books b[];
b=new Books[n];
for(int i=0;i<n; i++){
System.out.println("Enter the name:");
name=s.next();
System.out.println("Enter the author's name:");
author=s.next();
System.out.println("Enter the price:");
price=s.nextInt();
System.out.println("Enter the number of pages:");
numpages=s.nextInt();
b[i]=new Books(name,author,price,numpages);
}
for(int j=0;j<n; j++){
System.out.println(b[j]);
}
}}

