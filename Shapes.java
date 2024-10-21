import java.util.Scanner;

abstract class Shape{
int x;
int y;
void printArea(){
}}

class Rectangle extends Shape{
Rectangle(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length:");
x=sc.nextInt();
System.out.println("Enter breadth:");
y=sc.nextInt();}


void printArea(){
System.out.println("The Area is:"+(x*y));
}}

class Triangle extends Shape{
Triangle(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length:");
x=sc.nextInt();
System.out.println("Enter breadth:");
y=sc.nextInt();}


void printArea(){
System.out.println("The Area is:"+(0.5*x*y));
}}

class Circle extends Shape{
Circle(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius:");
x=sc.nextInt();}


void printArea(){
System.out.println("The Area is:"+(3.14*x*x));
}}

class Shapes{
public static void main(String[] args){
Rectangle r=new Rectangle();
r.printArea();
Triangle t=new Triangle();
t.printArea();
Circle c=new Circle();
c.printArea();
}}
