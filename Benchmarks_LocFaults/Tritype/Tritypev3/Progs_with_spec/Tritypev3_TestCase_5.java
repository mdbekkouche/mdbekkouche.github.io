package benchmark;

public class Tritypev3 {
    
    /*@ requires
    @ ((i == 5) && (j == 5) && (k == 9));
    @ ensures
    @ (((i+j) <= k || (j+k) <= i || (i+k) <= j) ==> (\result == 4))
    @ && ((!((i+j) <= k || (j+k) <= i || (i+k) <= j) && (i==j && j==k)) ==> (\result == 3))
    @ && ((!((i+j) <= k || (j+k) <= i || (i+k) <= j) && !(i==j && j==k) && (i==j || j==k || i==k)) ==> (\result == 2))
    @ && ((!((i+j) <= k || (j+k) <= i || (i+k) <= j) && !(i==j && j==k) && !(i==j || j==k || i==k)) ==> (\result == 1));
    @*/
    public int tritype (int i, int j, int k) {
        int trityp;
        if (i == 0 || j == 0 || k == 0) {
            trityp = 4;
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
                if ((i+j) <= k || (j+k) <= i || (i+k) <= j) {
                    trityp = 4;
                }
                else {
                    trityp = 1;
                }
            }
            else {
                if (trityp > 3) {
                    trityp = 3;
                }
                else {
                    // error in the condition : trityp == 2 instead of trityp == 1
                    if (trityp == 2 && (i+j) > k) {
                        trityp = 2;
                    }
                    else {
                        if (trityp == 2 && (i+k) > j) {
                            trityp = 2;
                        }
                        else {
                            if (trityp == 3 && (j+k) > i) {
                                trityp = 2;
                            }
                            else {
                                trityp = 4;
                            }
                        }
                    }
                }
            }
        }
        return trityp;
    }
}
