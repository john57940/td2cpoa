package td3.Normalisation;

public class NormalisationCodePostal {
	public static String normalize(String code) {
		code = code.replaceAll("\\s+", "");
		int StringLength = code.length();
		if (StringLength == 4) {
			return "0" + code;
		} else if (StringLength == 6) {
			return code.substring(2);
		} else {
			return code; // on part du principe que les gens écrivent des codes valides donc entre 4 et 6
							// caractères
		}
	}
}
