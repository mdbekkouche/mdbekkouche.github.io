 


    void BubbleSort() {
	int i = 0;int tab[7];__CPROVER_assume(tab[0] == -25048 && tab[1] == -25049 && tab[2] == -25049 && tab[3] == -25049 && tab[4] == -25049 && tab[5] == -25049 && tab[6] == -26912);
	int j = 7 - 1; /*error : the instruction should be j = length */
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
	assert(tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6]);
    }
