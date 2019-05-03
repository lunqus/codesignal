package sequence.almostIncreasingSequence;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;
import java.util.List;

public class AlmostIncreasingSequence {

    boolean chechIfassscending(int[] intArray) {

        boolean answer = false;
        int calc = 0;
        int same = 0;
        int twoArr = 0;

        for(int i = 1; i < intArray.length; i++) {
            if(intArray[i] < intArray[i-1]) {
                calc++;
            }

        }

        for(int j = 1; j < intArray.length; j++) {
            if(intArray[j] == intArray[j-1]) {
                same++;
            }
        }

        for(int k = intArray.length-1; k > 2; k--) {
            if(intArray[k] < intArray[k-1] && intArray[k] < intArray[k-2]) {
                twoArr++;
            }
        }

        if (calc <= 1) {answer = true;}
        if (same > 0 ) {answer = false;}
        if (twoArr > 0) {answer = false;}
        if (intArray.length < 3) {answer = true;}

        // TODO : two sequence goes to false

        return answer;
    }
}
