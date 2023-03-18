import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[] arr=s.trim().split("[ !,?._'@]+  ");
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
		count++;
        }
System.out.println(count);
for(int i=0;i<arr.length;i++)
     {
           System.out.println(arr[i]);
        }
/*for(String h : arr)
{
System.out.println(h);
}*/

        scan.close();
    }
}
//           YES      leading spaces        are valid,    problemsetters are         evillllll
