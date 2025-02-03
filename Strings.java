import java.util.*;

public class Strings {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // String firstName = "tony";
        // String lastName = "stark";
        // String fullName = firstName + "@" + lastName;
        // // System.out.println(fullName);

        // for(int i = 0; i < fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }
        // sc.close();

        // String name1 = "tony";
        // String name2 = "tony";

        // if(name1.compareTo(name2) == 0){
        //     System.out.println("Strings are equal");
        // } else{
        //     System.out.println("Strings are not equal");
        // }

        // String sentence = "My name is Tony";
        // String name = sentence.substring(11,sentence.length());
        // System.out.println(name);

        // StringBuilder sb = new StringBuilder("Tony");
        // System.out.println(sb);

        // System.out.println(sb.charAt(0));

        // sb.setCharAt(0, 'P');
        // System.out.println(sb);

        // sb.insert(0,'S');
        // System.out.println(sb);
        
        // sb.insert(3,'n');
        // System.out.println(sb);
        
        // sb.delete(3,5);
        // System.out.println(sb);

        // StringBuilder sb = new StringBuilder("h");
        // sb.append("e");
        // sb.append("l");
        // sb.append("l");
        // sb.append("o");
        // System.out.println(sb);
        // System.out.println(sb.length());

        StringBuilder sb = new StringBuilder("hello");

        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length() - 1 - i;

            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}
