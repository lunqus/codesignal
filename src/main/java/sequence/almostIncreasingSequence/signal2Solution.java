package sequence.almostIncreasingSequence;

public class signal2Solution {

    public static void main(String[] args) {

    }

    boolean almostIncreasingSequence(int[] sequence) {
        if (sequence.length <= 2) {
            // Incongruous with common sense but I guess
            // math sense says that any sequence with less than
            // two elements is strictly increasing (shrug).
            // So this is why Test 10 [1, 1] expects true.
            return true;
        }

        // Could have inlined everything but who wants to read
        // all that crap. This code reveals intent and explains
        // the logic. Refactored to the max.

        int tweaks = 0;
        for (int i = 0; i < sequence.length - 1; i++) {
            if (isValidAt(i, sequence)) continue;

            if (isValidWithoutCurrent(i, sequence) || isValidWithoutNext(i, sequence)) {
                tweaks++;
            } else {
                tweaks = TOO_MANY;
            }

            if (tweaks == TOO_MANY) break;
        }
        return tweaks != TOO_MANY;
    }

    static final int TOO_MANY = 2;

    boolean isValidAt(int i, int[] sequence) {
        return sequence[i] < sequence[i + 1];
    }

    boolean isValidWithoutCurrent(int i, int[] sequence) {
        return isFirstElement(i) ||
                isPreviousAndNextSequential(i, sequence);
    }

    boolean isValidWithoutNext(int i, int[] sequence) {
        return isNextToLastElement(i, sequence) ||
                isThisAndOneAfterNextSequential(i, sequence);
    }

    boolean isFirstElement(int i) {
        return i == 0;
    }

    boolean isNextToLastElement(int i, int[] sequence) {
        return i == sequence.length - 2;
    }

    boolean isPreviousAndNextSequential(int i, int[] sequence) {
        return sequence[i - 1] < sequence[i + 1];
    }

    boolean isThisAndOneAfterNextSequential(int i, int[] sequence) {
        return sequence[i] < sequence[i + 2];
    }


}
