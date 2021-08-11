/* 
ans 1

1   Interpreter translates one line of a program at a time but compiler scans the whole program and generate the output.
2   Interpreter never produces any intermediate machine code but the compiler generates an intermediate machine code

*/
/*
*/

import java.util.*;

class Student {
    int roll;
    String name;
    float marks;
    void input() {
        Scanner scan = new Scanner(System.in);
        roll = scan.nextInt();
        name = scan.next();
        marks = scan.nextFloat();
    }
    void display() {
        System.out.println(roll + " " + name + " " + marks);
    }
}
public class Day1assignment {
    public static void main(String[] args) {
        Student ob1 = new Student();
        ob1.input();
        ob1.display();
    }
}