package qaace22training;

class view extends Thread {
	public void run() {
		String[] s = {"Francis","Anantharaman","Pavithra","Kubera Varman","Thanushree"};
		for(int i=0;i<5;i++) {
			System.out.println(" Name :"+s[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class display implements Runnable {
	public void run() {
		for(int i=1;i<=6;i++) {
			System.out.println("Sirius");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class ThreadRunnable {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread v = new view();
		v.start();
		Runnable d = new display();
		Thread t1 = new Thread(d);
		t1.start();
	}
}