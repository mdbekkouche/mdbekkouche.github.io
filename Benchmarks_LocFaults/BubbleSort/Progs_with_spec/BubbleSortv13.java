package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 971 && tab[1] == 873 && tab[2] == 825 && tab[3] == 799 && tab[4] == 687 && tab[5] == 660 && tab[6] == 581 && tab[7] == 510 && tab[8] == 491 && tab[9] == 474 && tab[10] == 384 && tab[11] == 313 && tab[12] == 235 && tab[13] == 194 && tab[14] == 64 && tab[15] == 873);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15]);*/
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
