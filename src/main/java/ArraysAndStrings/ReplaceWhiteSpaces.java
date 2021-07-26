package ArraysAndStrings;

import java.util.Scanner;

public class ReplaceWhiteSpaces {

    // This is my solution:

    public static String replaceAllWhitespaces(char[] source, int length){

        int whitespaces = 0;
        for(char c: source)
            if(c==' ')
                whitespaces++;

        int right = length-(whitespaces/3)*2;
        for(int i=right-1; i>=0; i--){
            if(source[i]==' ') {
                source[length - 1] = '0';
                source[length - 2] = '2';
                source[length - 3] = '%';
                length = length - 3;
            }
            else{
                source[length - 1] = source[i];
                length--;
            }
        }
        return String.valueOf(source);
    }
    
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        char[] sourceArray = source.toCharArray();
        System.out.println(replaceAllWhitespaces(sourceArray, sourceArray.length));
    }
}
