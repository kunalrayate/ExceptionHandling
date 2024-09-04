
package Task;

public class Job2 implements Runnable {

	SavingsAccount sa;

	public Job2(SavingsAccount sa) {
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			sa.deposit(10);
		}
//		System.out.println(sa.balance);
	}
}
