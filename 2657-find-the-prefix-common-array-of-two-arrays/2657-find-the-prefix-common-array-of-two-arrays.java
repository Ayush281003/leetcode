class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
//         int a=A.length;
//         int b=B.length;
//         int c[]=new int[a];
        
//         for(int i=0;i<a;i++){
//             boolean found=false;
//             for(int j=0;j<b;j++){
//                 if(A[i]==B[j]){
//                     found=true;
//                 }
//                  if(found && j>=i){
//                      c[j]++;
//                  }   
//             }
//         }
//         return c;
        int c[]=new int[A.length];
        int freq[]=new int[A.length+1];
        int count=0;
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2)count++;
            freq[B[i]]++;
            if(freq[B[i]]==2)count++;
            c[i]=count;
        }
        return c;
    }
}