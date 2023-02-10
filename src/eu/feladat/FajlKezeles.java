package eu.feladat;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FajlKezeles {

	public List<Allamok> FajlBeolvasas(String fajlnev, String elvalaszto) {

		List<Allamok> allamok = new ArrayList<Allamok>();

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev), "UTF-8"))) {

			while (br.ready()) {

				String[] sor = br.readLine().split(elvalaszto);

				Allamok allam = new Allamok(sor);
				allamok.add(allam);

			}

		} catch (Exception e) {
			System.err.println("Hiba lépett fel az adatrok felolvasásakor!" + e);
		}

		return allamok;
	}

}
