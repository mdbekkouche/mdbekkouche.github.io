

     
       
       
      
    
  
    int BSearchKO(int x) {
	int result = -1;int tab[10];int res; __CPROVER_assume((x == -2147457480) && (tab[0]==-2147477728) && (tab[1]==-2147470009) && (tab[2]==-2147468773) && (tab[3]==-2147466336) && (tab[4]==-2147457481) && (tab[5]==-2147457481) && (tab[6]==-2147457481) && (tab[7]==-2147457481) && (tab[8]==2147457481) && (tab[9]==-2147457480));
	int milieu = 0;int length = 10;
	int gauche = 0;
	int droite = length - 1;
	while ((result == -1) && (gauche <= droite)) {
	    milieu = (gauche + droite) / 2;
	    if (tab[milieu] == x) {
		result = milieu;
	    }
	    else if (tab[milieu] <= x) {
		droite = milieu - 1; // wrong cute and paste : error in the assignment : should be "gauche = milieu + 1"
	    }
	    else {
		droite = milieu - 1; 
	    }
	}
	res=result; 
        assert(res == 9);
    }
