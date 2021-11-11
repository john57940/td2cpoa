package application.controleur;
/*
 * package application;
 * 
 * import td2.dao.factory.DAOFactory; import td2.dao.factory.Persistance; import
 * javafx.collections.FXCollections; import javafx.fxml.FXML; import
 * javafx.fxml.Initializable; import javafx.scene.control.ComboBox; import
 * javafx.scene.control.RadioButton; import javafx.scene.paint.Color; import
 * td2.metier.Periodicite; import td2.metier.Revue;
 * 
 * import java.awt.Button; import java.awt.Label; import java.awt.TextArea;
 * import java.awt.TextField; import java.net.URL; import
 * java.util.ResourceBundle;
 * 
 * public class ControleurRevue implements Initializable {
 * 
 * @FXML private TextField idtitre;
 * 
 * @FXML private TextField idtarif;
 * 
 * @FXML private ComboBox<Periodicite> idperiodicite;
 * 
 * @FXML private TextArea iddescription;
 * 
 * @FXML private Button idcreer;
 * 
 * @FXML private Label idaffichage;
 * 
 * @FXML private RadioButton sql;
 * 
 * @FXML private RadioButton liste;
 * 
 * @Override public String toString() { return "Ajout de : " + idtitre.getText()
 * + " (" + idtarif.getText() + ")"; }
 * 
 * public void initialize(URL location, ResourceBundle resources) {
 * 
 * DAOFactory dao = DAOFactory.getDAOFactory(Persistance.LISTE_MEMOIRE);
 * 
 * this.idperiodicite.setItems(FXCollections.observableArrayList(((Object)
 * dao.getPeriodiciteDAO()).findAll()));
 * 
 * }
 * 
 * @FXML public void create() {
 * 
 * Periodicite period = idperiodicite.getValue();
 * 
 * if ((idtitre.getText().isEmpty()) || (iddescription.getText().isEmpty()) ||
 * (idtarif.getText().isEmpty()) || (period == null) || ((sql == null) && (liste
 * == null))) { idaffichage.setTextFill(Color.web("jaune"));
 * this.idaffichage.setText("Les champs ne sont pas valides"); } else {
 * DAOFactory daos = null; if (sql.isSelected()) { daos =
 * DAOFactory.getDAOFactory(Persistance.MYSQL); } else if (liste.isSelected()) {
 * daos = DAOFactory.getDAOFactory(Persistance.LISTE_MEMOIRE); } try { double
 * tarif = Double.parseDouble(idtarif.getText());
 * idaffichage.setTextFill(Color.web("vert")); idaffichage.setText(toString());
 * String titre = texte_titre.getText(); String description =
 * texte_description.getText();
 * 
 * daos.getRevueDAO().create(new Revue(1,1,titre, description, 4.F, null)); }
 * catch (Exception e) { label_recap.setTextFill(Color.web("jaune"));
 * this.label_recap.setText("Erreur"); } } }
 * 
 * }
 */