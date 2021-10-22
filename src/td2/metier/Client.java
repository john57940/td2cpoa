package td2.metier;

public class Client {
	private int id_client;
	private String nom;
	private String prenom;
	private String no_rue;
	private String voie;
	private String code_postal;
	private String ville;
	private String pays;

	public Client (String nom, String prenom, String no_rue, String voie, String code_postal,String ville, String pays) {
	 this(-1, nom, prenom, no_rue, voie, code_postal, ville, pays);
	 }

	public Client(int id_client, String nom, String prenom, String no_rue, String voie, String code_postal,String ville, String pays) {
		this.setId_client(id_client);
		this.setNo_rue(nom);
		this.setNom(prenom);
		this.setNo_rue(no_rue);
		this.setVille(voie);
		this.setCode_postal(code_postal);
		this.setVille(ville);
		this.setPays(pays);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if (nom == null || nom.trim().length() == 0) {
			throw new IllegalArgumentException("Nom vide !");
		}
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		if (prenom == null || prenom.trim().length() == 0) {
			throw new IllegalArgumentException("Prenom vide !");
		}
		this.prenom = prenom;
	}

	public String getNo_rue() {
		return no_rue;
	}

	public void setNo_rue(String no_rue) {
		if (no_rue == null || no_rue.trim().length() == 0) {
			throw new IllegalArgumentException("Numéro de la rue vide !");
		}
		this.no_rue = no_rue;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		if (voie == null || voie.trim().length() == 0) {
			throw new IllegalArgumentException("Voie vide !");
		}
		this.voie = voie;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		if (code_postal == null || code_postal.trim().length() == 0) {
			throw new IllegalArgumentException("Code postal vide !");
		}
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		if (ville == null || ville.trim().length() == 0) {
			throw new IllegalArgumentException("nom de la ville vide !");
		}
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		if (pays == null || pays.trim().length() == 0) {
			throw new IllegalArgumentException("Nom du pays vide !");
		}
		this.pays = pays;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public String toString() {
		return "(" + (this.id_client >= 0 ? this.id_client : "nouveau") + ") " + this.nom + this.prenom + this.no_rue + this.voie + this.code_postal + this.ville + this.pays;
	}

}
