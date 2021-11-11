package application.vue;

import java.net.URL;

import application.controleur.ControleurPeriodicite;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class VuePeriodicite extends Stage {
	private ControleurPeriodicite controleur;

	public VuePeriodicite() { 
		try {
			this.initModality(Modality.APPLICATION_MODAL);
			final URL fxmlURL= getClass().getResource("/application/vue/Periodicite.fxml");
			final FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL); 
			final VBox node = (VBox)fxmlLoader.load();
			Scene scene = new Scene(node);
			controleur = fxmlLoader.getController();
			setScene(scene);
			setTitle("Periodicite");
			controleur.setVue(this);
			this.show();
		}catch(Exception e ) {
			e.printStackTrace();
		}
	}
	
	
	public ControleurPeriodicite getControleur() {
		return controleur;
	}
	public void setControleur(ControleurPeriodicite controleur) {
		this.controleur = controleur;
	}
}
