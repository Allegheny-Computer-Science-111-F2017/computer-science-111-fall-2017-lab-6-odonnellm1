package labsix;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * This class produces a simple DNA Manipulation.
 * The program will ask the user to enter a DNA-sequence
 * And then the program will manipulate the sequence
 * Multiple different ways/
 *
 * <p>Bugs: This program has no known bugs.
 *
 * @author Molly O'Donnell
 */

public class ManipulateDna {

  /**
   * This program will produce a manipulated DNA sequence.
   *
   * @author Molly O'Donnell
   */

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Molly O'Donnell " + new Date());
    // declare the starting file and scanner
    File dnaInputsFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      dnaInputsFile = new File("input/dna_inputs.txt");
      scanner = new Scanner(dnaInputsFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // Step One: Read in and display the chosen DNA string
    String dna = scanner.nextLine();
    System.out.println("Okay, I am going to manipulate the DNA string " + dna);
    System.out.println(); 
    System.out.println("Enter a string containing only C, G, T, and A: " + dna);
   
    // Step Two: Compute the complement of the DNA String
    String comp1 = dna.replace('a', 'T');
    String comp2 = comp1.replace('t', 'A');
    String comp3 = comp2.replace('c', 'G');
    String comp4 = comp3.replace('g', 'C');
    comp4 = comp4.toUpperCase();
    System.out.println("The complement of " + dna + " is " + comp4);

    // Step Three: Insert a randomly chosen DNA letter into the DNA String
    Random random = new Random();
    int num1 = random.nextInt(4);
    char randomLetter = dna.toUpperCase().charAt(num1);
    int n6 = random.nextInt(4);
    String inDna = dna.substring(0, n6) + randomLetter + dna.substring(n6);
    inDna = inDna.toUpperCase();
    System.out.println("Inserting " + randomLetter + " at position " + n6 + " gives " + inDna);    
 
    // Step Four: Delete a DNA letter from a randomly chosen position in the DNA string
    int num2 = random.nextInt(4);
    String deletedDna = dna.substring(0, num2) + dna.substring(num2 + 1);
    deletedDna = deletedDna.toUpperCase();
    System.out.println("Deleting from position " + num2 + " gives " + deletedDna);
    // Step Five: Change a random position in the DNA String to a randomly chosen DNA letter
    int num3 = random.nextInt(4);
    int num4 = random.nextInt(4);
    char randomPosition = dna.charAt(num3);
    char randomLetter2 = dna.charAt(num4);
    String changedPosition = dna.replace(randomPosition, randomLetter2);
    changedPosition = changedPosition.toUpperCase();
    System.out.println("Changing position " + num3 + " gives " + changedPosition);
    System.out.println();

    // Step Six: Display a final thankyou message
    System.out.println("Thanks for using the Manipulation program.");
    System.out.println("Have an amazing day.");

  }

}
