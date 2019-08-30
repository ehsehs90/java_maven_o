package generic;

import generic.valueobject.Fruit;
import generic.valueobject.Orange;

public class ExtendsGeneric<T extends Fruit> {
	
}

/*
class SuperGeneric<T super Orange>{
	
}
타입변수에 super를 붙일 수는 없다.
*/
class FuncExtendsGeneric{
	public static void func(NormalGeneric<? extends Fruit> g) {
		
	}
}

class FuncSuperGeneric{
	public static void func(NormalGeneric<? super Orange> g) {
		
	}
}
