package anonymous_study;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("go work");
		}
		@Override
		void wake() {
			System.out.println("good morning! 6 am");
		}
	};
	
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("walking!!");
			}
			@Override 
			void wake() {
				System.out.println("good morning! 5 am");
				walk();
			}
		};
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
