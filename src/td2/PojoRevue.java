package td2;

public class PojoRevue {

	private int id_periodicite;
	private int id_revue;
	private String titre;
	private String description;
	private float tarif_numero;
	private String visuel;
	
	public PojoRevue(int id_periodicite, int id_revue, String titre, float tarif_numero, String visuel) {
		this.setId_periodicite(id_periodicite);
		this.setId_revue(id_revue);
		this.setTitre(titre);
		this.setDescription(description);
		this.setTarif_numero(tarif_numero);
		this.setVisuel(visuel);
	}

	public int getId_periodicite() {
		return id_periodicite;
	}

	public void setId_periodicite(int id_periodicite) {
		this.id_periodicite = id_periodicite;
	}

	public int getId_revue() {
		return id_revue;
	}

	public void setId_revue(int id_revue) {
		this.id_revue = id_revue;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		if (titre == null || titre.trim().length() == 0) {
			throw new IllegalArgumentException("Titre vide !");
		}
		this.titre = titre;
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description == null || description.trim().length() == 0) {
			throw new IllegalArgumentException("Description vide !");
		}
		this.description = description;
	}

	public float getTarif_numero() {
		return tarif_numero;
	}

	public void setTarif_numero(float tarif_numero) {
		this.tarif_numero = tarif_numero;
	}

	public String getVisuel() {
		return visuel;
	}

	public void setVisuel(String visuel) {
		if (visuel == null || visuel.trim().length() == 0) {
			throw new IllegalArgumentException("Visuel vide !");
		}
		this.visuel = visuel;
	}

	public String toString() {
		return "(" + (this.id_revue >= 0 ? this.id_revue : "nouveau") + ") " + this.titre + this.description
				+ this.tarif_numero + this.visuel + this.id_periodicite;
	}

}
