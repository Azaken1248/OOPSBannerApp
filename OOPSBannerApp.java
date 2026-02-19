/**
* OOPSBannerApp- Use Map for Character Patterns and Render via Function
*
* This use case extends UC7 by utilizig advanced Object-Oriented Programming concepts
* such as the Collection Framework to manage character patter in a more flexible
* and efficient manner. The application retrieves and displays the "OOPS" banner
* using a HashMap there by enhancing code organization and modularity
*
* @author Developer
* @version 8.0 
*/

// Extend the user story 7 to utilize advanced Object-Oriented Programming concepts
// such as Collections Framework to manage character patterns in a more flexible
// and efficient manner. The application retrieves and displays the "OOPS" banner
// using these mappings.

import java.util.HashMap;

public class OOPSBannerApp{    
	/**
	 * Creates a HashMap containing ASCII art patterns for supported characters.
	 * 
	 * <p>Each character is mapped to an array of strings where each string represents
	 * one line of the character's ASCII art pattern. All patterns are assumed to have 
	 * the same height
	 * 
	 * @return a HashMap where keys are characters (char) and values are String arrays
	 * 		   representing the ASCII art pattern lines for each character
	 */

	public static HashMap<Character, String[]> createCharacterMap() {
		HashMap<Character, String[]> charMap = new HashMap<>();

		charMap.put('O', new String[] {
			"   ***    ",
			" **   **  ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			"**     ** ",
			" **   **  ",
			"   ***    "
		});

		charMap.put('P', new String [] {
			"******    ",
			"**    **  ",
			"**     ** ",
			"**    **  ",
			"******    ",
			"**        ",
			"**        ",
			"**        ",
			"**        "
		});

		charMap.put('S', new String[] {
			"   ***** ",
			" **      ",
			"**       ",
			" **      ",
			"   ***   ",
			"      ** ",
			"       **",
			"      ** ",
			"*****    ",


		});

		return charMap;
	}

	/**
	 * Displays a banner message using the provided character map.
	 * 
	 * <p>This method renders the input message as a large ASCII art banner by iterating
	 * through each line of the character patterns and horizontally concatenating the
	 * corresponding line from each character message
	 * 
	 * @param message the String message to display as a banner. Each character must
	 * 					exist as a key in the charMap
	 * @param charMap charMap a HashMap containing character patterns, where each character
	 * 					maps to a String array of pattern lines
	 */

	// Static method to display the banner message using the character map
	public static void displayBanner(String message,  HashMap<Character, String[]> charMap) {
		int patternHeight = charMap.get('O').length;

		String defaultPattern[] = {
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

		for (int line = 0; line < patternHeight; line++){
			StringBuilder row = new StringBuilder(70);
			for(int j = 0; j < message.length(); j++){
				row.append(charMap.getOrDefault(message.charAt(j), defaultPattern)[line]);
			}
			System.out.println(row.toString());
		}
	}

	/**
	 * Main method - Entry point for the banner display application
	 * 
	 * Intiliazes the character pattern maps and displays "OOPS" as an ASCII art banner
	 * to the console
	 * 
	 * @param args command line arguments (not used)
	 */
    public static void main(String[]args){
		HashMap<Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, charMap);
	}
}
