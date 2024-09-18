package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 970 && tab[1] == 821 && tab[2] == 803 && tab[3] == 789 && tab[4] == 688 && tab[5] == 571 && tab[6] == 512 && tab[7] == 488 && tab[8] == 481 && tab[9] == 360 && tab[10] == 346 && tab[11] == 278 && tab[12] == 254 && tab[13] == 221 && tab[14] == 167 && tab[15] == 137 && tab[16] == 98 && tab[17] == 86 && tab[18] == 45 && tab[19] == 821);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15] && tab[15] <= tab[16] && tab[16] <= tab[17] && tab[17] <= tab[18] && tab[18] <= tab[19]);*/
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
