package design.duck;

public class WoodDuck extends Duck {
	/* 부모 클래스 Duck 필드 및 메소드
	 * 	FlyBehavior	flyBehavior	=	null;//인터페이스를 불러온다.
	QuackBehavior	quackBehavior	=	null;

	public Duck() {
		System.out.println("디폴트 생성자 호출");
	}
	public abstract	void display();
	public void performFly() {
		flyBehavior.fly();
	}
	public void performQuack() {
		quackBehavior.quack();
	}
	public void swimming() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠");
	}
	 */	
	
	
	
	public WoodDuck() {
		flyBehavior = new FlyNoWay();// FlyBehavior 인터페이스를 받는 클래스 객체를 생성
		flyBehavior.fly();
	}
	
	@Override
	public void display() {
		System.out.println("나는 나무 오리입니다.");
	}

}
