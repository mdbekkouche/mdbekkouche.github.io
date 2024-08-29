

  int SquareRoot()
  {
       int val = 80;
       int i = 1;
       int v = 0;
       int res = 0;
       while (v < val){
            v = v + 2*i + 1;
            i = i + 1; 
       }
       res = i; /*error: the instruction should be res = i - 1 */
       assert( (res*res <= val) && (res+1)*(res+1) > val );
       return res;
   }
