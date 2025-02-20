package anonymous_study;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(
			new Person() {
				void study() {
					System.out.println("study hard!");
				}
				@Override
				void wake() {
					System.out.println("good morning! 4 am~~!!!");
					study();
				}
			}
		);
	}

}
