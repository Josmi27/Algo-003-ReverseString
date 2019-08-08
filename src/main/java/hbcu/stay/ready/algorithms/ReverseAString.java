package hbcu.stay.ready.algorithms;

public class ReverseAString {
    /// ALGORITHM

    // 1. Use StringBuilder to reverse the given String

    // 2. Make all letters lowercase

    // 3. Split up the given String (now reversed) into a
    //  String array, where each element is a reversed word in the
    //  modified string

    // 4. Iterate through each word, capitalizing the first letter
    //  a. To capitalize each letter, I made a helper function for
    //  cleaner code.
    //  b. Within the helper function, I broke down the string into
    //  each individual letter, so that I can capitalize the first
    //  letter
    //  c. Lastly, I had to concatenate all the letters back into
    //  a word, and return the newly modified word.
    //  d. (A space had to be added to account for the next word being
    //  appended to the expected string

    public String reverseAString(String input){
        StringBuilder sb = new StringBuilder(input);
        String reversedInput = sb.reverse().toString().toLowerCase();
        String[] stringedInput = reversedInput.split(" ");

        String expected = "";

        for (int i = 0; i < stringedInput.length; i++) {
            String currentWord = stringedInput[i];
            String modifiedWord = capitalizeFirstLetter(currentWord);

            expected += modifiedWord;
        }
        return expected.trim();
    }

    public String capitalizeFirstLetter(String currentWord) {
        String modifiedWord = "";
        String[] brokenDownCurrentWord = currentWord.split("");
        brokenDownCurrentWord[0] = brokenDownCurrentWord[0].toUpperCase();

        for(String character : brokenDownCurrentWord) {
            modifiedWord += character;
        }
        return modifiedWord + " ";
    }
}

