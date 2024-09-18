package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 990 && tab[1] == 932 && tab[2] == 919 && tab[3] == 839 && tab[4] == 702 && tab[5] == 611 && tab[6] == 610 && tab[7] == 542 && tab[8] == 472 && tab[9] == 445 && tab[10] == 424 && tab[11] == 355 && tab[12] == 349 && tab[13] == 278 && tab[14] == 205 && tab[15] == 80 && tab[16] == 51 && tab[17] == 932);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15] && tab[15] <= tab[16] && tab[16] <= tab[17]);*/
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
