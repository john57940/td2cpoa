package td2;
	public class Perio {
	private int id_periodicite;
	private String libelle;
	public Perio(String libelle) {
	this(-1, libelle);
	}
	public Perio(int id_periodicite, String libelle) {
	this.setId_periodicite(id_periodicite);
	this.setLibelle(libelle);
	}
	public int getId_periodicite() { public String getLibelle() {
	return this.id_periodicite; return this.libelle;
	} }