import java.util.Scanner;
public class Stockcommissioner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("price of share: ");
        int SharePrice = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("No of Shares Bought: ");
		int NoOfShares = scanner1.nextInt();
		double StockCost = SharePrice * NoOfShares;
		double Commission = 0.0425 * StockCost;
		double total = StockCost + Commission ;
		if (NoOfShares <= 10000 && NoOfShares >= 100 && SharePrice >0 && SharePrice < 500) {
			System.out.println("Stock cost = " + StockCost);
			System.out.println("Commission = " + Commission);
			System.out.println("Total = "+ total);
		}else {
			System.out.println("Number of shares must be between 100-100000 and Share Price must be between 0-500");
		}
	}

}
