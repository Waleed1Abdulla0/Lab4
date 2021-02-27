package Task4;
import java.util.*;

public class Q1 {
        static Integer int1[]={1,2,3,4,5,6,7,8,9};
        static String str1[]={"A","B","C","D","E","F","G","H","I"};
        static Double dou1[]={1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0};
        public static <A>void reverse(A a[]){
            int n =a.length-1;
            for (int i = 0; i < a.length/2; i++) {
                A t = a[i];
                a[i]= a[n];
                a[n]= t;
                n--;
            }
            System.out.println(Arrays.toString(a));
        }
        public static void main(String[] args) {
            System.out.println("The original: " + Arrays.toString(int1));
            System.out.println("The original: " + Arrays.toString(str1));
            System.out.println("The original: " + Arrays.toString(dou1));
            System.out.printf("Reverse it: ");
            reverse(dou1);
            System.out.printf("Reverse it: ");
            reverse(str1);
            System.out.printf("Reverse it: ");
            reverse(int1);
        }

    }
