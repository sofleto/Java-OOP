package Problem1;

public class MySort {
    Sortable callback;

    public MySort(Sortable callback) {
        this.callback = callback;
    }

    public void sort(int[] arr){
        if(callback!=null)
        {
            for (int i = 0; i <arr.length ; i++) {
                for (int j = 0; j <arr.length-1 ; j++) {
                    if(!callback.greater(arr[j],arr[j+1]))
                    {
                        int swap=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=swap;
                    }
                }
            }
        }
    }
}
