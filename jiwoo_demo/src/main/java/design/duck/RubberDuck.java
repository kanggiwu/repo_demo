package design.duck;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();//duck에 있는 인터페이스 선언에 해당 인터페이슬 가지는 클래스를 불러온다.
		flyBehavior.fly();
		quackBehavior = new Squeak();
		quackBehavior.quack();
	}
	
	@Override
	public void display() {
		System.out.println("나는 고무 오리입니다.");
	}

}
