import java.util.ArrayList;


public class Party_setting{
	int no_of_tables=0;
	//ArrayList<table_setting> tables = new ArrayList<table_settings>();

	public Party_setting(int no_of_tables, String table_type){
		// given n and type cal a method which decides the object to be use between Vintage/Moderrn/Contemp
	//	method();
			this.no_of_tables = no_of_tables;    //using constructor to call the tables & type			
	}
	
	public void calculate_cost(int no_of_tables, String table_type){
		int total_cost = 0;
	
		 if ("Vintage".equals(table_type) || "vintage".equals(table_type))   //compare type 
		    {
				System.out.println("VINTAGE "+ table_type);

		    	Vintage vin = new Vintage();
		    	                                               //calculates the cost of Vintage
		    	total_cost = no_of_tables*vin.get_cost_of_vintage(); //total number of tables multiplied by the cost of each table_setting
		    	System.out.println("Total cost of Vinatge Party Setting "+ total_cost);
		    	//return total_cost;
		    }
		    else if("Modern".equals(table_type) || "modern".equals(table_type))
		    {
		    	Modern mod = new Modern();                    //calculates the cost of Modern
		    	total_cost = no_of_tables*mod.get_cost_of_modern();
		    	System.out.println("Total cost of Modern Party Setting "+ total_cost);

		    }
		    else if ("Contemporary".equals(table_type) || "contemporary".equals(table_type))
		    {
		    	Contemporary cont = new Contemporary();
		    	                        //calculates the cost of contemporary
		    	total_cost = no_of_tables*cont.get_cost_of_contemporary();
		    	System.out.println("Total cost of Contemporary Party Setting "+ total_cost);
		    }
		    else{
		    	System.out.println("Choose only between Vintage, Modern or Contemporary");
		    }		
	}
	public  void place_setting()
	{                                                            
		int plates = 4;
		int silver = 4;
		int napkins = 4;
		System.out.println("Each Table Place Setting contains: " + plates + " Plates, " + silver + " Silver, " + napkins + " Napkins");
	}
	
	public void display_party_setting(String table_type){
		System.out.println("Table type you chose: "+ table_type);
		System.out.println("Per table coontains 1 center_piece, 4 Chair and 4 Place Setting");
	}
	
	public void create_party_setting(){
		//loop over n tables and add Vintage table object to the arraylist and print 
		
	}
}
