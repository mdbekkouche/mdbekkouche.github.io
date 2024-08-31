package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 889 && tab[1] == 874 && tab[2] == 826 && tab[3] == 802 && tab[4] == 766 && tab[5] == 715 && tab[6] == 644 && tab[7] == 598 && tab[8] == 585 && tab[9] == 505 && tab[10] == 500 && tab[11] == 481 && tab[12] == 445 && tab[13] == 428 && tab[14] == 419 && tab[15] == 373 && tab[16] == 372 && tab[17] == 352 && tab[18] == 349 && tab[19] == 337 && tab[20] == 874);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15] && tab[15] <= tab[16] && tab[16] <= tab[17] && tab[17] <= tab[18] && tab[18] <= tab[19] && tab[19] <= tab[20]);*/
    void bubbleSort (int[] tab) {
        int i = 0;
        int j = tab.length - 1; /*error : the instruction should be j = tab.length */
        int aux = 0;
        int fini = 0;
        while (fini == 0) {
            fini = 1;
            i = 1;
            while (i < j) {
                /*@ assert (i > 0 && i < tab.length); */
                if (tab[i-1] > tab[i]) {
                    aux = tab[i-1];
                    tab[i-1] = tab[i];
                    tab[i] = aux;
                    fini = 0;
                }
                i = i + 1;
            }
            j = j - 1;
        }
        return;
    }
}
