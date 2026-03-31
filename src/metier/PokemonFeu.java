package metier;

public class PokemonFeu extends Pokemon {

    public PokemonFeu(String nom, TypePokemon type, int pv, int puissance, int atk) {
        super(nom, type, pv, puissance, atk);
    }

    public PokemonFeu() {}

    public void infernape(Pokemon ennemi) {
        System.out.println(getnom() + " lance Infernape");

        int degats;

        if (ennemi.getType().equals(TypePokemon.PLANTE)) {
            degats = 15 + getatk() * 2;
            ennemi.setpv(ennemi.getpv() - degats);
            System.out.println(ennemi.getnom() + " a subi " + degats + " dégâts");
            System.out.println(ennemi.getnom() + " n'a plus que " + ennemi.getpv() + " points de vie");

        } else if (ennemi.getType().equals(TypePokemon.EAU)) {
            degats = 15 + getatk() / 2;
            ennemi.setpv(ennemi.getpv() - degats);
            System.out.println(ennemi.getnom() + " a subi " + degats + " dégâts");
            System.out.println(ennemi.getnom() + " n'a plus que " + ennemi.getpv() + " points de vie");

        } else {
            degats = 15 + getatk();
            ennemi.setpv(ennemi.getpv() - degats);
            System.out.println(ennemi.getnom() + " a subi " + degats + " dégâts");
            System.out.println(ennemi.getnom() + " n'a plus que " + ennemi.getpv() + " points de vie");
        }

        if (ennemi.getpv() <= 0) {
            System.out.println(ennemi.getnom() + " est mort");
        }
    }
}