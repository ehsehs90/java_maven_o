package generic;

public class NormalGeneric<T>{
	private T id;
	//private T[] ids = new T[10];
	//Ÿ�Ժ��� T�� �迭�� ������ �� ����.
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
	T�� �� �� �����Ƿ� ������ ������ �߻��Ѵ�.
	*/
	public static void testFunc(NormalGeneric<?> g) {
		System.out.println(g.getId());
	}
}
