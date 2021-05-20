package design.duck;
/*[[[[[[[[인터페이스 설명]]]]]]]]]]]]
 * 생성자 올 수 없다.
 * 일반변수는 올 수 없다.
 * 메소드 이름 앞에 abstract생략 가능하다.
 * 메소드 뒤에 세미 콜론으로 끝난다.
 */

public interface FlyBehavior {
	//static final int i = 0;//인터페이스 내에서 변수는 상수만 가능하다
	//public FlyBehavior(){}
	public abstract void fly();//abstract는 어차피 추상메소드밖에 못 오기 때문에 abstract는 생략해도 상관은 없다.
}
