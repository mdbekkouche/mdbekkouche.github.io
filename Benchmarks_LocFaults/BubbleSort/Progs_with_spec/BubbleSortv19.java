package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 969 && tab[1] == 924 && tab[2] == 795 && tab[3] == 776 && tab[4] == 695 && tab[5] == 689 && tab[6] == 683 && tab[7] == 677 && tab[8] == 572 && tab[9] == 571 && tab[10] == 410 && tab[11] == 371 && tab[12] == 343 && tab[13] == 299 && tab[14] == 234 && tab[15] == 225 && tab[16] == 206 && tab[17] == 182 && tab[18] == 178 && tab[19] == 118 && tab[20] == 95 && tab[21] == 924);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15] && tab[15] <= tab[16] && tab[16] <= tab[17] && tab[17] <= tab[18] && tab[18] <= tab[19] && tab[19] <= tab[20] && tab[20] <= tab[21]);*/
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
