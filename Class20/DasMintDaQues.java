package Class20;
import java.util.Scanner;

public class DasMintDaQues {
    static boolean isNeinEleven(long number) {
        boolean et = true;
        int e = 0;
        int o = 0;
        while (number != 0) {
            if (et) {
                e += number % 10;
            } else {
                o += number % 10;
            }
            et = !et;
            number /= 10;
        }
        
        return (e-o) == 0;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long number = scn.nextLong();
        System.out.println(isNeinEleven(number));
    }
    
}