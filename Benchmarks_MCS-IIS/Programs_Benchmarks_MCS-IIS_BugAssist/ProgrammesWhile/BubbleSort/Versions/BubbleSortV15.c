 


    void BubbleSort() {
	int i = 0;int tab[19];__CPROVER_assume(tab[0] == -25695 && tab[1] == -25696 && tab[2] == -25696 && tab[3] == -25696 && tab[4] == -25696 && tab[5] == -25696 && tab[6] == -25696 && tab[7] == -25696 && tab[8] == -25696 && tab[9] == -25696 && tab[10] == -25733 && tab[11] == -25734 && tab[12] == -28349 && tab[13] == -28350 && tab[14] == -28351 && tab[15] == -28352 && tab[16] == -28353 && tab[17] == -28354 && tab[18] == -30152);
	int j = 19 - 1; /*error : the instruction should be j = length */
	int aux = 0;
	int fini = 0;
	while (fini == 0) {
	    fini = 1;
	    i = 1;
	    while (i < j) {
 
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
	assert(tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6] && tab[6] >= tab[7] && tab[7] >= tab[8] && tab[8] >= tab[9] && tab[9] >= tab[10] && tab[10] >= tab[11] && tab[11] >= tab[12] && tab[12] >= tab[13] && tab[13] >= tab[14] && tab[14] >= tab[15] && tab[15] >= tab[16] && tab[16] >= tab[17] && tab[17] >= tab[18]);
    }
