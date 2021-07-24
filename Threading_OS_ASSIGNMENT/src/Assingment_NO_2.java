
public class Assingment_NO_2 {

	public static void main(String[] args) {

	// 	MyThread thread1= new MyThread();
	// 	MyThread2 thread2= new MyThread2();
	//	thread1.start();
	//	thread2.start();
		
		MyRun1 run1 = new MyRun1();
		MyRun2 run2 = new MyRun2();
		
		Thread  thread1 = new Thread(run1);
		Thread  thread2 = new Thread(run2);
		
		thread1.start();
		thread2.start();
		
	}

}
