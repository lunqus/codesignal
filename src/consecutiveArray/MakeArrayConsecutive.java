package consecutiveArray;

public class MakeArrayConsecutive {

    public static void main(String[] args) {

        MakeArrayConsecutive mac = new MakeArrayConsecutive();
        int[] newArray = {8,1,11,6,0};

        int[] filtered = mac.fileterdArray(newArray);

        for(int i = 0; i < filtered.length; i++ ){
            System.out.println(filtered[i]);
        }

        int intNumber = mac.consecutiveArray(filtered);

        System.out.println("Needed: " + intNumber);
    }

    int[] fileterdArray(int[] intArray) {

        int temp;
        for(int i = 1; i < intArray.length; i++) {
            for(int j = i; j > 0; j--) {
                temp = intArray[j];
                if(intArray[j] < intArray[j-1]) {
                    intArray[j] = intArray[j-1];
                    intArray[j-1] = temp;
                }
            }
        }
        return intArray;
    }

    int consecutiveArray(int[] sortedArray) {

        int num = 0;
        int number;
        for(int i = 1; i < sortedArray.length; i++) {
            number = sortedArray[i] - sortedArray[i-1] - 1;
            num = num + number;
        }
        return num;
    }
}
