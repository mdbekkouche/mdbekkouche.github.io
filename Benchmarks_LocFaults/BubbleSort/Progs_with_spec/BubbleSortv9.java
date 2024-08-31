package benchmark;

public class BubbleSort {
    
    /*@ requires (tab[0] == 969 && tab[1] == 921 && tab[2] == 785 && tab[3] == 669 && tab[4] == 514 && tab[5] == 424 && tab[6] == 414 && tab[7] == 294 && tab[8] == 215 && tab[9] == 107 && tab[10] == 104 && tab[11] == 921);
    @ ensures (tab[0] <= tab[1] && tab[1] <= tab[2] && tab[2] <= tab[3] && tab[3] <= tab[4] && tab[4] <= tab[5] && tab[5] <= tab[6] && tab[6] <= tab[7] && tab[7] <= tab[8] && tab[8] <= tab[9] && tab[9] <= tab[10] && tab[10] <= tab[11]);*/
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
