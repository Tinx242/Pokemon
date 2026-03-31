package models;

import metier.Pokemon;
import metier.PokemonElectrique;
import metier.PokemonFeu;
import metier.TypePokemon;

public class Application {
	public static void main(String[] args) {
		Pokemon dragofeu = new Pokemon("Dragofeu", TypePokemon.FEU , 100 , 400 , 40);
		PokemonElectrique pikachu = new PokemonElectrique("Pikachu", TypePokemon.ELECTRIQUE, 100 , 900 , 50);
		PokemonFeu Brazegali = new PokemonFeu("Brazegali", TypePokemon.FEU , 100 , 400 , 40);
        Brazegali.infernape(pikachu);
				System.out.println(pikachu);

	}
		
		
}
