package td2.metier;

public class Periodicite {
	private int id_periodicite;
	private String libelle;

	public Periodicite(String libelle) {
		this(-1, libelle);
	}

	public Periodicite(int id_periodicite, String libelle) {
		this.setId_periodicite(id_periodicite);
		this.setLibelle(libelle);
	}

	public int getId_periodicite() {
		return id_periodicite;
	}

	public void setId_periodicite(int id_periodicite) {
		this.id_periodicite = id_periodicite;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		if (libelle == null || libelle.trim().length() == 0) {
			throw new IllegalArgumentException("Libelle vide !");
		}
		this.libelle = libelle;
	}

	public String toString() {
		return "(" + (this.id_periodicite >= 0 ? this.id_periodicite : "nouveau") + ") " + this.libelle;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Periodicite other = (Periodicite) obj;
		if (id_periodicite != other.id_periodicite)
			return false;
		return true;
	}

}
