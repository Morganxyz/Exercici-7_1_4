import java.util.Scanner;

public class M7_1Ex_4_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1 = 0f;
		float num2 = 0f;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introdueix un nombre, en positiu o negatiu, al teu gust: ");
		num1 = entrada.nextFloat();
		System.out.println("Introdueix un altre nombre, en positiu o negatiu, al teu gust: ");
		num2 = entrada.nextFloat();
		
		if(num1 < 0 && num2 >= 0) {
			System.out.println("Un dels dos nombres es negatiu");
		}else if (num1 >= 0 && num2 < 0) {
			System.out.println("Un dels dos nombres es negatiu");
		}
		else {
		}
	}

}
