/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion_pokemon;

/**
 *
 * @author administrador
 */
public class Programacion_pokemon {

public class Pokemon{
    public String name;
    public String PokemonType;
    public float hp ;
    public float attack;
    public float defense;
    public float speed;
    
         

    //Constructor
    public Pokemon(String name, String PokemonType, float hp, float attack, float defense, float speed){
    this.name = name;
    this.PokemonType = PokemonType;
    this.hp = hp;
    this.attack = attack;
    this.defense = defense;
    this.speed = speed;
         
}

};




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu","🌩", 180,45,50,100);
        
        System.out.println("" + pikachu.name);
    }
    
}
