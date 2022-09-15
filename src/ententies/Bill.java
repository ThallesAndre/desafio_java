package ententies;

public class Bill{
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
    public double feeding() {
    	
    	return   (beer*5.00)+ (barbecue*7.00)+ (softDrink*3.00);
    }	
    public double cover() {
	
		if(feeding() >= 30) {
			return 0;
		}
		else {
			return 4;
		}
	}
    public double ticket () {
    	if(gender == 'M' || gender == 'm') {
			return 10; 
		}
		else {
			return 8;
		}
    }
    public double total() {
    	return  feeding() + ticket() + cover();
    }
}