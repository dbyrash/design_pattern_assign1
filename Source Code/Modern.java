public class Modern extends Cost_base_price{
	private int cost_of_modern_chair;
	private int cost_of_modern_place_setting;
	private int cost_of_modern_center_pieces;
	private int per_modern_cost = 0;
	
	public Modern() {
		// TODO Auto-generated constructor stub
		set_cost_of_modern();
	}

	public void set_cost_of_modern() //set method() to increase reusability so that it becomes easy to make edits in the code.
	{
	cost_of_modern_place_setting = this.get_base_price_place_setting() + 30;
	cost_of_modern_chair = this.get_base_price_chair() + 100;
	cost_of_modern_center_pieces = this.get_base_price_center_piece() + 40;  //use getter method on this modern cost
	
	System.out.println("1. Cost of each Modern place setting = " + cost_of_modern_place_setting);
	System.out.println("2. Cost of each Modern Chair = " + cost_of_modern_chair);
	System.out.println("3. Cost of each Modern center pieces = " + cost_of_modern_center_pieces);
	this.per_modern_cost = cost_of_modern_place_setting*4 + 4*cost_of_modern_chair + cost_of_modern_center_pieces;
	   //per table cost modern
	}
	public int get_cost_of_modern()
	{
		return per_modern_cost;
	}
}
