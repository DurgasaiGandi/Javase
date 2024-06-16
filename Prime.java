import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        int c = 0;
        Scanner ob = new Scanner(System.in);
        n = ob.nextInt();
        for (int i = 1; i < n; i++) {
            if (n % 1 == 0)
                c = c + 1;
        }
        if (c == 2)
            System.out.println("prime");
        else
            System.out.println("Not prime");
    }
}