package metier;

public class PokemonElectrique extends Pokemon {

	private TypePokemon type;
	
	public PokemonElectrique(String nom ,TypePokemon type, int pv , int puissance , int atk) {
		super (nom , type , pv , puissance ,atk);
		this.type = TypePokemon.ELECTRIQUE;
	}
	public PokemonElectrique() {}
	
	public void Eclair(Pokemon cible) {
		
	System.out.println(getnom() + " lance une Eclair");
	
	if(cible.getType().equals(type.FEU)) {
	cible.setpv(cible.getpv()- (15 + getatk()*2));
	System.out.println(cible.getnom() + " a subit " + getatk() + " de dégats");
	System.out.println(cible.getnom() + " n'a plus que " + cible.getpv() + " points de vie");
	}
	else if (cible.getType().equals(type.PLANTE)) { 
		cible.setpv(cible.getpv() - (15 + getatk()/2));
	System.out.println(cible.getnom() + " a subit " + (15 + getatk()/2)+ " de dégats");
	System.out.println(cible.getnom() + " n'a plus que " + cible.getpv() + " points de vie");
	}
	else {cible.setpv(cible.getpv() - (15 + getatk()));

	}
	int i = 0;
	if (cible.getpv() <= i) {

	System.out.println(cible.getnom() + " est mort");

		}
	}
	
	

}

