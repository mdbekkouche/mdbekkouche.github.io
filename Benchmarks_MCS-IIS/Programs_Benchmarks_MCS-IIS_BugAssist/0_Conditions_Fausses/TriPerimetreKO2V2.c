/* program for triangle perimeter 
 * returns i+j+k
 *      i+j+k if (i,j,k) are the sides of any triangle
 *      2*i + j or 2*i+k or 2*j+i if (i,j,k) are the sides of an isosceles triangle
 *      3*i if (i,j,k) are the sides of an equilateral triangle
 * returns -1 if (i,j,k) are not the sides of a triangle
 * 
 * ERROR in affectation line 33 : for (1,2,1) while it should return -1
 */




	
        
	
	  
	  
	void TriPerimetreKO2V2 (int i, int j, int k) {__CPROVER_assume((i == 1) && (j == 2) && (k == 1));
		int trityp = 0;
		int res;
		if (i == 0 || j == 0 || k == 0) {
			trityp = 4;		
			res = -1;
		}
		else {
			trityp = 0;
			if (i == j) {
				trityp = trityp + 1;
			}
			if (i == k) {
				/* error in the assignment : trityp = trityp + 1 instead of trityp = trityp + 2 */
				trityp = trityp + 1;  
			}
			if (j == k) {
				trityp = trityp + 3;
			}
			if (trityp == 0) {
				if ((i+j) <= k || ((j+k) <= i || (i+k) <= j)) {
					trityp = 4;
					res = -1;
				}
				else {
					trityp = 1;
					res = i+j+k;
				}			
			}
			else {
				if (trityp > 3) {
					res = 3*i;
				}
				else {
					if (trityp == 1 && (i+j) > k) { // i == j
						res=2*i+k;
					}
					else {
						if (trityp == 2 && (i+k) > j) {  // i==k
							res = 2*i + j;						
						}
						else {
							if (trityp == 3 && (j+k) > i) {  // j == k
								res=2*j+i;
							}
							else {
								res=-1;
							}
						}
					}
				}
			}
		}
		assert(res == -1);
	}