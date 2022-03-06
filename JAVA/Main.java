import java.util.Scanner;

class TaxPayer {
    int ssn, gi;

    public TaxPayer(int a, int b) {
        ssn = a;
        gi = b;
    }

    public int sn() {
        return ssn;
    }

    public int g() {
        return gi;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        TaxPayer ob[] = new TaxPayer[10];
        int a = 100000;
        int n = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Gross income of " + (i + 1) + " cumstomer : ");
            n = sc.nextInt();
            ob[i] = new TaxPayer(a, n);
            a++;
            System.out.println();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("SSN of " + (i + 1) + " customer : " + (ob[i].sn()));
            System.out.println();
            System.out.print("Gross Income of " + (i + 1) + " customer : " + (ob[i].g()));
            System.out.println();
        }
    }
}