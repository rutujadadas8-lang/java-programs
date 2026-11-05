package day14;

public class MultithreadingUsingdemoLambda2 {

	public static void main(String[] args) {
		Thread tx=null;
		
		tx=new Thread(()-> {
			System.out.println("Thread name "+Thread.currentThread().getName());
			for(int i=1;i<=1000;i++)
				System.out.println(i);
		});
		tx.start();
		
		
		tx=new Thread(()-> {
			System.out.println("Thread name "+Thread.currentThread().getName());
			for(int i=1000;i<=2000;i++)
				System.out.println("\t" +i);
		});
		tx.start();

	}

}