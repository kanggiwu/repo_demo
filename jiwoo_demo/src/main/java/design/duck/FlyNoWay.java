package design.duck;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("날지 못합니다.");
	}
	public void print_interface() {
		System.out.println("날수 없는 인터페이스를 구현한 클래습입니다.");
	}
	
}
