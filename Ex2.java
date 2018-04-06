import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] notas = new int[4];
		int total = 0;
		for (int i=0; i<4; i++) {
			System.out.printf("Entre com a nota %d \r\n",(i+1));
			notas[i] = scan.nextInt();
			total+=notas[i];
		}
		float media = ((float)total/(float)notas.length);
		System.out.printf("A média é %f",media);
	}
	
}