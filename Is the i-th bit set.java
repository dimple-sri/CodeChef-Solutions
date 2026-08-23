class Solution {
    public boolean isBitSet(long n, int i) {
        // write your code here 
        return ((n >> i) & 1) == 1;
   }
}
