package design.duck;

public class DuckSimulation {

	public static void main(String[] args) {
		Duck myDuck = new WoodDuck();
		myDuck.display();
		myDuck.performFly();
		//myDuck.performQuack();
		FlyNoWay flyNoWay = new FlyNoWay();
		flyNoWay.print_interface();
	}
}
