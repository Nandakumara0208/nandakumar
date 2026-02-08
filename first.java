import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers separated by spaces: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double sum = a + b + c;
		System.out.println("Sum: " + sum);
		sc.close();
	}
}

