package ArraysAndStrings;

import java.util.Scanner;

public class ReplaceWhiteSpaces {

    // This is my solution:

//    public static String replaceAllWhitespaces(char[] source){
//        StringBuilder stringBuilder = new StringBuilder();
//        int length = source.length;
//        int whitespaces = 0;
//        for(char c: source)
//            if(c==' ')
//                whitespaces++;
//
//        int right = length-(whitespaces/3)*2;
//        for(int i=0; i<right; i++){
//            if(source[i]==' ')
//                stringBuilder.append("%20");
//            else
//                stringBuilder.append(source[i]);
//        }
//        return stringBuilder.toString();
//    }

    public static char[] replaceAllWhitespaces(char[] str, int length){
        int spaceCount = 0;
        for(int i=0; i<str.length; i++){
            if(str[i]==' ')
                spaceCount++;
        }
        int newLength = length + spaceCount*2;

        char[] result = new char[newLength];
        for(int i=length-1; i>=0; i--){
            if(str[i]==' '){
                result[newLength-1]='0';
                result[newLength-2]='2';
                result[newLength-3]='%';
                newLength = newLength-3;
            }
            else {
                result[newLength - 1] = str[i];
                newLength--;
            }
        }
        return result;
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        char[] sourceArray = source.toCharArray();
        char[] resultArray = replaceAllWhitespaces(sourceArray, sourceArray.length);
            System.out.println(resultArray.toString());
    }
}
