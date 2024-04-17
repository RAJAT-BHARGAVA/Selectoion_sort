public class Selection_sort {
    public static void main(String[]args){
        int [] arr = {5,4,-3,-7,9,0};
        sort(arr);
        for(int i=0 ;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sort(int []arr){
        for(int i =0 ;i<arr.length;i++){
            int ind = min(arr, i);
            if(arr[i]>arr[ind]){
                int temp = arr[i];
                arr[i]=arr[ind];
                arr[ind]= temp;
            }

        }

    }
    public static int min(int []arr,int i){
        int mini = i;
        for (int j= i+1 ;j<arr.length;j++){
            if(arr[j]<arr[mini]){
                mini =j;
            }
        }
        return mini;
    }
}
