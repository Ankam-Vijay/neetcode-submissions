class Solution {
    public int[] replaceElements(int[] arr) {
       int n=arr.length;
       int max;
       for(int i=0;i<n;i++){
         max=0;
           for(int j=i+1;j<n;j++){
             if(max<arr[j])
                max=arr[j];
           }
           arr[i]=max;
       } 
       arr[n-1]=-1;
       return arr;
    }
}