package studio7;

public class Die {
	private int sides; 

	public Die (int n) {
		this.sides= n; 
	}

/** 
 * 
 * @return a random number from 1-n
 */
	public int Thrown() {
		return (int) (Math.random()*this.sides+1);
	}
/** 
 * Accessor
 * @return sides n
 */
	public int getThrown( ) {
		return this.sides;
	} 
	/** 
	 * Setter
	 * @param Thrown
	 * @return new thrown
	 */
	public int setThrown(int Thrown) {
		return this.sides= Thrown;
	}
 public  String toString() {
	 return "" + this.sides;
 }


	public static void main(String[] args) {
		Die Throw = new Die(7); 
		System.out.println(Throw.Thrown());

	}

}
