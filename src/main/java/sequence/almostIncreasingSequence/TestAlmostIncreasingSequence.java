package sequence.almostIncreasingSequence;

public class TestAlmostIncreasingSequence {

    public static void main(String[] args) {

        AlmostIncreasingSequence ais = new AlmostIncreasingSequence();
        int[] testOne = {1, 2, 3, 4, 5, 3, 5, 6};
        boolean res1 = ais.chechIfassscending(testOne);

        System.out.println("Expected output: false");
        System.out.println("Generated output: " + res1);
        System.out.println("_______________________");

    }

}
