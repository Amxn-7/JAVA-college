package Class5;
// import java.util.Scanner;
public class Main {
//    public static void Main(String[] args) {
    //     Scanner sc =new Scanner(System.in);
    //     int age = sc.nextInt();
    //     String name = sc.next();
    //     System.out.println("Age is " + age);
    //     System.out.println("Name is " + name);
    // }

    // TRIM
    // public static void Main(String[] args) {
    //     String spaced = "     Java      ";
    //     System.out.println("trim(): [" + spaced.trim() +"]");
    // }


    // replace() and replaceAll()
    public static void main(String[] args) {
        String name = "Vijay Pradeep";
        System.out.println("Replace space: " + name.replace(" ", ""));
        System.out.println("RepaceAll (whitespace): " + name.replaceAll("\\s+", "_"));
    }
}
