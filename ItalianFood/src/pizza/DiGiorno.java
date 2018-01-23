package pizza;

import italianFood.ItalianFood;

/**
 * This class models a DiGorno Pizza
 * 
 * @author willispd
 *
 */
public class DiGiorno extends Pizza {//or pizza
	private boolean isDelivery; // Always false because this is part of their
								// brand

	public boolean isDelivery() {
		return isDelivery;
	}

	public DiGiorno() {
		isDelivery = false; // Its always false
	}

	public String toString() {

		return getToppings();
	}
	// I decide how to represent this tostring
}
