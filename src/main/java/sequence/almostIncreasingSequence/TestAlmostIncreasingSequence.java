package sequence.almostIncreasingSequence;

public class TestAlmostIncreasingSequence {

    public static void main(String[] args) {

        AlmostIncreasingSequence ais = new AlmostIncreasingSequence();
        int[] testOne = {1, 3, 2, 1};
        boolean res1 = ais.chechIfassscending(testOne);

        System.out.println("Array: {1, 3, 2, 1}");
        System.out.println("Expected output: false");
        System.out.println("Generated output: " + res1);
        System.out.println("_______________________");

    }

}
