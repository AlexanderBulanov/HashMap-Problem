//Adam Barszczak, Alex Bulanov

public class Die {
	int sidenum;
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
		System.out.println(d.getValue());
		d.roll();
		System.out.println(d.getValue());
	}
	
}
