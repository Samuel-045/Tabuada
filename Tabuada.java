package loops;
import java.util.Scanner;
public class Tabuada {
	public static void main ( String main[]) {
		int num,cont=0;
		Scanner rec = new Scanner(System.in);
		
		
		do {
			if(cont>0) {
				System.out.println("N�mero inv�lido, digite novamente!\n");
			}
			System.out.println("Voc� quer Uma tabela expec�fica ou todas at� o n�mero 10? (Digite)\n"
					+ "1 - Tabela espec�fica \n"
					+ "2 - Todas as tabelas at� o 10");
			num=rec.nextInt();
			cont++;
			
		}while(num!=1 && num!=2);
		
		if(num==1) {
			System.out.println("Digite o n�mero da tabela especifica: ");
			int numTab=rec.nextInt();
			tab(numTab);
		}else{
			System.out.println("Ser�o exibidas todas as tabelas de 1 at� o 10 \n"
					+ "Processando....");
			tabUniv();
		}
		
		
		
		rec.close();
	}

	public static void tab(int num1) {
		for(int i=1;i<=10;i++) {
			int rest= num1*i;
			System.out.printf("%d x %2d = %d%n \n",num1,i,rest);
		}
		
	}
	
	public static void tabUniv() {
		int b =1;
		for(; b<=10;b++) {
			System.out.println("");
			for(int i=0;i<=10;i++) {
				int rest= b*i;
				System.out.printf("%d x %2d = %d%n \n",b,i,rest);
			}
		}
	}
	
}
