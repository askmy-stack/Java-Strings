import java.util.Scanner;

class Practice
{
    public static void BinarytoDecimal(String s)
    {
        int m = 0;
        int k = 1;
        for(int i = s.length() - 1; i >= 0; i--){
        m += (s.charAt(i) - '0') * k;
        k = k * 2;
    }
        System.out.println(m);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        BinarytoDecimal(s);
    }
}
