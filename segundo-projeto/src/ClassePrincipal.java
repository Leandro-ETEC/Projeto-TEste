import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ClassePrincipal {
	public static void main(String[] args) {	
		
		ClasseEntrada objetoEntrada = new ClasseEntrada();
		String nome = objetoEntrada.metodoEntrada();
		System.out.println(nome);
		
		ClasseIdade objetoIdade = new ClasseIdade();
		String idade = objetoIdade.metodoIdade();
		System.out.println(idade);
		
		System.out.println("Fim!");
	}

}