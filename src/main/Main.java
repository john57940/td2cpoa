package main;

import td2.dao.mysql.*;
import td2.dao.listememoire.*;
import td2.metier.*;

public class Main {
	public static void main(String[] arg) throws Exception {

	

	System.out.println("Liste des Periodicites : ");
	System.out.println(ListeMemoirePeriodiciteDAO.getInstance().getById(1));
	System.out.println(ListeMemoirePeriodiciteDAO.getInstance().getById(2));
	
	Periodicite perio1 = new Periodicite(7,"Mensuel");
	ListeMemoirePeriodiciteDAO.getInstance().create(perio1);
	System.out.println("voici l'objet créé : ");
	System.out.println(ListeMemoirePeriodiciteDAO.getInstance().getById(3));
	
	
	System.out.println("voici l'objet modifié : ");
	Periodicite perio2 = new Periodicite(3,"Hebdomadaire");
	ListeMemoirePeriodiciteDAO.getInstance().update(perio2);
	System.out.println(ListeMemoirePeriodiciteDAO.getInstance().getById(3));

	
	System.out.println("Je supprime l'objet periodicite : ");
	ListeMemoirePeriodiciteDAO.getInstance().delete(perio2);
	System.out.println(ListeMemoirePeriodiciteDAO.getInstance().getById(3));
	System.out.println("onjet supprimé ");
	
	Connection.creeConnexion();
	System.out.println("Liste des Periodicites : ");
	Periodicite perio3 = new Periodicite(1,"Mensuelle");
	MySQLPeriodiciteDAO.getInstance().create(perio3);
	System.out.println(MySQLPeriodiciteDAO.getInstance().getById(1));

	
	System.out.println("voici l'objet modifié : ");
	Periodicite perio4 = new Periodicite(1,"Tous les jours");
	MySQLPeriodiciteDAO.getInstance().update(perio4);
	System.out.println(MySQLPeriodiciteDAO.getInstance().getById(1));

	System.out.println("Je supprime un objet periodicite : ");
	MySQLPeriodiciteDAO.getInstance().delete(perio4);
	System.out.println(ListeMemoirePeriodiciteDAO.getInstance().getById(3));
	System.out.println(" objet supprimé ");

}
	
	
}
