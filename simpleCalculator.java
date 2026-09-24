import java.util.Scanner;

class simpleCalculator{
public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("Simple Calculator");
System.out.println("1.Add");
System.out.println("2.Subtract");
System.out.println("3.Multiply");
System.out.println("4.Divide");

System.out.println("Enter Your Choice:");
int choice =  sc.nextInt();

System.out.println("Enter First Number:");
double num1 =  sc.nextDouble();

System.out.print("Enter Second Number:");
double num2 =  sc.nextDouble();

double result;

switch (choice) {

case 1:
result = num1 + num2;
System.out.println("Result = " + result);
break;

case 2:
result = num1 - num2;
System.out.println("Result = " + result);
break;

case 3:
result = num1 * num2;
System.out.println("Result = " + result);
break;

case 4:
if (num2 != 0) {
result = num1 / num2;
System.out.println("Result = " + result);
} else {
System.out.println("Cannot divide by zero.");
}
break;

default:
System.out.println("Invalid choice.");
}

sc.close();
}
}









 

