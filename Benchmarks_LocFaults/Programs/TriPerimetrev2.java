package benchmark;

public class TriPerimetrev2 {
	
	
	
	
	
	
	
	
	
	public int triperimetre (int i, int j, int k) {
		int trityp = 0;
		int res = 0;
		if (i == 0 || j == 0 || k == 0) {
			trityp = 4;	
			res = -1;
		}
		else {
			trityp = 0;
			if (i == j) {
				trityp = trityp + 1;
				res = 2*i;
			}
			if (i == k) {
				trityp = trityp + 2;
				res = 2*j;  // error in the assignment : should be res = 2*i
			}
			if (j == k) {
				trityp = trityp + 3;
				res = 2*j;
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
					res = res + i;
				}
				else {
					if (trityp == 1 && (i+j) > k) { // i==j
						res=res+k; 
					}
					else {						
						if (trityp == 2 && (i+k) > j) {    // i==k
							res = res + j;						
						}
						else {
							if (trityp == 3 && (j+k) > i) {   // j==k
								res=res+i;
							}
							else {
								res=-1;
							}
						}
					}
				}
			}
		}
		return res;
	}
}
