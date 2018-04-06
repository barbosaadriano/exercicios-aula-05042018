import java.util.Scanner;

public class Ex3 {
	
		public static void main(String[] args) {
			
			Scanner scan = new Scanner(System.in);
			
			int[] codigos = {1,2,3,4};
			String[] produtos = {"Reis","Brot","Apfel","guemüsa"};
			float[] valores = {15.4f,4.5f,2.5f,1.5f};
			int[] carrinho = new int[10];
			
			int qtItens = 0;
			
			while (true) {
				
				System.out.println("O que você deseja fazer?");
				System.out.println("1 - Comprar produto");
				System.out.println("2 - Remover item");
				System.out.println("3 - Finalizar compra");
				System.out.println("0 - Sair");
				int escolha = scan.nextInt();
				if (escolha == 0)
					break;
				if (escolha == 1) {
					System.out.println("Escolha um produto!");
					System.out.println("Código - Descrição - Valor");
					for (int i =0; i < 4; i++) {
						System.out.printf("%d - %s - %f \r\n",
							codigos[i],
							produtos[i],
							valores[i]
						);
					}
					int produtoEscolhido = scan.nextInt();
					if ( Ex3.indexOf(produtoEscolhido,codigos) != -1 ) {
						carrinho[qtItens] = produtoEscolhido;
						qtItens++;
					}
					for (int i =0; i < qtItens; i++) {
						
						int codigo = carrinho[i];
						int idx = Ex3.indexOf(codigo,codigos);
						
						System.out.printf("%d - %s - %f \r\n",
							codigos[idx],
							produtos[idx],
							valores[idx]
						);
					}
					
				}
				
				if (escolha == 2) {
					System.out.println("Informe o código do produto que deseja Remover ");
					int produtoASerRemovido = scan.nextInt();
					if ( Ex3.indexOf(produtoASerRemovido,carrinho) != -1 ) {
						carrinho[Ex3.indexOf(produtoASerRemovido,carrinho)] = 0;
						qtItens--;
					}
				}
				
			}
			
			
		}
		
		public static int indexOf(int codigo,int[] array) {
			for(int x =0; x < array.length; x++) {
				if (codigo == array[x]) 
					return x;
			}
			return -1;
		} 
	
}