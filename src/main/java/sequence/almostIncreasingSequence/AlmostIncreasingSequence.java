package sequence.almostIncreasingSequence;

public class AlmostIncreasingSequence {

    boolean chechIfassscending(int[] intArray) {

        boolean answer = false;
        int calc = 0;
        int same = 0;

        for(int i = 1; i < intArray.length; i++) {
            if(intArray[i] < intArray[i-1]) {
                calc++;
            }
        }
        for(int i = 2; i < intArray.length; i++) {
            if(intArray[i] <= intArray[i-1] ||  intArray[i] == intArray[i-2]) {
                same++;
            }
        }
        if (calc <= 1) {answer = true;}
        if (same > 0 ) {answer = false;}
        return answer;
    }
}
