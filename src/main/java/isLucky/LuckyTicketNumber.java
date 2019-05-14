package isLucky;

public class LuckyTicketNumber {

    public static void main(String[] args) {

        LuckyTicketNumber ltn = new LuckyTicketNumber();

        boolean res = ltn.isLucky(123321);

        System.out.println(res);
    }

    boolean isLucky(int n) {

        int intNum = 0;
        int intSum = 0;
        int intCopy = n;
        int a = 0, b = 0;

        while(n != 0){
            intNum++;
            intSum +=n%10;
            n/=10;
        }

        if(intSum % 2 != 0) return false;

        for(int i = 0; i < intNum /2; i++){
            a += intCopy %10;
            intCopy /=10;
        }

        for(int i = 0; i < intNum /2; i++){
            b += intCopy %10;
            intCopy /=10;
        }

        return b == a? true: false;
    }
}
