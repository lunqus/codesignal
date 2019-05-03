package longestStringInArray;

public class LongestStrings {


    String[] allLongestStrings(String[] inputArray) {

        int k = 0;
        int longest = 0;
        int arrLength = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (longest < inputArray[i].length())
                longest = inputArray[i].length();
        }

        for (int i = 0; i < inputArray.length; i++) {
            if(inputArray[i].length() == longest) {
                arrLength++;
            }
        }

        System.out.println(arrLength);
        String[] arrLongest = new String[arrLength];

        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j].length() == longest) {
                arrLongest[k] = inputArray[j];
                k++;
            }
        }

        return arrLongest;
    }
}
