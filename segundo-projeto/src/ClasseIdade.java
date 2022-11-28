import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClasseIdade {
	public String metodoIdade() {
		while (true) {
			Scanner batata = new Scanner(System.in);
			System.out.println("Qual sua idade: ");//
			String idade = batata.next(); //
			Pattern padrao = Pattern.compile("[0-9]{2}"); //
			Matcher combina = padrao.matcher(idade);//
			boolean padraoValido = combina.find();
			if (padraoValido == true) {
				System.out.println("Sua idade e " + idade); //
				return idade; //
			} else {
				System.out.println("Insira 2 digitos."); //
				continue;
			}

		}

	}
}
