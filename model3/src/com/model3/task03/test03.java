package com.model3.task03;

import java.util.HashMap;

/**
 * 3. 编程题
 *
 *  准备一个 HashMap 集合，统计字符串"123,456,789,123,456"中每个数字字符串出现的次数并打印出来。
 *
 *  如：
 *
 *         123 出现了 2 次
 *
 *         456 出现了 2 次
 *
 *         789 出现了 1 次
 */
public class test03 {
    public static void main(String[] args) {
        String str="123,456,789,123,456";
        String[] strList=str.split(",");
        HashMap<String,Integer> hashMap=new HashMap();
        for (String str1:strList) {
            if(hashMap.containsKey(str1)){
                hashMap.put(str1,hashMap.get(str1)+1);
            }else {
                hashMap.put(str1,1);
            }
        }

        for(String key:hashMap.keySet()){
            System.out.println(key+" 出现了 "+hashMap.get(key)+" 次");
        }

    }
}
