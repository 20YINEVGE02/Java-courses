import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
	    Scanner read = new Scanner(System.in);

	    System.out.print("First number is ");
	    double first = read.nextDouble();
	    System.out.print ("Operator is ");
	    String operator = read.next();
	    System.out.print ("Second number is ");
	    double second = read.nextDouble();

	    System.out.print ("Result is ");

	     if(operator.equals("+")){
	        System.out.print (first + second);
        }else if(operator.equals("-")){
            System.out.print (first - second);
        }else if(operator.equals("*")){
            System.out.print (first * second);
        }else if(operator.equals("/")){
            System.out.print (first / second);
        }
    }
}
