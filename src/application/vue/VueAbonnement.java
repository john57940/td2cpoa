package application.vue;

import java.net.URL;

import application.controleur.ControleurAbonnement;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VueAbonnement extends Stage {
	private ControleurAbonnement controleur;

	public VueAbonnement() {
		try {
			this.initModality(Modality.APPLICATION_MODAL);
			final URL fxmlURL = getClass().getResource("/application/vue/Abonnement.fxml");
			final FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);
			final VBox node = (VBox) fxmlLoader.load();
			Scene scene = new Scene(node);
			controleur = fxmlLoader.getController();
			setScene(scene);
			setTitle("Abonnement");
			controleur.setVue(this);
			this.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ControleurAbonnement getControleur() {
		return controleur;
	}

	public void setControleur(ControleurAbonnement controleur) {
		this.controleur = controleur;
	}

}
