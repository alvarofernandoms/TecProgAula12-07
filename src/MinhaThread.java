public class MinhaThread extends Thread {
	private int indiceInicial, numeroThreads, indiceMaximo;

	public MinhaThread(int indiceInicial, int numeroThreads, int indiceMaximo) {
		this.indiceInicial = indiceInicial;
		this.numeroThreads = numeroThreads;
		this.indiceMaximo = indiceMaximo;
	}

	@Override
	public void run() {
		for (int i = this.indiceInicial; i < this.indiceMaximo; i += this.numeroThreads) {
			System.out.println("[ID: " + this.getId() + "] " + i);
		}
	}
}
