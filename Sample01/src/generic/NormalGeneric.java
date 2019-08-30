package generic;

public class NormalGeneric<T>{
	private T id;
	//private T[] ids = new T[10];
	//타입변수 T로 배열을 생성할 수 없다.
	public void setId(T id) {
		this.id = id;
	}
	public T getId() {
		return id;
	}
}

class TestClass{
	/*
	public static void testFunc(NormalGeneric<T> g) {
		System.out.println(g.getId());
	}
	T를 알 수 없으므로 컴파일 에러가 발생한다.
	*/
	public static void testFunc(NormalGeneric<?> g) {
		System.out.println(g.getId());
	}
}
