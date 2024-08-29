class BubbleSort { 
 /*@ requires (tab[0] == -24802 && tab[1] == -24803 && tab[2] == -24803 && tab[3] == -24803 && tab[4] == -24803 && tab[5] == -24803 && tab[6] == -24803 && tab[7] == -24803 && tab[8] == -24803 && tab[9] == -24803 && tab[10] == -24839 && tab[11] == -24840 && tab[12] == -24841 && tab[13] == -24842 && tab[14] == -24843 && tab[15] == -24844 && tab[16] == -24845 && tab[17] == -31533);
   @ ensures (tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6] && tab[6] >= tab[7] && tab[7] >= tab[8] && tab[8] >= tab[9] && tab[9] >= tab[10] && tab[10] >= tab[11] && tab[11] >= tab[12] && tab[12] >= tab[13] && tab[13] >= tab[14] && tab[14] >= tab[15] && tab[15] >= tab[16] && tab[16] >= tab[17]);*/
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
