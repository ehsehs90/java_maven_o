package generic;

import generic.valueobject.Apple;
import generic.valueobject.Orange;

public class ExtendsGenericTest {

	public static void main(String[] args) {
		//ExtendsGeneric<String> g;
		//String�� Fruit�� ��ӹ��� �ʱ� ������ ������ ������ �߻��Ѵ�.
		
		ExtendsGeneric<Apple> eg = new ExtendsGeneric<Apple>();
		NormalGeneric<Apple> ngapple = new NormalGeneric<Apple>();
		NormalGeneric<Orange> ngorange = new NormalGeneric<Orange>();
		
		FuncExtendsGeneric.func(ngapple);
		//FuncSuperGeneric.func(ngapple);
		//ngapple�� AppleŸ���̹Ƿ� Orange�� �θ� Ÿ���� �ƴϴ�.
	}

}
