/**
 * 
 */
package fr.eni.ecole.quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * Classe qui modélise la fiche d'un patient
 * @author benocode
 * @date 16/12/2022
 * @version Medic - v1.0
 */

public class Patient {

// 1 - Caractéristiques d'un patient
	
	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private char sexe;
	private long numSecu;
	private LocalDate dateNaissance;
	private String commentaires;
	
// 2 - Constructeur
	
	/**
	 * Constructeur qui crée une instance de patient
	 * @param nom : nom du patient
	 * @param prenom : prénom du patient
	 * @param numeroDeTelephone : numéro de téléphone du patient
	 * @param sexe : sexe du patient
	 * @param numSecu : numéro de sécurité sociale du patient
	 * @param dateNaissance : date de naissance du patient
	 * @param commentaires : commentaires du médecin concernant le patient (allergies, antécédents médicaux...)
	 */
	
	public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numSecu,
			LocalDate dateNaissance, String commentaires) {
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
		this.sexe = sexe;
		this.numSecu = numSecu;
		this.dateNaissance = dateNaissance;
		this.commentaires = commentaires;
	}

// 3 - Méthode
	
	/**
	 * Méthode afficher() pour Patient, affiche :
	 * NOM Prénom
	 * Téléphone : XXXXXXXXXX
	 * Sexe : Féminin ou Masculin ou Non renseigné
	 * Numéro de sécurité sociale : XXXXXXXXXXXXXXX
	 * Date de naissance : XX mois XXXX
	 * Commentaires : XXXXXXXXXXXXXXXX ou [aucun commentaire]
	 */
	
	public void afficher() {
		String nomSexe;
		switch (this.sexe) {
			case 'F' -> nomSexe = "Féminin";
			case 'M' -> nomSexe = "Masculin";
			default -> nomSexe = "Non renseigné";		
		}
		if (this.commentaires == null) {
			this.commentaires = "[aucun commentaire]";
		}
		System.out.println(nom + " " + this.prenom);
		System.out.println("Téléphone : " + this.numeroDeTelephone);
		System.out.println("Sexe : " + nomSexe);
		System.out.println("Numéro de Sécurité sociale : " + this.numSecu);
		System.out.println("Date de naissance : " + this.dateNaissance.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println("Commentaires : " + this.commentaires);
	}
	
}
