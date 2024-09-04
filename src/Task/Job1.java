
package Task;

public class Job1 extends Thread {

	SavingsAccount sa;

	public Job1(SavingsAccount sa) {
		this.sa = sa;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 1000; i++) {
			sa.withrow(5);
		}
	}
}
