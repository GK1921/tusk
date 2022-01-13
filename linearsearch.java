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

//leetcode

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;


    }
    static boolean even(int num) {
        int numberOfDigits= digits(num);
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num) {
        if(num<0){
            num = num * 1;
        }
        if(num==0){
            return 1;

        }

        int count =0 ;
        while (num > 0) {
            count++;
            num = num/10;

        }
        return count;
    }




    }

