package mda.ush.ok;



public class Wheel {
	private static int count = 0;
	private int id;
	
	public Wheel() {
		count++;
		id = count; 
	}
	
	public int getId() {
		return id;
	}
}