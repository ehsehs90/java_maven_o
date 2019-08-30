package generic;

import generic.valueobject.Apple;
import generic.valueobject.Orange;

public class ExtendsGenericTest {

	public static void main(String[] args) {
		//ExtendsGeneric<String> g;
		//String은 Fruit를 상속받지 않기 때문에 컴파일 에러가 발생한다.
		
		ExtendsGeneric<Apple> eg = new ExtendsGeneric<Apple>();
		NormalGeneric<Apple> ngapple = new NormalGeneric<Apple>();
		NormalGeneric<Orange> ngorange = new NormalGeneric<Orange>();
		
		FuncExtendsGeneric.func(ngapple);
		//FuncSuperGeneric.func(ngapple);
		//ngapple은 Apple타입이므로 Orange의 부모 타입이 아니다.
	}

}
