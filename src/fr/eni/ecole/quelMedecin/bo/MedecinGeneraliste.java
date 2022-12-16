package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui modélise un médecin généraliste et ses honoraires
 * @date 16/12/2022
 * @author benocode
 * @version Medic - v1.0
 */

public class MedecinGeneraliste {

// 1 - Caractéristiques d'un médecin généraliste

	private String nom;
	private String prenom;
	private String numeroDeTelephone;
	private static int tarif = 25; // L'attribut tarif est déclaré static pour indiquer que c'est un élément commun à toutes les instances et non spécifique
	
// 2 - Constructeur	
	
	/**
	 * Constructeur qui crée une instance de médecin généraliste dont le nom, prénom et numéro de téléphone sont passés en paramètres
	 * @param nom du médecin généraliste à créer
	 * @param prenom du médecin généraliste à créer
	 * @param numeroDeTelephone du médecin généraliste à créer
	 */
	public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
		this.nom = nom.toUpperCase();
		this.prenom = prenom;
		this.numeroDeTelephone = numeroDeTelephone;
	}

// 3 - Getters et Setters
	
	/**
	 * Getter pour numeroDeTelephone
	 * @return le numéro de téléphone du médecin généraliste
	 */
	public String getNumeroDeTelephone() {
		return this.numeroDeTelephone;
	}

	/**
	 * Setter pour numeroDeTelephone
	 * @param numeroDeTelephone, le numéro de téléphone du médecin généraliste à enregistrer
	 */
	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	/**
	 * Getter pour tarif
	 * @return le tarif de la consultation
	 * tarif est static car commun à toutes les instances
	 */
	public static int getTarif() {
		return MedecinGeneraliste.tarif;
	}

	/**
	 * Setter pour tarif
	 * @param tarif, les honoraires du médecin généraliste à appliquer
	 * tarif est static car commun à toutes les instances
	 */
	public static void setTarif(int tarif) {
		MedecinGeneraliste.tarif = tarif;
	}

	/**
	 * Getter pour nom
	 * @return le nom du médecin généraliste
	 */
	public String getNom() {
		return this.nom;
	}
	
// 4 - Méthode
	
	/**
	 * Méthode afficher() pour MedecinGeneraliste : affiche le nom, prénom, numéro de téléphone et le tarif du médecin généraliste
	 */
	public void afficher() {
		System.out.println(nom + " " + prenom);
		System.out.println("Téléphone : " + numeroDeTelephone);
		System.out.println("Tarif : " + MedecinGeneraliste.tarif+"€");
	}
	
}
