package eu.feladat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Feladatok {

	public void KeresettEvbenCsatlakozottak(List<Allamok> allamok) {

		int orszagok = 0;

		for (Allamok allam : allamok) {
			if (allam.getCsatlakozasDatuma().getYear() == 2007) {
				orszagok++;
			}
		}
		System.out.println("\n4. feladat: 2007-ben " + orszagok + " orszag csatlakozott.");

	}

	public void MagyarCsatlakozasDatuma(List<Allamok> allamok) {

		String datum = "";

		for (Allamok allam : allamok) {
			if (allam.getOrszag().equals("Magyarország")) {
				datum = allam.getCsatlakozasDatuma().toString();
			}
		}

		System.out.println("\n5. feladat: Magyarország csatlakozásának dátuma: " + datum.replace("-", "."));

	}

	public void MajusiCsatlakozas(List<Allamok> allamok) {

		int i = 0;

		while (i < allamok.size() && allamok.get(i).getCsatlakozasDatuma().getMonthValue() != 5) {
			i++;
		}
		if (i < allamok.size()) {
			System.out.println("\n6. feladat: Májusban volt csatlakozás!");
		} else {
			System.out.println("\n6. feladat: Nem volt májusban csatlakozás!");
		}

	}

	public void UtoljaraCsatlakozottOrszag(List<Allamok> allamok) {

		int i = 0;

		for (int j = 0; j < allamok.size(); j++) {
			if (allamok.get(j).getCsatlakozasDatuma().isAfter(allamok.get(i).getCsatlakozasDatuma())) {
				i = j;
			}
		}

		System.out.println("\n7. feladat: Legutoljára csatlakozott ország: " + allamok.get(i).getOrszag());

	}

	public void Statisztika(List<Allamok> allamok) {

		Map<Integer, Integer> orszagok = new HashMap<Integer, Integer>();

		for (Allamok allam : allamok) {
			orszagok.put(allam.getCsatlakozasDatuma().getYear(), 0);
		}

		for (Allamok allam : allamok) {
			for (Map.Entry<Integer, Integer> orszag : orszagok.entrySet()) {
				if (allam.getCsatlakozasDatuma().getYear() == orszag.getKey()) {
					orszag.setValue((orszag.getValue() + 1));
				}
			}
		}

		StringBuilder kiiras = new StringBuilder();

		orszagok.entrySet().stream().forEach(n -> kiiras.append(n.getKey() + " - " + n.getValue() + " ország\n"));

		System.out.println(kiiras.toString());

	}

}
