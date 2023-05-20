import java.util.*;
public class AreAsending {
    
    public static boolean areAsc(String s){
        //handle edge case ..
        
        if(s.length() == 0) return false;
        
        String[] str = s.split(" ");
        int start = Integer.MIN_VALUE;
        for(int i = 0; i < str.length; i++){
            String pot = str[i];   
            //System.out.println(pot);
            try {
                int value = Integer.parseInt(pot);
                //return true;
                if(value > start){
                    start = value;
                }else{
                    return false;
                }
            } catch (NumberFormatException e) {
                //System.out.println("Input String cannot be parsed to Integer.");
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "1 box has 3 blue 4 red 6 green and 1 yellow marbles";
        boolean b = areAsc(s);
        System.out.println(b);
    }

    
}
