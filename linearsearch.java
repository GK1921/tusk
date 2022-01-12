package com.company;


import static java.lang.System.*;

public class Main{
    public static void main(String[] args){
        String name = "Geetha";
        char target = 'p';
        out.println(search(name ,target));

    }
        static boolean search(String str, char target){
        if(str.length()==0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
        }


}
