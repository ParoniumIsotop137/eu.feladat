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

}
