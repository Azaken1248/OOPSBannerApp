# OOPSBannerApp
An application to display the ASCII art based on the text that has been entered.

## [Use Case 1](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC1-PrintOOPS)
To display the text "OOPS" in console as plaintext.  
  
#### key concept
```java
System.out.println("OOPS");
```

## [Use Case 2](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC2-PrintOOPS)
To display the text "OOPS" in ASCII art using string concatanation.  

#### key concept
```java
String a = "First";
String b = "Second";

System.out.println(a + b);
```
## [Use Case 3](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC3-PrintOOPS)
To optimize the string concatanation using ```String.join()``` to prevent creation of temporary  
string objects.

#### key concept  
(1) The ```join()``` method syntax
```java
String.join(delimeter, ArrayList<String>);
```
(2) Usage in practice
```java
String a = "First";
String b = "Second";

System.out.println(String.join("", a, b);
```
## [Use Case 4](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC4-PrintOOPS)
To optimize the code further to store each row of the ASCII art in an array.

#### key concept
```java
String strArr[] = new String[size];
strArr[1] = String.join("", "one-a ", "one-b");
strArr[2] = String.join("", "two-a ", "two-b");

for(String row : strArr){
  System.out.println(row);
}
```
## [Use Case 5](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC5-PrintOOPS)
Refactor to use a different way of array initialization and population.

#### key concept
```java
String strArr[] = {
  String.join("", "one-a ", "one-b"),
  String.join("", "two-a ", "two-b")
};

for(String row : strArr){
  System.out.println(row);
}
```
## [Use Case 6](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC6-PrintOOPS)
Refactor to use methods for different letters of the ASCII art.

#### key concept
```java
public static String[] getA(){
  return new String[]{
    "one - a",
    "two - a",
    "three - a",
  };
}

public static String[] getB(){
  return new String[]{
    "one - b",
    "two - b",
    "three - b",
  };
}

int height = getA().length;

for(int i = 0; i < height; i++){
  System.out.println(String.join("", getA(), getB()));
}
```
## [Use Case 7](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC7-PrintOOPS)
Make a data structure to map characters to their respective patterns  
by using inner classes  

#### key concept
(1) Inner class syntax
```java
public class Outer{
  static class Inner{
    // code
  }
}
```

(2) Usage in practice
```java
public class OOPSBannerAPP{
  static class CharacterPatternMap{
    private Character character;
    private String[] pattern;

    public CharacterPatternMap(Character character, String[] pattern){
      this.character = character;
      this.pattern = pattern;
    }

    public Character getCharacter(){
      return this.character;
    }

    public String[] getPattern(){
      return this.pattern;
    }
  }
}
```

## [Use Case 8](https://github.com/Azaken1248/OOPSBannerApp/tree/feature/UC8-PrintOOPS)
Refactor to use a HashMap instead of custom class to store patterns in a more efficient  
manner.

#### key concept
(1) HashMap syntax
```java
HashMap<Charecter, String[]> = new HashMap<>();
```

(2) Usage in practice
```java
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
```

## Integration Pipeline
Each feature is developed on a seperate branch and after testing it is  
moved to [dev](https://github.com/Azaken1248/OOPSBannerApp/tree/dev)
after which it is finally released to [main](https://github.com/Azaken1248/OOPSBannerApp)
