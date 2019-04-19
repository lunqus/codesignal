package polygon;

public class TestPolygon {

    public static void main(String[] args) {

        TestPolygon cp = new TestPolygon();

        int input = 5;
        int sum = cp.shapeArea(input);
        System.out.println("Asterix Total: " + sum);

        int n = input;
        char c = '*';
        int i=1;
        int j;

        while(i<=n) {

            j=1;
            while(j++<=n-i) {
                System.out.print(" ");
            }

            j=1;
            while(j++<=i*2-1) {
                System.out.print(c);
            }

            System.out.println();
            i++;
        }

        i=n-1;
        while(i>0) {
            j=1;
            while(j++<=n-i) {
                System.out.print(" ");
            }

            j=1;
            while(j++<=i*2-1) {
                System.out.print(c);
            }
            System.out.println();
            i--;
        }
    }

    int shapeArea(int n) {
        int sum = 0;

        sum = n * n + (n-1) * (n - 1);

        return sum;
    }

}
