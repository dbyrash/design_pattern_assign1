public class Vintage extends Cost_base_price{
	private int cost_of_vintage_chair;
	private int cost_of_vintage_place_setting;
	private int cost_of_vintage_center_pieces;
	private int per_vintage_cost = 0;  
	
	public Vintage() {   // default constructor which declares a method
		// TODO Auto-generated constructor stub
		set_cost_of_vintage();
	}

	public void set_cost_of_vintage() //set method() to increase reusability so that it becomes easy to make edits in the code.
	{
	cost_of_vintage_place_setting = this.get_base_price_place_setting() + 40;
	cost_of_vintage_chair = this.get_base_price_chair() + 50;
	cost_of_vintage_center_pieces = this.get_base_price_center_piece() + 35;  //use getter method on this vintage cost
	
	System.out.println("1. Cost of each Vintage place setting = " + cost_of_vintage_place_setting);
	System.out.println("2. Cost of each Vintage Chair = " + cost_of_vintage_chair);
	System.out.println("3. Cost of each Vintage center pieces = " + cost_of_vintage_center_pieces);
	this.per_vintage_cost = cost_of_vintage_place_setting*4 + 4*cost_of_vintage_chair + cost_of_vintage_center_pieces;
	   //per table cost vintage
	}
	public int get_cost_of_vintage()
	{
		return per_vintage_cost;
	}
}
