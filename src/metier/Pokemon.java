package metier;

public class Pokemon {
	private String nom;
	private TypePokemon type;
	private int pv;
	private int puissance;
	private int atk;
	
	public Pokemon(){}
	
	public Pokemon(String nom ,TypePokemon type, int pv , int puissance , int atk) {
		this.nom = nom;
		this.type = type;
		this.pv = pv;
		this.puissance = puissance;
		this.atk = atk;
	}
	public String getnom() {
		return nom;
	}
	public int getpv() {
		return pv;
	}
	public int getpuissance(int puissance) {
		return puissance;
	}
	public int getatk() {
		return atk;
	}
	public TypePokemon getType() {
		return type;
		}
	
	
	public void setnom(String nom) {
		this.nom = nom;
	}
	public void setType(TypePokemon type) {
		this.type = type;
		}
	public void setpv(int pv) {
		this.pv = pv;
	}
	public void setpuissance(int puissance) {
		this.puissance = puissance;
	}
	public void setatk(int atk) {
		this.atk = atk;
	}
	
	public boolean estEnVie() {
		return pv>0;
		}
	
	public void attaquer(Pokemon cible) {
		
		System.out.println(nom + " lance une attaque");
		
		cible.setpv(cible.getpv() - atk);
		
			if(cible.estEnVie()) {
		System.out.println(cible.getnom() + " a subit " + atk + " Dégât");
		System.out.println(cible.getnom() +" il ne reste plus que :" + cible.getpv() + "HP");
			}else {
		System.out.println(cible.getnom() + " est mort");
		}
	}
	

	
	@Override
	public String toString() {
	return "\nPokemon :" +nom +"\nType : " + type + "\nPoint de vie : "+ pv +"\nPuissance :" + puissance + "\nPoint d'attaque : "+ atk;
	
	}
	
	
}

