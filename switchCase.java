import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Digite de 1 a 7 para identificar o dia da semana: ");
         int x = input.nextInt();
         
         String dia;
         
         switch(x) {
         case 1:
        	 dia="domingo";
        	 break;
         case 2:
        	 dia="segunda";
        	 break;
         case 3:
        	 dia="terca";
        	 break;
         case 4:
        	 dia="quarta";
        	 break;
         case 5:
        	 dia="quinta";
        	 break;
         case 6:
        	 dia="sexta";
        	 break;
         case 7:
        	 dia="sabado";
        	 break;
         default:
        	 dia="valor invalido";
        	 break;
         }
         System.out.println("Dia da semana: " + dia);
         
         input.close();
         
	}

}
