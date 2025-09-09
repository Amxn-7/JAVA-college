//08-09-2025
package Class2;
public class Class {
    public static void main(String[] args) {
        int num1 =  Integer.parseInt(args[0]);
        int num2 =  Integer.parseInt(args[1]);
        float num3 = Float.parseFloat(args[0]);
        float num4 = Float.parseFloat(args[1]);
        System.out.println(num3+num4);
        System.out.println(num1+num2);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("Hello, World!");
    }
}
//1. methods can not exist independentaly
//2. all classes should be written in folders(packages)
// create a test project