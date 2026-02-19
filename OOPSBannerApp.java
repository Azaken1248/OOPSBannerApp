/**
* OOPSBannerApp UC7 - Store Character Pattern in a class
*
* This use case extends upon UC6 by implementing a CharacterPatternMap class to encapsulate
* character-to-pattern mappings. The application retrieves and displays the "OOPS"
* banner using these mappings. This approach enhances code organization and modularity.
*
* @author Developer
* @version 7.0 
*/

// Extend the user story 6 to display the CharacterPatternMap class to encapsulate
// character-to-pattern mappings. The application retrieves and displays the "OOPS"
// banner using these mappings. Thereby addressing the drawback of not having
// centralized character pattern management system

import java.util.Arrays;

public class OOPSBannerApp{    
	/**
	 * CharacterPatternMap - Inner class for storing character-to-pattern mappings
	 * 
	 * Encapsultes a single character and its corresponding ASCII art pattern.
	 * Provides immutable access to character and pattern data through getters.
	 */
	static class CharacterPatternMap{
		/** The character being represented */
		Character character;
		/** The ASCII art pattern lines for the character */
		String[] pattern;

		/**
		 * Constructs a CharacterPatternMap with a character and its pattern
		 * 
		 * @param character the character to be mapped
		 * @param pattern the ASCII art pattern representation as array of strings
		 */
		public CharacterPatternMap(Character character, String[] pattern){
			this.character = character;
			this.pattern = pattern;
		}

		/**
		 * Retrieves the mapped character
		 * 
		 * @return the character associated with the pattern map
		 */
		public Character getCharacter(){
			return this.character;
		}

		/**
		 * Retrieves te ASCII art pattern
		 * 
		 * @return the pattern array representing the character
		 */
		public String[] getPattern(){
			return this.pattern;
		}
	}

	/**
	 * Static Method to Create and initialize CharacterPatternMap array for predefined characters
	 * 
	 * Populates pattern maps for the letter 'O', 'P', 'S' and space character
	 * Each character has a 9-line ASCII art representation.
	 * 
	 * @return array of CharacterPatternMap objects containing character patterns
	 */
	public static CharacterPatternMap[] createCharacterPatternMaps(){
		
		String[] oPattern = {
			"   ***    ",
			" **   **  ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			" **   **  ",
			"   ***    "
		};

		String[] pPattern = {
			"******    ",
			"**    **  ",
			"**     ** ",
			"**    **  ",
			"******    ",
			"**        ",
			"**        ",
			"**        ",
			"**        "
		};

		String[] sPattern = {
			"   ***** ",
			" **      ",
			"**       ",
			" **      ",
			"   ***   ",
			"      ** ",
			"       **",
			"      ** ",
			"*****    ",


		};

		String[] spacePattern = {
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
			"         ",
		};

		return new CharacterPatternMap[] {
			new CharacterPatternMap('O', oPattern),
			new CharacterPatternMap('P', pPattern),
			new CharacterPatternMap('S', sPattern),
			new CharacterPatternMap(' ', spacePattern)
		};
	}

	/**
	 * Retrieves the ASCII pattern for a given character
	 * 
	 * Searches through the character pattern maps to find a matching character
	 * If the character is not found, recursively returns the pattern for the space character
	 * 
	 * @param ch the character to look up
	 * @param charMap the array of CharacterPatternMap to find a matching character
	 * @return the pattern array for the given character, or space pattern if not found
	 */
	public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps){
		for(CharacterPatternMap chMap : charMaps){
			if(chMap.getCharacter() == ch) return chMap.getPattern();
		}

		if(ch != ' ') return getCharacterPattern(' ', charMaps);

		return null;
	}

	/**
	 * Prints a message as a banner using ASCII art patterns
	 * 
	 * Renders the entire message horizontally by combining individual character
	 * patterns line by line. Characters are seperated by spacing for readability.
	 * 
	 * @param message the message string to be displayed by banner
	 * @param charMaps the array of CharacterPatternMap objects containing available patterns
	 */
	public static void printMessage(String message, CharacterPatternMap[] charMaps){
		String[][] chars = new String[message.length()][9];

		for(int i = 0; i < message.length(); i++){
			chars[i] = getCharacterPattern(message.charAt(i), charMaps);
		}
		

		for(int i = 0; i < 9; i++){
			for(int j = 0; j < message.length(); j++){
				System.out.print(chars[j][i]);
			}
			System.out.println();
		}

	}
		


    /**
	 * Main method - Entry point for the banner display application
	 * 
	 * Intiliazes the character pattern maps and displays "OOPS" as an ASCII art banner
	 * 
	 * @param args command line arguments (not used)
	 */
    public static void main(String[]args){
		// Create CharacterPatternMap array
		CharacterPatternMap[] charMaps = createCharacterPatternMaps();
		// Define the message to be displayed
		String message = "OOPS";
		// print the banner message
		printMessage(message, charMaps);
	}
}
