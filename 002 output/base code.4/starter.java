class starter {
	public static void main(String args[]) {
	    int [] arr1 = {2, 7, 4, 3, 8, 5, 5, 3, 5, 6};	
	    int [] arr2 = {2, 7, 9, 7, 1, 7, 2, 8, 2};
	    int [] arr3 = {2, 6, 4, 5, 3, 8, 9, 1};
	    
	}
        
    public static int getMode(int [] arr1, int [] arr2, int [] arr3){
       int mode, modecount = 0;
       for ( int x= 0; x< arr.length; x++){
           int count = 0;
           for (int y = 0; y< arr.length; y++){
               if (arr[x] == arr[y])
                count++;
               
           }
        if (count > modecount){
            modecount = count;
            mode = arr[x];
        }
       }
       
    }
    // public static int getMedian(int [] arr4){
    //     int [] arr4 = {1, 2, 3, 4, 5, 6, 7};
    //     int [] arr5 = {1, 2, 3, 4, 5, 6};
       
    //     int median1 = getMedian(arr4);
    //     int median2 = getMedian(arr5);
    //     if (arr.length%2=0){
    //         median = arr[arr.length/2 -1];
    //     }
    //     else{
    //         median = arr[arr.length/2];
    //     }
    //     return median;
    // }
    
    
    
    
}