package td3.Normalisation;

public class NormalisationNumeroVoie {

	public static String normalize(int numero, String nomrue) {
		String adresse = numero + nomrue;
		if (adresse.contains(",")) {
			return adresse;
		} else
			adresse = numero + "," + nomrue;
		return adresse;

	}

}
