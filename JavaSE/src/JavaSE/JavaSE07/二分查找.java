package JavaSE.JavaSE07;

public class 二分查找 {
    public static void main(String[] args) {
        int [] a ={1,2,3,4,5,6,7,8,9};
        int t = 8;
        if (binarysearch(a,t) != -1){
            System.out.println("找到了"+t+",数组下标为"+binarysearch(a,t));
        }else {
            System.out.println("没找到");
        }

    }
    public static int binarysearch(int[] a,int target){
        int i = 0;
        int j = a.length-1;
        int mid ;
        while (i < j){
            mid = (i+j)/2;
            if (a[mid] == target){
                return mid;
            }
            if(a[mid] < target){
                i = mid+1;
            }else if (a[mid] > target){
                j = mid-1;
            }
        }
        return -1;
    }
}
