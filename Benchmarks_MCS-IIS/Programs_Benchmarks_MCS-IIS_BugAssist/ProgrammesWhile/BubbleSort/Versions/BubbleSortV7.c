 


    void BubbleSort() {
	int i = 0;int tab[11];__CPROVER_assume(tab[0] == -17722 && tab[1] == -18518 && tab[2] == -18518 && tab[3] == -18518 && tab[4] == -18518 && tab[5] == -18518 && tab[6] == -18518 && tab[7] == -18518 && tab[8] == -18518 && tab[9] == -18518 && tab[10] == -31794);
	int j = 11 - 1; /*error : the instruction should be j = length */
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
	assert(tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6] && tab[6] >= tab[7] && tab[7] >= tab[8] && tab[8] >= tab[9] && tab[9] >= tab[10]);
    }
