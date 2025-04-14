// how to copy array elements from one array to another

//guess we have an element of a[]=10,20,30 then we have to copy it to b[] array

//first thing is that both array has same type and same size to copy one element to another

import java.util.Scanner;
public class example7 {
        public static void main(String[] args) {
        int a[]=new int[7];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<7;i++)
        {
            System.out.println("enter value for array :" + i + " :");
            a[i] = sc.nextInt();
        }

        for(int i=0;i<7;i++)
        {
            System.out.println("the array is:"+ a[i]);
        }
    
     int b[]=new int[7];
     System.out.println("now we're going to copy one array to another:");
     for(int i =0; i<7;i++){
        b[i]=a[i];
        System.out.println("the copied array is:"+b[i]);
     }
     sc.close();
    }
}
