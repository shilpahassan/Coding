class GFG
{ 


void findNthNum(int N) 

{ 
   
    
int bit_L = 1, last_num = 0; 
   
       
while (bit_L * (bit_L + 1) / 2 < N) 
       
{ 
        
last_num = last_num + bit_L; 
        
bit_L++; 
       
} 
   
   
    
int bit_R = N - last_num - 1; 
   
    
System.out.print((1 << bit_L) + (1 << bit_R) +"\n"); 

} 

}

class Main

{

public static void main(String[] args) 

{ 
    
int N = 4; 
   
GFG g=new GFG();
    
g.findNthNum(N); 
} 

} 
  