// package assignment;
// import java.util.Scanner;

// public class Assignmemt {
//     public static void main(String[] args) {

//         Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        int number = scanner.nextInt();


//        System.out.println("Enter a number : ");
//        int number1 = scanner.nextInt();

//        System.out.println("Enter a number : ");
//        int number2 = scanner.nextInt();

        // question 1...
//
//        int copy = number;
//        int rem=0;
//        while(copy > 0)
//        {
//            rem = (rem*10)+copy%10;
//            copy= copy/10;
//        }
//        if(rem == number)
//        {
//            System.out.println("Palindrome number");
//        }
//        else {
//            System.out.println("Not a palindrome number");
//        }


        // question 2...
//        int c =(number > number1) ? (number > number2 ? number : number2) :(number1 > number2 ? number1 : number2);
//        System.out.println("Largest : "+c);



        //question 3...
//        System.out.print("Enter your salary: ");
//        double salary = scanner.nextDouble();
//
//        System.out.print("Enter years of service: ");
//        int years = scanner.nextInt();
//
//        double finalSalary;
//
//        if (years > 5 && salary < 50000) {
//            finalSalary = salary + (0.20 * salary);
//            System.out.println("You got a 20% bonus!");
//        } else {
//            finalSalary = salary + (0.10 * salary);
//            System.out.println("You got a 10% bonus!");
//        }

        //question 4...
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter first number (a): ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter second number (b): ");
//        int b = sc.nextInt();
//
//        a = a ^ b;
//        b = a ^ b;
//        a = a ^ b;
//
//        System.out.println("After swapping: a = " + a + ", b = " + b);



        //question 5.....
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        int multiplied = n << 1;
//        int divided = n >> 1;
//
//        System.out.println("Multiplication by 2: " + multiplied);
//        System.out.println("Division by 2: " + divided);


        //question 6...
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        if ((n & 1) == 0) {
//            System.out.println(n + " is Even");
//        } else {
//            System.out.println(n + " is Odd");
//        }


        //question 7...
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        int count = 0;
//        while (n <= 1000) {
//            n *= 2;
//            count++;
//        }
//
//        System.out.println("Number exceeded 1000 after " + count + " multiplications.");


        //question 8...
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        int count = 0;
//        while (n > 0) {
//            count += (n & 1);
//            n >>= 1;
//        }
//
//        System.out.println("Number of set bits = " + count);


        //question 9...
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();
//
//        System.out.print("Enter operator (+, -, *, /, %): ");
//        char op = sc.next().charAt(0);
//
//        switch (op) {
//            case '+':
//                System.out.println("Result = " + (a + b));
//                break;
//            case '-':
//                System.out.println("Result = " + (a - b));
//                break;
//            case '*':
//                System.out.println("Result = " + (a * b));
//                break;
//            case '/':
//                if (b != 0) System.out.println("Result = " + (a / b));
//                else System.out.println("Error: Division by zero");
//                break;
//            case '%':
//                if (b != 0) System.out.println("Result = " + (a % b));
//                else System.out.println("Error: Modulo by zero");
//                break;
//            default: System.out.println("Invalid operator!");
//        }

//        question 10....
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int n = sc.nextInt();

//         if (n > 0 && (n & (n - 1)) == 0) {
//             System.out.println(n + " is a power of 2");
//         } else {
//             System.out.println(n + " is NOT a power of 2");
//         }

//     }
// }

