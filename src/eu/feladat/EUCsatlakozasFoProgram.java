package eu.feladat;

import java.util.ArrayList;
import java.util.List;

public class EUCsatlakozasFoProgram {

	public static void main(String[] args) {

		List<Allamok> allamok = new ArrayList<Allamok>();
		FajlKezeles fajl = new FajlKezeles();

		allamok = fajl.FajlBeolvasas("F:\\Kurs\\Feladatok\\EU_tagallamok\\EUcsatlakozas.txt", ";");

		allamok.stream().forEach(System.out::println);

	}

}
