package Task;

import Task.Job1;
import Task.Job2;
import Task.SavingsAccount;

public class Test {

	public static void main(String[] args) {

		SavingsAccount sa = new SavingsAccount(1234,"Kapil",500);
		

		Job1 j1 = new Job1(sa);
		Job2 j2 = new Job2(sa);
		Thread t1 = new Thread(j2);

		j1.start();
		t1.start();
		try {
			t1.join();
			j1.join();

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(sa.balance);

	}

}