package cursor.hm7;

import java.util.HashMap;
public class OperationsWithString {
    private final HashMap<Character, Integer> myString;
    private String initialString = "";
   OperationsWithString(){
       myString = new HashMap<>();
   }
   OperationsWithString(String stringToCheck) {
       this();
       initialString = stringToCheck.toLowerCase();
       setStringToCheck(initialString);
   }
   public void setStringToCheck(String stringToCheck){
       char [] strToCheckArray = stringToCheck.toCharArray();
       for (Character c : strToCheckArray) {
           myString.put(c, 0);
       }
   }
   public void checkString(){
       for (Character c : initialString.toCharArray()) {
           if (myString.containsKey(c))
               myString.put(c, myString.get(c) + 1);
       }
   }
   public int characterCount(Character toCount){
       int charactersInStr = 0;
       for (Character c : myString.keySet()){
           if (c.equals(toCount))
               charactersInStr ++;
       }
       return charactersInStr;
   }
    public int letterCount(){
        int lettersInStr = 0;
        for (Character c : myString.keySet()){
            if (Character.isAlphabetic(c))
                lettersInStr += myString.get(c);
        }
        return lettersInStr;
    }
    public int countSpace() {
        return myString.get(' ');
    }

    public int countDigits() {
       int digitsInStr = 0;
       for (Character c : myString.keySet()) {
           if (Character.isDigit(c))
               digitsInStr += myString.get(c);
       }
       return digitsInStr;
   }
   public int countSymbols() {
       int symbolsInStr = 0;
       for (Character c : myString.keySet()) {
           if (c.equals('.') | c.equals(',') | c.equals('!') | c.equals('?') | c.equals('-') | c.equals(':'))
               symbolsInStr += myString.get(c);
       }
       return symbolsInStr;
   }
   public HashMap<Character, Integer> getMyString(){
       return myString;
   }


    @Override
    public String toString() {
        return "My String is: " + initialString;
    }
}
