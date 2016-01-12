//Adam Barszczak, Alex Bulanov

import java.math.*;

public class Die {
	int sidenum; //is this the appropriate field to store sidenum?
	int rollresult = 0;
	
	public Die(int sidenum) {
		this.sidenum = sidenum;
	}

	public void roll() {
		rollresult = (int) (Math.random() * (sidenum)) + 1;
	}
	
	public int getValue() {
		return rollresult;
	}
	
	public static void main(String[] args) {
		Die d = new Die(6);
		d.roll();
		System.out.println(d.getValue());
	}
	
}

