/**
 * 
 */
package fr.eni.ecole.quelMedecin.bo;

/**
 * Classe qui modélise des adresses postales françaises en respectant les recommandations de La Poste
 * @author benocode
 * @date 16/12/2022
 * @version Medic - v1.0
 */

public class Adresse {

// 1 - Caractéristiques d'une adresse
	
	private String mentionsCompl;
	private int numero;
	private String complNumero;
	private String rue;
	private int cp;
	private String ville;
	
// 2 - Constructeurs
	
//	/**
//	 * Constructeur sans paramètres
//	 */
//	
//	public Adresse() {
//	}
	
	/**
	 * Constructeur qui reprend tous les attributs de l'objet Adresse 
	 * @param mentionsCompl : mentions complémentaires de l'adresse (ZI, lieu-dit...)
	 * @param numero : numéro principale de l'adresse
	 * @param complNumero : complément du numéro (bis, B, ter, T, ...)
	 * @param rue : type de voie (rue, avenue, ...) et nom de celle-ci
	 * @param cp : code postal
	 * @param ville : ville
	 */
	
	public Adresse(String mentionsCompl, int numero, String complNumero, String rue, int cp, String ville) {
		this.mentionsCompl = mentionsCompl;
		this.numero = numero;
		this.complNumero = complNumero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville.toUpperCase();
	}
	
	/**
	 * Constructeur qui reprend certains attributs essentiels
	 * @param numero : numéro principale de l'adresse
	 * @param complNumero : complément du numéro (bis, B, ter, T, ...)
	 * @param rue : type de voie (rue, avenue, ...) et nom de celle-ci
	 * @param cp : code postal
	 * @param ville : ville
	 */
	
	public Adresse(int numero, String complNumero, String rue, int cp, String ville) {
		this.numero = numero;
		this.complNumero = complNumero;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
	}
	
// 3 - Méthode
	
	/**
	 * Méthode afficher() pour Adresse, affiche :
	 * mentions complémentaires de l'adresse (OU rien)
	 * numéro principale de l'adresse ET complément du numéro (OU rien) ET rue
	 * code postal VILLE
	 */
	
	public void afficher() {
		if (this.mentionsCompl != null) {
			System.out.println(this.mentionsCompl);
		}
		System.out.printf("%d%s %s%n",this.numero,this.complNumero != null ? this.complNumero : "",this.rue);
		System.out.printf("%05d %s%n",this.cp,this.ville);
	}
	
}
