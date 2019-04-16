package adjacentElementsProduct;

public class TestAdjacentElementsProduct {

    public static void main(String[] args) {

        int res;
        int[] inputArray = {1,3,5,7,9,-3,5,2,6};

        TestAdjacentElementsProduct aep = new TestAdjacentElementsProduct();
        res = aep.adjacentElementProduct(inputArray);

        System.out.println(res);
    }

    int adjacentElementProduct(int[] inputArray) {
        int max = inputArray[0] * inputArray[1];

        for (int i = 2; i < inputArray.length; i++) {
            if (max < inputArray[i-1] * inputArray[i]) {
                max = inputArray[i-1] * inputArray[i];
            }
        }
        return max;
    }
}
