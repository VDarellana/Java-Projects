/**
 * @author Victor Daniel Arellana Assia
 * Date: 07/02/2026
 * Course: CS 1027
 * Assignment 1 - Scrabble
 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Scrabble {
    private Tile tiles[];

    public Scrabble() {
        this.tiles = new Tile[7]; // Create an array of 7 Tile objects
        for(int i = 0; i < 7; i++) { // Initialize each Tile object in the array and generate a random letter for each tile
            this.tiles[i] = new Tile();
        }
    }

    public Scrabble(Tile[] tiles) {
        this.tiles = tiles; // Initialize the tiles array with the provided Tile objects
    }

    public String getLetters() {
        String letters = "";
        for (Tile tile : tiles) { // Loop through each Tile object in the tiles array and adds the letters of each tile to the letters string
            if(tile != null) {
                letters += tile.getLetter();
            }
        }
        return letters;
    }

    public ArrayList<String> getWords() throws FileNotFoundException {
        ArrayList<String> spellableWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("CollinsScrabbleWords2019.txt"))) { // do not change this line (otherwise the autograder will fail you)
            String word; // stores the word that we are currently looking at
            while ((word = br.readLine()) != null) { // loops through each individual word in the CollinsScrabbleWords2019.txt file
                char[] myLetters = this.getLetters().toCharArray(); // converts the letters of the current Scrabble object to a char array
                int counter = 0; // Checker to see if the word can be spelled with the letters in the current Scrabble object
                for (char c : word.toCharArray()) { // loops through each letter in the current word and checks if it can be spelled with the letters in the current Scrabble object
                    boolean found = false;
                    for (int i = 0; i < myLetters.length; i++) {
                        if (myLetters[i] == c) {
                            myLetters[i] = '0'; // Mark the letter as used
                            found = true;
                            counter++;
                            break;
                        }
                    }
                    if (!found) {
                        break; // If the letter is not found, break out of the loop
                    }

                }
                if(counter == word.length()) {
                    spellableWords.add(word);
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return spellableWords;
    }

    public int[] getScores() throws FileNotFoundException {
        ArrayList<String> spellableWords = this.getWords();
        int[] wordScores = new int[spellableWords.size()];

        for (int i = 0; i < spellableWords.size(); i++) {
            String wordFound = spellableWords.get(i);
            int score = 0;
            for (char c : wordFound.toCharArray()) {
                score += getLetterValue(c);
            }
            wordScores[i] = score;
        }

        Arrays.sort(wordScores);
        return wordScores;
    }
 
    // This method returns the score of a given letter based on Scrabble rules
    private int getLetterValue(char letter) {
        if(letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'L' || letter == 'N' || letter == 'S' || letter == 'T' || letter == 'R') {
            return 1; // All Letters of value 1
        } else if(letter == 'D' || letter == 'G') {
            return 2;   // All Letters of value 2
        } else if(letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
            return 3; // All Letters of value 3
        } else if(letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
            return 4; // All Letters of value 4
        } else if(letter == 'K') {
            return 5; // All Letters of value 5
        } else if(letter == 'J' || letter == 'X') {
            return 8;// All Letters of value 8
        } else if(letter == 'Q' || letter == 'Z') {
            return 10;// All Letters of value 10
        }else {
            return 0;// This should never happen, but to avoid a compile error we need an exit return
        }
    }

    public boolean equals(Scrabble s) {

        // hint: we can convert the String returned from the getLetters method to a char array like this:
         char[] thisCharArray = this.getLetters().toCharArray();
         char[] otherCharArray = s.getLetters().toCharArray();
         
         Arrays.sort(thisCharArray); // sort the char arrays so that we can compare them lexicographically
         Arrays.sort(otherCharArray);

         return Arrays.equals(thisCharArray, otherCharArray); // Returns true if the two char arrays are equal, false otherwise
            
    }
}
