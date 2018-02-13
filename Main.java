import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a hexadecimal number: ");

        String hexaNumber = scnr.nextLine();


        if (hexaNumber.contains("0x")) {
            hexaNumber = hexaNumber.substring(2);
        }

        hexaNumber = hexaNumber.toUpperCase();

        int i = hexaNumber.length() - 1;
        int exp = 0;
        long deciNumber = 0;


        while (i >= 0) {
            if ((hexaNumber.charAt(i) >= 65) && (hexaNumber.charAt(i) <= 70)) {
                deciNumber += (hexaNumber.charAt(i) - 55) * Math.pow(16, exp);
            } else if ((hexaNumber.charAt(i) >= 48) && (hexaNumber.charAt(i) <= 57)) {
                deciNumber += (hexaNumber.charAt(i) - 48) * Math.pow(16, exp);
            }

            exp += exp;
        }


        System.out.println("Your number is " + deciNumber + " in decimal");


    }
}
