package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 786 && tab[1] == 753 && tab[2] == 728 && tab[3] == 725 && tab[4] == 706 && tab[5] == 698 && tab[6] == 682 && tab[7] == 680 && tab[8] == 462 && tab[9] == 450 && tab[10] == 440 && tab[11] == 429 && tab[12] == 209 && tab[13] == 38 && tab[14] == 19 && tab[15] == 11 && tab[16] == 753);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15] && tab[15] <= tab[16]);*/
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
