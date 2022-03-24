import java.util.*;

public class Main2 {

	static int primos[], num_primos = 0;

	public static void main(String args[]) {
		
		//Inteiro "n", em que "n" pode ter um valor entre 2 <= n <= 10000
		int n = 0;

		Scanner scan = new Scanner(System.in);
		listaprimos();
		while (scan.hasNext()) {
			n = scan.nextInt();
			executar(n);
		}
		scan.close();
	}

	static void executar(int n) {
		int resposta = 0, inicio = 0, fim = num_primos - 1;
		while (primos[fim] > n)
			fim--;
		while (inicio <= fim) {
			int p = primos[fim];
			while (p * primos[inicio] <= n) {
				p = p * primos[inicio];
				inicio++;
			}
			resposta++;
			fim--;
		}
		System.out.println(resposta);
	}
	//Metodo auxiliar que lista todos os numeros primos entre 2 e 10000
	static void listaprimos() {
		boolean visita[] = new boolean[10000];
		primos = new int[10000];
		
		for (int i = 2; i < 10000; i++) {
			if (visita[i] == true)
				continue;
			primos[num_primos] = i;
			num_primos++;
			for (int j = i * i; j < 10000; j += i)
				visita[j] = true;
		}
	}
}