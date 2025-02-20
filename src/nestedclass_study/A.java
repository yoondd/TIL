package nestedclass_study;

class A {
	A() {
		System.out.println("make A obj");
	}
	class B {
		B() {
			System.out.println("make B obj");
		}
		int field1;
		void method1() {
			System.out.println("I am B method1");
		}
	}
	
	static class C {
		C() {
			System.out.println("make C obj");
		}
		int field1;
		static int field2;
		void method1() {
			System.out.println("I am C method1");
		}
		static void method2() {
			System.out.println("static. I am C method2");
		}
	}
	
	void method() {
		class D {
			D() {
				System.out.println("make D obj");
			}
			int field1;
			void method1() {
				System.out.println("I am D method1!");
			}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
