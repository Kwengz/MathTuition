public class ListOfTuitionCenter {
    // data
    private TuitionCenter centers[] = new TuitionCenter[2];
    private int currsz = 0;

    public void add(TuitionCenter tc) {
        if (currsz == centers.length) {
            return;
        }
        else {
            centers[currsz++] = tc;
        }

    }
}
