class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int a=A.length;
        int b=B.length;
        int c[]=new int[a];
        
        for(int i=0;i<a;i++){
            boolean found=false;
            for(int j=0;j<b;j++){
                if(A[i]==B[j]){
                    found=true;
                }
                 if(found && j>=i){
                     c[j]++;
                 }   
            }
        }
        return c;
    }
}