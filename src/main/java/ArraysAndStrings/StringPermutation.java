package ArraysAndStrings;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {
//    public static String sortString(String inputString)
//    {
//        // convert input string to char array
//        char tempArray[] = inputString.toCharArray();
//
//        // sort tempArray
//        Arrays.sort(tempArray);
//
//        // return new sorted string
//        return new String(tempArray);
//    }
//    public static boolean checkPermutation1(String source, String target){
//        source = sortString(source);
//        target = sortString(target);
//        return source.equals(target)?true:false;
//    }

      public static boolean checkPermutation2(String source, String target){
          
      }

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String target = sc.nextLine();
        System.out.println(checkPermutation1(source,target));
    }
}
