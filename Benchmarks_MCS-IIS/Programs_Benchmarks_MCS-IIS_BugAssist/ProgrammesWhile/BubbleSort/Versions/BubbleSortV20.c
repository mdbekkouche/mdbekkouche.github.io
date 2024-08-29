 


    void BubbleSort() {
	int i = 0;int tab[24];__CPROVER_assume(tab[0] == -32729 && tab[1] == -32732 && tab[2] == -32732 && tab[3] == -32732 && tab[4] == -32732 && tab[5] == -32732 && tab[6] == -32732 && tab[7] == -32732 && tab[8] == -32732 && tab[9] == -32732 && tab[10] == -32756 && tab[11] == -32757 && tab[12] == -32758 && tab[13] == -32759 && tab[14] == -32760 && tab[15] == -32761 && tab[16] == -32762 && tab[17] == -32763 && tab[18] == -32764 && tab[19] == -32765 && tab[20] == -32766 && tab[21] == -32767 && tab[22] == -32768 && tab[23] == -32730);
	int j = 24 - 1; /*error : the instruction should be j = length */
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
	assert(tab[0] >= tab[1] && tab[1] >= tab[2] && tab[2] >= tab[3] && tab[3] >= tab[4] && tab[4] >= tab[5] && tab[5] >= tab[6] && tab[6] >= tab[7] && tab[7] >= tab[8] && tab[8] >= tab[9] && tab[9] >= tab[10] && tab[10] >= tab[11] && tab[11] >= tab[12] && tab[12] >= tab[13] && tab[13] >= tab[14] && tab[14] >= tab[15] && tab[15] >= tab[16] && tab[16] >= tab[17] && tab[17] >= tab[18] && tab[18] >= tab[19] && tab[19] >= tab[20] && tab[20] >= tab[21] && tab[21] >= tab[22] && tab[22] >= tab[23]);
    }
