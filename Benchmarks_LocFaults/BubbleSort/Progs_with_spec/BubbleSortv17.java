package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 958 && tab[1] == 946 && tab[2] == 932 && tab[3] == 914 && tab[4] == 851 && tab[5] == 804 && tab[6] == 765 && tab[7] == 743 && tab[8] == 731 && tab[9] == 720 && tab[10] == 662 && tab[11] == 621 && tab[12] == 484 && tab[13] == 451 && tab[14] == 387 && tab[15] == 341 && tab[16] == 281 && tab[17] == 108 && tab[18] == 77 && tab[19] == 946);
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
