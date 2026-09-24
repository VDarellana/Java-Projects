/**
 * @author Victor Daniel Arellana Assia
 * Date: 07/02/2026
 * Course: CS 1027
 * Assignment 1 - Scrabble
 */


import java.util.Random;

public class Tile {
    private char letter;

    public Tile() {
        letter = generateLetter(); // Generate a random letter for the tile
    }

    public Tile(char c) {
        letter = c; // Initialize the tile with the provided letter
    }

    private char generateLetter() {
        Random random = new Random(); 
        // the ASCII value of 'A' is 65 and 'Z' is 90
        return (char) (random.nextInt(26) + 'A');
    }

    public char getLetter() {
        return letter; // Return the letter of the tile
    }
}
