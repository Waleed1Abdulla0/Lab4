package Task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Q2 {
    static Integer Int1[]={1,2,3,4,5,6,7,8,9};
    static String Str1[]={"A","B","C","D","E","F","G","H","I"};
    public static <B>void merge(B a[], B b[]){
    ArrayList<B> merger = new ArrayList<>();
    for (int i = 0; i < a.length; i++) {
        merger.add(a[i]);
    }
    for (int i = 0; i < b.length; i++) {
        merger.add(b[i]);
    }
    System.out.println("Merged this "+ Arrays.toString(a)+" And This "+Arrays.toString(b)+" To This "+merger);
}
    public static void main(String[] args) {
        merge(Int1,Str1);
    }
}
