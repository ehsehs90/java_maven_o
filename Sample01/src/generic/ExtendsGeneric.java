package generic;

import generic.valueobject.Fruit;
import generic.valueobject.Orange;

public class ExtendsGeneric<T extends Fruit> {
	
}

/*
class SuperGeneric<T super Orange>{
	
}
Ÿ�Ժ����� super�� ���� ���� ����.
*/
class FuncExtendsGeneric{
	public static void func(NormalGeneric<? extends Fruit> g) {
		
	}
}

class FuncSuperGeneric{
	public static void func(NormalGeneric<? super Orange> g) {
		
	}
}
