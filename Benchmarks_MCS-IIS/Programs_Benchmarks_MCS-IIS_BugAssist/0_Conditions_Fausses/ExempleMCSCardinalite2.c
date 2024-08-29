

 
   
    
void ExempleMCSCardinalite2(int i){int v,w,z;i=0;
  v=5;
  w=6;
  z=i+(v+w); // error in the assignment : z=i+(v+w); instead of z=i*(v+w);
  assert((z==0 || i!=0) && (v>=0) && (w>=0));
}
