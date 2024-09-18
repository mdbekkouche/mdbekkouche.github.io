package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 960 && tab[1] == 920 && tab[2] == 892 && tab[3] == 809 && tab[4] == 766 && tab[5] == 652 && tab[6] == 648 && tab[7] == 529 && tab[8] == 478 && tab[9] == 446 && tab[10] == 400 && tab[11] == 396 && tab[12] == 352 && tab[13] == 331 && tab[14] == 324 && tab[15] == 291 && tab[16] == 272 && tab[17] == 261 && tab[18] == 234 && tab[19] == 170 && tab[20] == 77 && tab[21] == 920);
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
