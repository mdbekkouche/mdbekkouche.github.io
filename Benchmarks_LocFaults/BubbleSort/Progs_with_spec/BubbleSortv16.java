package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 971 && tab[1] == 952 && tab[2] == 843 && tab[3] == 840 && tab[4] == 831 && tab[5] == 829 && tab[6] == 777 && tab[7] == 501 && tab[8] == 485 && tab[9] == 407 && tab[10] == 391 && tab[11] == 384 && tab[12] == 338 && tab[13] == 329 && tab[14] == 236 && tab[15] == 227 && tab[16] == 165 && tab[17] == 162 && tab[18] == 952);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11] && tab[11] <= tab[12] && tab[12] <= tab[13] && tab[13] <= tab[14] && tab[14] <= tab[15] && tab[15] <= tab[16] && tab[16] <= tab[17] && tab[17] <= tab[18]);*/
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
