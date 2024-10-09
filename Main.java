import java.io.PrintStream;
import java.util.Scanner;
public class Main {

    public static PrintStream out = System.out;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        double a = in.nextDouble();
        double b = in.nextDouble();

        double x0 = 0;

        if (a == 0 || b==0){
            out.println("Решений нет!");

        }else{

            if (a>0){
                if (b>0){
                    out.print("x ∈ ( "+ -b + " ; " + x0 + " )");
                }else{
                    out.print("x ∈ ( "+ x0 + " ; " + -b + " )");
                }

            }else{
                if (b>0){
                    out.print("x ∈ ( -∞ ; "+ -b + " ) u ( " + x0 + " ; ∞+ )");
                }else {
                    out.print("x ∈ ( -∞ ; " + x0 + " ) u ( " + -b + " ; ∞+ )");
                }
            }
        }
    }
}
