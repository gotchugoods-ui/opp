import java.util.Scanner;

public class CompleteStorePurchaseCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter product price: ");
        double productPrice = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter discount percentage: ");
        double discountPercentage = input.nextDouble();

        System.out.print("Enter amount paid: ");
        double amountPaid = input.nextDouble();

        double grossAmount = productPrice * quantity;
        double discountAmount = grossAmount * (discountPercentage / 100);   
        double discountedAmount = grossAmount - discountAmount;
        double vat = discountedAmount * 0.12;
        double finalBill = discountedAmount + vat;
        double difference = amountPaid - finalBill;

        String paymentStatus = (amountPaid >= finalBill)
                ? "SUFFICIENT PAYMENT"
                : "INSUFFICIENT PAYMENT";

        System.out.println("Gross Amount: PHP " + grossAmount);
        System.out.println("Discount Amount: PHP " + discountAmount);
        System.out.println("After Discount: PHP " + discountedAmount);
        System.out.println("VAT: PHP " + vat);
        System.out.println("Final Bill: PHP " + finalBill);
        System.out.println("Change/Difference: PHP " + difference);
        System.out.println("Payment Status: " + paymentStatus);

        input.close();
    }
}
