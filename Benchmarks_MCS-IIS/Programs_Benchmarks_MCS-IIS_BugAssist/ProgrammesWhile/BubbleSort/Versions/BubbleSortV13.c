 


    void BubbleSort() {
	int i = 0;int tab[17];__CPROVER_assume(tab[0] == -28087 && tab[1] == -28088 && tab[2] == -28088 && tab[3] == -28088 && tab[4] == -28088 && tab[5] == -28088 && tab[6] == -28088 && tab[7] == -28088 && tab[8] == -28088 && tab[9] == -28088 && tab[10] == -31801 && tab[11] == -31802 && tab[12] == -31803 && tab[13] == -31804 && tab[14] == -32177 && tab[15] == -32178 && tab[16] == -30940);
	int j = 17 - 1; /*error : the instruction should be j = length */
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
	assert(tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6] && tab[6] >= tab[7] && tab[7] >= tab[8] && tab[8] >= tab[9] && tab[9] >= tab[10] && tab[10] >= tab[11] && tab[11] >= tab[12] && tab[12] >= tab[13] && tab[13] >= tab[14] && tab[14] >= tab[15] && tab[15] >= tab[16]);
    }
