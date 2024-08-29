/* program for triangle perimeter 
 * returns i*j*k
 *      i*j*k if (i,j,k) are the sides of any triangle
 *      i*i * j or 2*i+k or 2*j+i if (i,j,k) are the sides of an isosceles triangle
 *      i*i*i if (i,j,k) are the sides of an equilateral triangle
 * returns -1 if (i,j,k) are not the sides of a triangle
 * 
 * ERROR in condition line 33 and assignment line 34 : for (2,2,3) the program should return 12
 */

class TriMultPerimetreKO6{

	/*@ requires 
          @ ((i ==2) && (j == 2) && (k ==3));
	  @ ensures
	  @ (res == 12);
	  @*/
	static int caller (int i, int j, int k) {
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
				trityp = trityp + 2;  
			}
			if (j != k) {  // error in the condition : j == k instead of j != k
				trityp = trityp + 4; // error in the assignment trityp = trityp + 3 instead of trityp = trityp + 4
			}
			if (trityp == 0) {
				if ((i+j) <= k || ((j+k) <= i || (i+k) <= j)) {
					trityp = 4;
					res = -1;
				}
				else {
					trityp = 1;
					res = i*j*k;
				}			
			}
			else {
				if (trityp > 3) {
					res = i*i*i;
				}
				else {
					if (trityp == 1 && (i+j) > k) { // i==j
						res=i*i*k; 
					}
					else {
						if (trityp == 2 && (i+k) > j) {  // i==k
							res = i*i*j;						
						}
						else {
							if (trityp == 3 && (j+k) > i) {   // j==k
								res=j*j*i;
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
