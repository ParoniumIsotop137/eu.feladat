package eu.feladat;

import java.util.List;

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

}
