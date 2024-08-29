class yZero {
 /*@ requires (input > 0);
   @ ensures (y != 0);
 @*/
 void yZero (int input) {
 
  int x = 0;
  int y = input - 42; 
  if ( y < 0){ 
   y = 0;
  }
 }
}
