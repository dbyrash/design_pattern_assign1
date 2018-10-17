public class Contemporary extends Cost_base_price{
	private int cost_of_contemporary_chair;
	private int cost_of_contemporary_place_setting;
	private int cost_of_contemporary_center_pieces;
	private int per_contemporary_cost = 0;
	
	public Contemporary() {
		// TODO Auto-generated constructor stub
		set_cost_of_contemporary();
	}

	public void set_cost_of_contemporary()  //set method() to increase reusability so that it becomes easy to make edits in the code.
	{
	cost_of_contemporary_place_setting = this.get_base_price_place_setting() + 20;
	cost_of_contemporary_chair = this.get_base_price_chair() + 20;
	cost_of_contemporary_center_pieces = this.get_base_price_center_piece() + 25;  //use getter method on this contemporary cost
	
	System.out.println("1. Cost of each Contemporary place setting = " + cost_of_contemporary_place_setting);
	System.out.println("2. Cost of each Contemporary Chair = " + cost_of_contemporary_chair);
	System.out.println("3. Cost of each Contemporary center pieces = " + cost_of_contemporary_center_pieces);
	this.per_contemporary_cost = cost_of_contemporary_place_setting*4 + 4*cost_of_contemporary_chair + cost_of_contemporary_center_pieces;
	   //per table cost contemporary
	}
	public int get_cost_of_contemporary()  //called via object in main class.
	{
		return per_contemporary_cost; 
	}
}
