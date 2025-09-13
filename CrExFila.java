//inicio de uma fila estatica sequencial 
public class ExFila {
	private int total;  //total de elementos
	private int comeco;  // começo da fila
	private int fim;        //final da fila 
	private Object memo[];   //vetor para armazenar os elementos
	private int MAX;             //tamanho maximo da fila estatica
	
	//inicia a fila no estado vazio
	public ExFila() {
		MAX = 1000;
		memo = new Object[MAX];
		total = 0;
		comeco = 0;
		fim = 0;
	}

	//verifica sea fila esta vazia
	public boolean qIsEmpty() {
		return(total==0);
	}
	
	// verifica se a fila esta cheia
	private boolean qIsFull() {
		return(total==MAX);
	}
	
	//insere um elemento na fila 
	public void enqueue(Object x) {
		if (!qIsFull()) {
			memo[fim++] = x;
			fim %= MAX;
			total++;
		}
		else 
			System.out.println("Fila Cheia !!!");
	}
	
	//remove um elemento do inicio da fila 
	public Object dequeue() {
		if(!qIsEmpty()) {
			Object resp;
			resp = memo[comeco++];
			comeco %= MAX;
			total--;
			return resp;
		}
		else {
			return null;
		}
	}
	
	//Imprime o conteudo da fila 
	public void qPrint() {
		int i;
		if(!qIsEmpty()) {
			String saida = "";
			int cont = comeco;
			for(i=0;i<total;i++) {
				saida += memo[cont].toString() + ", ";
					cont++;
					cont %= MAX;
			}
			
			System.out.println("F: [ "+saida+" ]");
		}
		else 
			
			System.out.println("Fila Vazia !");
	}
}
	
