package pizza;

/**
 * This class models a Pizza.
 * 
 * @author willispd
 *
 */

public class Pizza {
	private String toppings; // all properties should be private. this is data
								// hiding in OOP

	/**
	 * bake the pizza
	 * 
	 * @param minutes
	 *            number of minutes to bake
	 * 
	 */
	public void bake(int minutes) {
	}

	/**
	 * Get the toppings list
	 * 
	 * @return the toppings list
	 */
	public String getToppings() {
		return toppings;
	}

	/**
	 * define the toppings on the pizza
	 * 
	 * @param toppings
	 *            the list of toppings
	 */
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}

}
