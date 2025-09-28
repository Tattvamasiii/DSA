package Recursion;
// Sorting array through Recursion
public class Q1 {
    public static void main(String[] args) {
     int ar[]={1,2,7,5,10,11};
        System.out.println(Recurse(ar, 0));
    }
    public static boolean Recurse(int ar[], int index){
        //base condition
        if(index==ar.length-1){
            return true;
        }
        return ar[index]<ar[index+1] && Recurse(ar,index+1);
    }
}

