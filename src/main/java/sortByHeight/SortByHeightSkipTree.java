package sortByHeight;

import java.util.*;

public class SortByHeightSkipTree {

    public static void main(String[] args) {

        SortByHeightSkipTree intSort = new SortByHeightSkipTree();

        int[] intArray = new int[]{-1, 150, 190, 170, -1, -1, 160, 180};

        int[] newArray = intSort.sortByHeight(intArray);

        for (int arr : newArray) {
            System.out.println(arr);
        }
    }


    int[] sortByHeight(int[] a) {

        List b = new Vector();
        for(int i : a) if(i > -1) b.add(i);
        Collections.sort(b);

        Iterator it = b.iterator();

        for (int i = 0; i < a.length; i++) {

            if(a[i] != -1) a[i] = (int) it.next();

        }

        return a;

    }
}
