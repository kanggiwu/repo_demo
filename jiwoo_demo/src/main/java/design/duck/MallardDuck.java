package design.duck;

public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehavior = new FlyWithWings();
		flyBehavior.fly();
	}
	@Override
	public void display() {
		System.out.println("나는 천둥 오리입니다.");
	}

}
