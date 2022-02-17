package dahinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter payment type: ");
        //Khai báo interface PaymentGateway
        PaymentGateway paymentGateway;

        // creates an object of Scanner
        Scanner scanner = new Scanner(System.in);
        // takes input from the keyboard, dung nextLine đọc văn bản
        String inputString = scanner.nextLine();

        if (inputString.equals("Visa")){
            paymentGateway = new VisaCard();
        }
        else if (inputString.equals("Master")){
            paymentGateway = new MasterCard();
        }else {
            paymentGateway = new AmexCard();
        }
        paymentGateway.payment();

    }
}
