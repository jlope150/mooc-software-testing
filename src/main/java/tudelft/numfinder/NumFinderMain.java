package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        nf.find(new int[] {4, -400, 7, 9});

        // this crashes
       nf.find(new int[] {-200, 23, 0, 246});

        System.out.println(nf.getSmallest());
        System.out.println(nf.getLargest());

    }
}
