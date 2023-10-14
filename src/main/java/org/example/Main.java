// Polymorphism (CompileTime Polymorphism)

package org.example;
class Student{
    String name;
    int age;


    Student(){

    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void print(String name){
        System.out.println(name+" name is called");
    }
    public void print(int age){
        System.out.println(age + "  age is called");
    }
    public void print(String name, int age){
        System.out.println(name+" "+age+" is called");
    }

}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Student s1 = new Student();
        s1.name = "murali";
        s1.age = 23;
        s1.print(s1.age);
        s1.print("murali", 24);

        Student s2 = new Student("Ajay", 22);
        s2.print("Ajay", 22);

//        s2.print("sourav");
//        s2.print(22);
//        s2.print("sourav", 22);

    }
}