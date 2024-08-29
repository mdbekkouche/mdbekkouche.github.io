class BubbleSort { 
 /*@ requires (tab[0] == -25401 && tab[1] == -25402 && tab[2] == -25402 && tab[3] == -25402 && tab[4] == -25402 && tab[5] == -25402 && tab[6] == -25402 && tab[7] == -25402 && tab[8] == -25402 && tab[9] == -25402 && tab[10] == -25433 && tab[11] == -25434 && tab[12] == -25435 && tab[13] == -25436 && tab[14] == -25437 && tab[15] == -25438 && tab[16] == -25439 && tab[17] == -25440 && tab[18] == -25441 && tab[19] == -25442 && tab[20] == -25443 && tab[21] == -25444 && tab[22] == -32186);
   @ ensures (tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6] && tab[6] >= tab[7] && tab[7] >= tab[8] && tab[8] >= tab[9] && tab[9] >= tab[10] && tab[10] >= tab[11] && tab[11] >= tab[12] && tab[12] >= tab[13] && tab[13] >= tab[14] && tab[14] >= tab[15] && tab[15] >= tab[16] && tab[16] >= tab[17] && tab[17] >= tab[18] && tab[18] >= tab[19] && tab[19] >= tab[20] && tab[20] >= tab[21] && tab[21] >= tab[22]);*/
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
