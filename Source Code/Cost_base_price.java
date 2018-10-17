public class Cost_base_price{
	private int base_price_chair = 50;  		//encapsulating the prices because these details need to be hidden.
	private int base_price_place_setting = 20;
	private int base_price_center_piece = 30;
	
	private void set_base_price_chair(int base_price_chair)  // calling the getter setter methods to be able to be accessed in other class/subclass via these methods
	{
		this.base_price_chair = base_price_chair;
	}
	public int get_base_price_chair()
	{
		return base_price_chair;
	}
	
	private void set_base_price_place_setting(int base_price_place_setting)
	{
		this.base_price_place_setting = base_price_place_setting;
	}
	public int get_base_price_place_setting()
	{
		return base_price_place_setting;
	}
	private void set_base_price_center_piece(int base_price_center_piece)
	{
		this.base_price_center_piece = base_price_center_piece;
	}
	public int get_base_price_center_piece()
	{
		return base_price_center_piece;
	}
}
