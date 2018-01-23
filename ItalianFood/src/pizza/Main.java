package pizza;

public class Main {

	public static void main(String[] args) {
		// Declare and instantiate a pizza object
		Pizza myPizza = new Pizza();

		// declare and instantiate a DiGornio object
		DiGiorno myDiGoirno = new DiGiorno();

		myDiGoirno.setToppings("Cheese,Mushrooms,sun dried tomatoes");
		// print the myDiGoirno suing the tostring method
		System.out.print(myDiGoirno.toString());
	}

}
