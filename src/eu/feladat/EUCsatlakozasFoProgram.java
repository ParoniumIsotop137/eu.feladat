package eu.feladat;

import java.util.ArrayList;
import java.util.List;

public class EUCsatlakozasFoProgram {

	public static void main(String[] args) {

		List<Allamok> allamok = new ArrayList<Allamok>();
		FajlKezeles fajl = new FajlKezeles();
		Feladatok feladat = new Feladatok();

		allamok = fajl.FajlBeolvasas("F:\\Kurs\\Feladatok\\EU_tagallamok\\EUcsatlakozas.txt", ";");

		// allamok.stream().forEach(System.out::println);

		System.out.println("3. feladat: EU tagállamainak száma: " + allamok.size() + " db");
		feladat.KeresettEvbenCsatlakozottak(allamok);

	}

}
