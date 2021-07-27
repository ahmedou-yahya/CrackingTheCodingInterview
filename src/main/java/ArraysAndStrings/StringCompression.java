package ArraysAndStrings;

import java.util.Scanner;

public class StringCompression {

    public static String compresseString(String source){
        StringBuilder stringBuilder = new StringBuilder();
        int i=0;
        while(i<source.length()){
            int countChar = 0;
            char c = source.charAt(i);
            while (i<source.length() && source.charAt(i)==c){
                countChar++;
                i++;
            }
            stringBuilder.append(c);
            stringBuilder.append(countChar);
        }
        return (stringBuilder.toString().length()<source.length())?stringBuilder.toString(): source;
    }

    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        String source = sc.nextLine();
        System.out.println(compresseString(source));
    }
}
