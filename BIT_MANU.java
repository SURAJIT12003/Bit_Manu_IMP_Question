
//MSB - Most Significant Bit ()->HERE 10000000 The FISRT significant bit (MSB) is the rightmost bit, which in this case is 1. 

//LSB - LAST SIGINIFACANT BIT () -> HERE 10000000 The least significant bit (LSB) is the rightmost bit, which in this case is 0. 

//SET BIT -- WHICH BIT ARE 1 VALUE **

public class BIT_MANU {

    public static boolean oddevBit(int a){
        int b = a+1;
        int c = a&b;
        //System.out.println(b);
        // System.out.println(a);
        if(c==a){
          return true;
        }
        return false;
        // if(a%2==0){
        //   return true;
        // }
        // return false;
    }

    //FROM RIGHT  TO LEFT  POSITION ***
    public static int getBit(int n,int i){  // index pass and get this index value of binary of this number 
      int t = 1<<i;
      if(t==0){
          return 0;
      }
      return 1;
    }

     //FROM LEFT TO RIGHT POSITION ***
  public static int getBit2(int number, int position) {
    // Check if the position is valid.
    if (position < 1 || position > 32) {
      return -1;
    }

    // Shift the number to the right by the position.
    int shiftedNumber = number >> (position - 1);

    // Get the least significant bit of the shifted number.
    int bit = shiftedNumber & 1;

    // Return the bit.
    return bit;
  }

    public static int setBit(int n,int i){  //set bit transfer bit to -  1 (if 0 then 1 or if  1 then 1 )
        int t = 1<<i;
        return t|n;
    }

    
    public static int clearbit(int n ,int i ){  //clear bit mean transfer bit to- 0 
        int t = ~(1<<i);  // left shitf i and then not operator
        
        return t&n;
    }
  
    public static int updateBit(int n,int i,int up){
      //if up==0 then clearbit  and up==1 then setbit approach -1 *
  
        // if(up==0){
        //   return clearbit(n, i);
        // }
        // else{
        //   return setBit(n, i);
        // }
  
        // Approach -2 ****
        n = clearbit(n, i); // clear bit in index (if bit 0 then 0 AND bit 1 then 0)
        int shift = up<<i;
        return n|shift;   //or between left shift up (i times) and n 
  
    }
  
    public static int clearLastBit(int n,int lastBit) {
  
      //BRUTE FORCE APPROACH ***
        // int count =0;
        // for(int i=0;i<lastBit;i++){
        //   n = clearbit(n, count);
        //   count++;
        // }
        // return n;
  
        //OPTIMIZE APPROACH **
        int t = ~1;  // or use 0 (not of 1 )
        t = t<<lastBit;
        return t&n;
  
    }
  
    public static int clearrangeBit(int n,int i,int j){
        //BRUTE FORXE APPROACH **
        // for(int k=i;k<=j;k++){
        //   n = clearbit(n, k);
        // }
        // return n;
  
        //OPTIME APPROACH ***
        int a = (~0)<<j+1;
        int  b = (1<<i)-1;
        int bit = a|b;
        return bit&n;
    }
  
    public static boolean powerOfTwo(int n){
        int t = n-1;
        int f  = t&n;
        if(f==0){
          return true ;
        }
        return false;
    }
  
    public static  int countSetBit(int n){ // Count total bit 1 **
        int count =0;
        while(n>0){
          if((n&1)==1){
            count++;
          }
          n=n>>1;
        }
        return count;
    }
  
    //POWER CALCLULATE OF ANY NUMBER ******
    public static int fastExponation(int n ,int pow){
       int ans =1;
       while(pow>0){
          if((pow&1)==1){
             ans = ans *n;
          }
          n=n*n;
          pow=pow>>1;
       }
       return ans;
    }

    //ADD ONE  USING BIT MANUPULATION
    public static int add(int n ){
      int t =-~n;
      return t;
    }

    //SUBTRACT ONE USING BIT 
    public static int sub(int n ){
      int t =-~n;
      return t;
    }
    
    
    public static void main(String[] args) {
        System.out.println(add(4));
    }
}
