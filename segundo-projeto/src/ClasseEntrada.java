import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasseEntrada {
		
	public String metodoEntrada() {
		while(true){
			Scanner batata = new Scanner(System.in);
			System.out.println("Qual seu nome: ");
			String nome = batata.nextLine();
			Pattern padrao = Pattern.compile("[A-Za-z]{2}");
			Matcher combina = padrao.matcher(nome);
			boolean padraoValido = combina.find();
			if(padraoValido == true) {
				System.out.println("Seu nome e " + nome); //Sysout -> Ctrl + Espaço
				return nome;
			}
			else {
				System.out.println("Insira apenas textos.");
				continue;
			}	
	}	
}
}