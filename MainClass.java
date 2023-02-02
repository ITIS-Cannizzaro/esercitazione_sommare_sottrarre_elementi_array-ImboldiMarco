import java.util.Scanner;
public class MainClass
{
	static double somma=0;
	static double differenza=0;
	static double []array = new double[6];
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner (System.in);
		for (int i=0; i<array.length; i++)
		{
			System.out.println("inserire un valore: ");
			array[i]=in.nextInt();
		}
		System.out.println("seleziona l'esercizio");
		System.out.println("1- somma dei  numeri pari");
		System.out.println("2- differenza dei numeri dispari");
		int scelta=in.nextInt();
		switch(scelta)
		{
		case 1:
			sommapari(array);
			System.out.println("la somma dei numeri pari è uguale a: "+somma);
			break;
		case 2:
			differenzadispari(array);
			System.out.println("la differenza dei numeri dispari è uguale a: "+differenza);
			break;
		}
	}
	static double sommapari(double[]a)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i] %2 ==0)
			{
				somma += array[i];
			}
		}
		return somma;
	}
	static double differenzadispari(double[]a)
	{
		for(int i=0; i<array.length; i++)
		{
			if(array[i] %2 !=0)
			{
				differenza -= array[i];
			}
		}
		return differenza;
	}
}