package eu.feladat;

import java.time.LocalDate;

public class Allamok {

	private String orszag;
	private LocalDate csatlakozasDatuma;

	public Allamok(String[] szoveg) {
		this.orszag = szoveg[0];
		this.csatlakozasDatuma = LocalDate.parse((szoveg[1].replace(".", "-")));
	}

	@Override
	public String toString() {
		return "Ország neve: " + this.orszag + ", csatlakozás dátuma: "
				+ ((this.csatlakozasDatuma).toString().replace("-", "."));
	}

}
