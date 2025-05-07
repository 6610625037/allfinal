
import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mobile phone number: ");
        String phoneNum = sc.nextLine();
        sc.close();

        String cleanNum = phoneNum.replaceAll("[^0-9]", "");

        System.out.print("Formatted phone number: ");
        for (int i = 0; i < cleanNum.length(); i++) {
            if (i == 2 || i == 6) {
                System.out.print(" ");
            }
            System.out.print(cleanNum.charAt(i));
        }

    }
}

/*
import java.util.Scanner;

public class SimplePhoneFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String num = sc.nextLine().replaceAll("[^0-9]", "");
        
        String formatted = num.length() == 10 ? 
            num.substring(0, 3) + "-" + num.substring(3, 6) + "-" + num.substring(6) :
            num;
            
        System.out.println("Formatted phone number: " + formatted);
    }
}

Enter a phone number: 0812345678
Formatted phone number: 081-234-5678

*/

/*
import java.util.Scanner;

public class InternationalPhoneFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String num = sc.nextLine().replaceAll("[^0-9]", "");
        
        // ตัด 0 หน้าหากมี และเติม 66
        if (num.startsWith("0")) {
            num = "66" + num.substring(1);
        } else if (num.length() == 9) {
            num = "66" + num;
        }
        
        // จัดรูปแบบ +66 XXXX XXXXX
        String formatted = "+" + num.substring(0, 2) + " " + num.substring(2, 6) + " " + num.substring(6);
        
        System.out.println("International format: " + formatted);
    }
}

Enter a phone number: 081-234-5678
International format: +66 8123 45678

Enter a phone number: 987654321
International format: +66 9876 54321

*/

