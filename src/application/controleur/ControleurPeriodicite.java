package application.controleur;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import td2.dao.factory.DAOFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import td2.metier.Periodicite;

public class ControleurPeriodicite implements ChangeListener<Periodicite>, Initializable {
	@FXML
	private TextField txtLibelle;
	@FXML
	private TableView<Periodicite> tblPeriodicite;
	@FXML
	private Stage vue;
	@FXML
	private Button btnDelete;
	@FXML
	private TableColumn<Periodicite, Integer> id;
	@FXML
	private TableColumn<Periodicite, String> libelle;
	private DAOFactory dao;

	public void ajouterPeriodicite() {
		String libelle = this.txtLibelle.getText();

		Pattern pattern = Pattern.compile("^[A-Za-z-]+$");
		Matcher matcherLibelle = pattern.matcher(libelle);

		if (libelle == null || "".equals(libelle)) {
			throw new IllegalArgumentException("Saisir un libelle");
		} else if (!matcherLibelle.find()) {
			throw new IllegalArgumentException("Saisir un libelle valide");
		} else {
			try {
				Periodicite periodicite = new Periodicite(libelle);
				dao.getPeriodiciteDAO().create(periodicite);
				this.tblPeriodicite.getItems().add(periodicite);
			} catch (Exception sqle) {
				System.out.println(sqle.getMessage());
			}
		}
	}

	public void voirPeriodicite() {

		try {

			id.setCellValueFactory(new PropertyValueFactory<Periodicite, Integer>("idPeriodicite"));
			libelle.setCellValueFactory(new PropertyValueFactory<Periodicite, String>("Libelle"));

			this.tblPeriodicite.getColumns().setAll(id, libelle);
			this.tblPeriodicite.getItems().addAll(dao.getPeriodiciteDAO().findAll());
			this.tblPeriodicite.getSelectionModel().selectedItemProperty().addListener(this);

		} catch (Exception sqle) {
			System.out.println(sqle.getMessage());
		}
	}

	public void supprimerPeriodicite() {

		try {
			dao.getPeriodiciteDAO().delete(this.tblPeriodicite.getSelectionModel().getSelectedItem());
			this.tblPeriodicite.getItems().remove(this.tblPeriodicite.getSelectionModel().getSelectedItem());
		} catch (Exception sqle) {
			System.out.println(sqle.getMessage());
		}
	}

	public Stage getVue() {
		return vue;
	}

	public void setVue(Stage vue) {
		this.vue = vue;
	}

	public DAOFactory getDao() {
		return dao;
	}

	public void setDao(DAOFactory dao) {

		this.dao = dao;
	}

	@Override
	public void changed(ObservableValue<? extends Periodicite> observable, Periodicite oldValue, Periodicite newValue) {
		this.btnDelete.setDisable(newValue == null);
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.voirPeriodicite();
	}

}
