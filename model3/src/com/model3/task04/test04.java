package com.model3.task04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *4. 编程题
 *
 *  使用 List 集合实现简易的学生信息管理系统，要求打印字符界面提示用户选择相应的功 能，根据用户输入的选择去实现增加、删除、修改、查找以及遍历所有学生信息的功能。
 *
 *  其中学生的信息有：学号、姓名、年龄。 要求： 尽量将功能拆分为多个.java 文件。
 */
public class test04 {
    private static List<Student> students=new ArrayList<>();

    public static void run(){
        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("请按照提示输入数字查询你所需要的功能:");
            System.out.println("1,查看所有学生信息。2,根据学号查找某个学生的信息。3,根据学号删除某个学生的信息。");
            System.out.println("4,添加一个学生信息。5,根据学号修改某个学生的信息。6,退出。");
            switch(sc.nextInt()){
                case 1:
                    System.out.println(students.toString());
                break;
                case 2:
                    ListSelectTest.check(students);
                    break;
                case 3:
                    students=ListDeleteTest.delete(students);
                    break;
                case 4:
                    students=ListAddTest.add(students);
                    break;
                case 5:
                    students=ListUpdateTest.update(students);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("请按照提示输入！");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        run();
    }

}
