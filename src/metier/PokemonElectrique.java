package metier;

public class PokemonElectrique extends Pokemon {

    public PokemonElectrique(String nom, TypePokemon type, int pv, int puissance, int atk) {
        super(nom, type, pv, puissance, atk);
    }

    public PokemonElectrique() {}

    public void Eclair(Pokemon cible) {
        System.out.println(getnom() + " lance un Éclair");

        int degats;

        if (cible.getType().equals(TypePokemon.FEU)) {
            degats = 15 + getatk() * 2;
            cible.setpv(cible.getpv() - degats);
            System.out.println(cible.getnom() + " a subi " + degats + " dégâts");
            System.out.println(cible.getnom() + " n'a plus que " + cible.getpv() + " points de vie");

        } else if (cible.getType().equals(TypePokemon.PLANTE)) {
            degats = 15 + getatk() / 2;
            cible.setpv(cible.getpv() - degats);
            System.out.println(cible.getnom() + " a subi " + degats + " dégâts");
            System.out.println(cible.getnom() + " n'a plus que " + cible.getpv() + " points de vie");

        } else {
            degats = 15 + getatk();
            cible.setpv(cible.getpv() - degats);
            System.out.println(cible.getnom() + " a subi " + degats + " dégâts");
            System.out.println(cible.getnom() + " n'a plus que " + cible.getpv() + " points de vie");
        }

        if (cible.getpv() <= 0) {
            System.out.println(cible.getnom() + " est mort");
        }
    }
}