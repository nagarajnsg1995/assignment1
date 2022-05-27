import java.util.Scanner;
public class Demostring {

    public static void main(String[] args) {
        String str1, str2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("entrr the first string");
            str1 = scanner.nextLine();
        System.out.println("enter the second string");
            str2 = scanner.nextLine();
            if(str1.equals(str2) )
                System.out.println("true");
            else
                System.out.println("false");



    }
}
