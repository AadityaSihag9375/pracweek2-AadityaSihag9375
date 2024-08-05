import java.util.Scanner; 
public class CalorieWatcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter No of Cookies: ");
		 int numberOfCookiesConsumed  = scanner.nextInt();
	        int NumberOfCaloriesInACookie = (300/40)*10;
	        int TotalNoOfCalories = numberOfCookiesConsumed * NumberOfCaloriesInACookie;
		if (numberOfCookiesConsumed > 0 ) {
	        System.out.println("No Of Cookies You Consumed: " + numberOfCookiesConsumed);
	        System.out.println("No Of Calories You Consumed: " + TotalNoOfCalories  );
	        scanner.close();
		}else {
			System.out.println("NO of Cookied cant be less than 0");
		}

	}

}
