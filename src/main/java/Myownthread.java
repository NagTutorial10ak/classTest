public class Myownthread extends Thread {

	Table t;
	Myownthread (Table t){
		this.t=t;
	}
	public synchronized void run() {
		t.printtable(10);
		System.out.println("sys run method--"+Thread.currentThread().getName());
	}
	public void m1()
	{
		System.out.println("normal method--"+Thread.currentThread().getName());
	}
	public synchronized void run1() {
		t.printtable(5);
		System.out.println("sys run1 method--"+Thread.currentThread().getName());
	}
}