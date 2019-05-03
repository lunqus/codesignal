package sequence.almostIncreasingSequence;

public class signalSolution {

    public static void main(String[] args) {

    }

    boolean flag (int[] sequence) {

        boolean flag=true;
        int seq1=0;
        int seq2=0;

        for(int i=0;i<sequence.length-1;i++){
            if(sequence[i]>=sequence[i+1]) seq1++;
        }

        for(int k=0;k<sequence.length-2;k++){
            if(sequence[k]>=sequence[k+2]) seq2++;
        }

        if(seq1+seq2>2) flag=false;
        return flag;
    }


}
