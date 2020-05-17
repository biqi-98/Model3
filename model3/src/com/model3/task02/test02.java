package com.model3.task02;

import java.util.Scanner;

/**
 * 2. 编程题
 *
 *  编程获取两个指定字符串中的最大相同子串。
 *
 *  如： s1="asdafghjka", s2="aaasdfg" 他们的最大子串为"asd"
 *
 *  提示： 将短的那个串进行长度依次递减的子串与较长的串比较。
 */
public class test02 {

    /**
     * 查找长字符串中是否包含短字符串中长度为length的字符串，需要查找的字符串为短字符串下标0开始，依次后移
     */
    public static Boolean findStr(String maxStr,String minStr,int length){
        for(int i=0;i<=minStr.length()-length;i++){
            if(maxStr.indexOf(minStr.substring(i,i+length))>=0){
                System.out.println("他们的最大子串为"+minStr.substring(i,i+length));
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个字符串");
        String str1=sc.next();
        System.out.println("请输入第二个字符串");
        String str2=sc.next();
        //判断字符串长短
        String maxStr="";
        String minStr="";
        if(str1.length()>=str2.length()){
            maxStr=str1;
            minStr=str2;
        }else{
            maxStr=str2;
            minStr=str1;
        }
        //子串长度初始值为短字符串长度，依次递减
        Integer strLength=minStr.length();
        while(strLength>0){
            if(findStr(maxStr,minStr,strLength)){
                break;
            }
            strLength--;
        }
    }
}
