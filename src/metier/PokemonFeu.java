package metier;

public class PokemonFeu extends Pokemon {

	private TypePokemon type;

	public PokemonFeu(String nom ,TypePokemon type, int pv , int puissance , int atk) {
		super (nom , type , pv , puissance ,atk);
		this.type = TypePokemon.FEU;
	}
	public PokemonFeu() {}
	
	public void infernape(Pokemon ennemie) {
		
	System.out.println(getnom() + " lance une infernape");
	
	if(ennemie.getType().equals(type.PLANTE)) {
	ennemie.setpv(ennemie.getpv()- (15 + getatk()*2));
	System.out.println(ennemie.getnom() + " a subit " + getatk() + " de dégats");
	System.out.println(ennemie.getnom() + " n'a plus que " + ennemie.getpv() + " points de vie");
	}
	else if (ennemie.getType().equals(type.EAU)) { 
	ennemie.setpv(ennemie.getpv() - (15 + getatk()/2));
	System.out.println(ennemie.getnom() + " a subit " + (15 + getatk()/2)+ " de dégats");
	System.out.println(ennemie.getnom() + " n'a plus que " + ennemie.getpv() + " points de vie");
	}
	else {ennemie.setpv(ennemie.getpv() - (15 + getatk()));

	}
	System.out.println(ennemie.getnom() +" n'a plus que:" + ennemie.getpv() + "HP");
	int i = 0;
	if (ennemie.getpv() <= i) {
	System.out.println(ennemie.getnom() + " est mort");

		}
	}
	
	

}
