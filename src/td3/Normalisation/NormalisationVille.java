package td3.Normalisation;

public class NormalisationVille {
	public static String upperCaseFirst(String ville) {
		char[] arr = ville.toCharArray();
		arr[0] = Character.toUpperCase(arr[0]);
		return new String(arr);
	}

	public static String normalize(String ville) {
		ville = ville.replaceAll("\\s+", "");
		if (ville.contains("le") || ville.contains("l�s") || ville.contains("sous") || ville.contains("sur")
				|| ville.contains("�") || ville.contains("aux") || ville.contains("St") || ville.contains("Ste")) {
			ville = ville.replace("le", "-le-");
			ville = ville.replace("l�s", "-l�s-");
			ville = ville.replace("sous", "-sous-");
			ville = ville.replace("sur", "-sur-");
			ville = ville.replace("�", "-�-");
			ville = ville.replace("aux", "-aux-");
			ville = ville.replace("St", "Saint-");
			ville = ville.replace("Ste", "Sainte-");
		}
		return ville;
	}

}
