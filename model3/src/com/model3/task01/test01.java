package com.model3.task01;

/**
 * 1. 编程题
 *
 *  编程统计字符串"ABCD123!@#$%ab"中大写字母、小写字母、数字、其它字符的个数并打 印出来。
 */
public class test01 {
    public static void main(String[] args) {
        String str="ABCD123!@#$%ab";
        //将所有大写字母替换为""比较长度，少的数量就是大写字母的数量
        String str2=str.replaceAll("[A-Z]","");
        System.out.println("字符串中大写字母的个数为："+(str.length()-str2.length()));

        //将所有小写字母替换为""比较长度，少的数量就是小写字母的数量
        String str3=str2.replaceAll("[a-z]","");
        System.out.println("字符串中小写字母的个数为："+(str2.length()-str3.length()));

        //将所有数字替换为""比较长度，少的数量就是数字的数量
        String str4=str3.replaceAll("[0-9]","");
        System.out.println("字符串中数字的个数为："+(str3.length()-str4.length()));

        //剩余数量为其他字符个数
        System.out.println("字符串中其他字符的个数为："+str4.length());
    }
}
