package td3.Normalisation;

public class NormalisationNomVoie {

	public static String normalize(String nomvoie) {
		if (nomvoie.contains("bd ") || nomvoie.contains("boul ") || nomvoie.contains("boul.") || nomvoie.contains("av.")
				|| nomvoie.contains("faub.") || nomvoie.contains("fg ") || nomvoie.contains("pl.")) {
			nomvoie = nomvoie.replace("bd ", "boulevard ");
			nomvoie = nomvoie.replace("boul ", "boulevard ");
			nomvoie = nomvoie.replace("boul.", "boulevard ");
			nomvoie = nomvoie.replace("av.", "avenue ");
			nomvoie = nomvoie.replace("faub.", "faubourg ");
			nomvoie = nomvoie.replace("fg ", "faubourg ");
			nomvoie = nomvoie.replace("pl.", "place ");
		}
		return nomvoie;
	}
}
