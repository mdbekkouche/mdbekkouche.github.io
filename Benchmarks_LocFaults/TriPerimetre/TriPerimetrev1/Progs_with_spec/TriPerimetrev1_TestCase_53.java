package benchmark;

public class TriPerimetrev1 {
    
    /*@ requires
    @ ((i == 7) && (j == 5) && (k == 7));
    @ ensures
    @ (((i+j) <= k || (j+k) <= i || (i+k) <= j) ==> (\result == -1))
    @ && ((!((i+j) <= k || (j+k) <= i || (i+k) <= j) && (i==j && j==k)) ==> (\result == i+j+k))
    @ && ((!((i+j) <= k || (j+k) <= i || (i+k) <= j) && !(i==j && j==k) && (i==j || j==k || i==k)) ==> (\result == i+j+k))
    @ && ((!((i+j) <= k || (j+k) <= i || (i+k) <= j) && !(i==j && j==k) && !(i==j || j==k || i==k)) ==> (\result == i+j+k));
    @*/
    public int triperimetre (int i, int j, int k) {
        int trityp = 0;
        int res;
        if (i == 0 || j == 0 || k == 0) {
            trityp = 4;
            res = -1;
        }
        else {
            trityp = 0;
            if (i == j) {
                trityp = trityp + 1;
            }
            if (i == k) {
                trityp = trityp + 2;
            }
            if (j == k) {
                trityp = trityp + 3;
            }
            if (trityp == 0) {
                if ((i+j) <= k || ((j+k) <= i || (i+k) <= j)) {
                    trityp = 4;
                    res = -1;
                }
                else {
                    trityp = 1;
                    res = i+j+k;
                }
            }
            else {
                if (trityp > 3) {
                    res = 3*i;
                }
                else {
                    if (trityp == 1 && (i+j) > k) { // i==j
                        res=2*i+k;
                    }
                    else {
                        // error in the assignment : should be res = 2*i+j
                        if (trityp == 2 && (i+k) > j) {    // i==k
                            res = 2*i + k;
                        }
                        else {
                            if (trityp == 3 && (j+k) > i) {   // j==k
                                res=2*j+i;
                            }
                            else {
                                res=-1;
                            }
                        }
                    }
                }
            }
        }
        return res;
    }
}
