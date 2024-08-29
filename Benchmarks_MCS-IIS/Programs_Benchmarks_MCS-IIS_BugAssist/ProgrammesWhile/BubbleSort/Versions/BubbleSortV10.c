 


    void BubbleSort() {
	int i = 0;int tab[14];__CPROVER_assume(tab[0] == -18613 && tab[1] == -23822 && tab[2] == -23822 && tab[3] == -23822 && tab[4] == -23822 && tab[5] == -23822 && tab[6] == -23822 && tab[7] == -23822 && tab[8] == -23822 && tab[9] == -23822 && tab[10] == -32533 && tab[11] == -32534 && tab[12] == -32535 && tab[13] == -32534);
	int j = 14 - 1; /*error : the instruction should be j = length */
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
	assert(tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6] && tab[6] >= tab[7] && tab[7] >= tab[8] && tab[8] >= tab[9] && tab[9] >= tab[10] && tab[10] >= tab[11] && tab[11] >= tab[12] && tab[12] >= tab[13]);
    }
