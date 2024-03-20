import java.util.Scanner;

//1kg=2.2 lb  oz= lb*16.00 kg%2.2046=intlb doublelb*16.00 
public class Weight {
    public static void main(String[] args) {
        System.out.println("$ java weight");
        System.out.println("Enter weight in kilograms:");
        Scanner sc = new Scanner(System.in);
        double kilograms = sc.nextDouble();
        int lb = (int) (kilograms / 2.204);
        double oz = Math.round((kilograms % 2.204) * 16.00 * 10) / 10.0;
        System.out.println("Equivalent imperial weight is " + lb + " lb " + oz + " oz");
    }
}