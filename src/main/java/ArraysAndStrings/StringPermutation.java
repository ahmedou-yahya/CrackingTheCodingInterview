package ArraysAndStrings;

import java.util.*;

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
          HashMap<Character, Integer> map = new HashMap<>();
          for(int i=0; i<source.length(); i++){
              if(!map.containsKey(source.charAt(i)))
                  map.put(source.charAt(i),1);
              map.put(source.charAt(i), map.get(source.charAt(i))+1);
          }
          for(int i=0; i<target.length(); i++){
              if(map.containsKey(target.charAt(i)) && map.get(target.charAt(i))>0)
                  map.put(source.charAt(i), map.get(source.charAt(i))-1);
              else
                  return false;
          }
          for (Map.Entry<Character, Integer> set : map.entrySet()) {
              if(set.getValue()==0)
                  return false;
          }
          return true;
      }

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        String target = sc.nextLine();
        System.out.println(checkPermutation2(source,target));
    }
}
