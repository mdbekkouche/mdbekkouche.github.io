/* The minimum in an array of n integers
 */



	
        
	
	int MinimumKO () {
		int a[4];int min=a[0];__CPROVER_assume(a[0]==3 && a[1]==2 && a[2]==1 && a[3]==0);
		int i = 1;
		while (i<4-1) { /*error, the condition should be (i<a.length) | a.length == 4*/
                     if (a[i]<min){
                        min=a[i];
                     }
		     i = i+1;
		}
        	assert(min<=a[0] && min<=a[1] && min<=a[2] && min<=a[3]);
        }
