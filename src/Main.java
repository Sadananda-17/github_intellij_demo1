public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");


// Basic structure of java program
//Here public is a access modifier which decides the class accessebility
// class is a keyword to create any classes
// Main is a class name
//static is a keyword where we  can run the program without creating any objects
// void is a return data type which return nothin
// main is a default method in java its a entry point to any java programs
//String []args is a arguments


/*
Naming Convention in java
Add two number
AddTwoNumber-->Pascal naming convention used for names the classes
addTwoNumber-->camelcase naming convention used for name the methods variables etc
 */
//comment in java
//<--this is called singleline comment

        /* <--this is called multiline comments in java */

/*
Anatomy of java Program
document section-->suggested
package staatements -->optional
import statements -->optional
interface statements-->optional
class definition-->optional
main method class-->essential this is entry point to any java program
 */
 /*
 Variables in java
 there is a rules to be followed to declare a variable in java
 must not begin with a digit like int 1arr;
 java is a case sensitive language String HELLO ,String hello both are different
 dont use reserved java keywords like int void ,int class
 dont use any white spaces like int code With Harry
 if above condition met then we can use a underscore ,$ ,digits like int code$With3Harry_123


  */
/*
datatypes in java
there are 2 types of datatypes in java
primitive and non-primitive datatypes
primitive data type-->its a intrinsic or its pre-defined
in primitive datatypes there are 8 types
byte-->takes 1 byte and default value is 0.
short-->takes 2 bytes  and default values is 0
int -->takes  4 bytes and default value is 0
long-->takes 8 bytes and default value is 0
float-->takes 4 bytes and default value is 0.0f
double-->takes 8 bytes and default value is 0.0d
char-->takes 2 bytes and default value is '\U000'
boolean-->value can be true or false default value is false and size depends upon jvm
general form to find range
-(2^n*8)/2 to(2^n*8)/2-1
for charecter (2^n*8)-1
 */
        //write java program to add three numbers
        int num1 = 20;
        int num2 = 20;
        int num3 = 60;
        int sum = num1 + num2 + num3;
        System.out.println("the sum is  " + sum);
    }
}
