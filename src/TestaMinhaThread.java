public class TestaMinhaThread {

	public static void main(String[] args) {

		MinhaThread m = new MinhaThread(1, 1, 100);
		m.run();
		
		MinhaThread m2 = new MinhaThread(1, 1, 100);
		m2.run();
			
	}

}
