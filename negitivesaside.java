class negitiveaside {
    public static void main(String[] args) {
        System.out.println("Side negitive to left and posyiv eto right");

        int arr[]={-12,11,13,-1,8,9,-8,7};
        int temp1[] = new int[0];
        int temp2[] = new int[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                temp1[i]=arr[i];
            }
            else{
                temp2[i]=arr[i];
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(temp1);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(temp2);
        }
    }

}
