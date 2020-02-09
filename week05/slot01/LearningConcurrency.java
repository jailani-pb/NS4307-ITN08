package week05.slot01;

public class LearningConcurrency {

	public static void main(String[] args) {
		Thread process1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println("Process 1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		});
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 50; i++) {
					System.out.println("Process 2");
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}).start();
		
		process1.start();
	}
	
}
