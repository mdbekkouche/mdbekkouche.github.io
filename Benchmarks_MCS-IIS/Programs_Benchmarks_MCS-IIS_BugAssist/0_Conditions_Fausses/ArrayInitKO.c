

 
   
   
   
   
void ArrayInitKO(){
  int i;int a[10];
  i=0;
  while(i<10){
    a[i]=0;  // error in the assignment : should be "a[i]=i+1"
    i=i+1;
  }
  assert(a[8] != 0);
}
