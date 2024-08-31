package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 981 && tab[1] == 958 && tab[2] == 880 && tab[3] == 874 && tab[4] == 827 && tab[5] == 821 && tab[6] == 809 && tab[7] == 785 && tab[8] == 735 && tab[9] == 694 && tab[10] == 659 && tab[11] == 633 && tab[12] == 556 && tab[13] == 434 && tab[14] == 429 && tab[15] == 412 && tab[16] == 404 && tab[17] == 346 && tab[18] == 307 && tab[19] == 291 && tab[20] == 224 && tab[21] == 147 && tab[22] == 958);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15] && tab[15] <= tab[16] && tab[16] <= tab[17] && tab[17] <= tab[18] && tab[18] <= tab[19] && tab[19] <= tab[20] && tab[20] <= tab[21] && tab[21] <= tab[22]);*/
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
