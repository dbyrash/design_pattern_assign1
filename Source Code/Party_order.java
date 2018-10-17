import java.util.*;


public class Party_order {    //Superclass
	public int no_of_tables;
	public String table_type;
	
	public static void main(String[] args) {
		System.out.println("No. of Tables");         //client input for no of tables
	    Scanner scanner = new Scanner(System.in);
	    int no_of_tables = scanner.nextInt();
	    while(no_of_tables>0)
	    {
	    System.out.println("Valid figure");
	    System.out.println("Enter the type of table setting you want to place an order, Options - Vintage/Modern/Contemporary ");   //type of table setting
	    Scanner rashi = new Scanner(System.in);
	    String table_type = rashi.nextLine();
	    System.out.println(table_type);		//input and printing the statement
	    // loop for multiple attempts of correct input of Vintage/Modern/Contemporary
	    scanner.close();
	    Party_setting p1 = new Party_setting(no_of_tables, table_type);
	    p1.calculate_cost(no_of_tables, table_type); //calling the method by creating object of another class Party_order
	    p1.place_setting();
	    p1.display_party_setting(table_type);
	    }
	    System.out.println("Order to be entered should be greater than atleast 1 or 1");
	}	
}