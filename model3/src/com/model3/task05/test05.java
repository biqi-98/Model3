package com.model3.task05;

import java.util.*;

/**
 * 5. 编程题
 *
 *  使用集合实现斗地主游戏的部分功能，要求如下：
 *
 *  （1）首先准备 54 张扑克牌并打乱顺序。
 *
 *  （2）由三个玩家交替摸牌，每人 17 张扑克牌，最后三张留作底牌。
 *
 *  （3）查看三个玩家手中的扑克牌和底牌。
 *
 *  （4）其中玩家手中的扑克牌需要按照大小顺序打印，规则如下：
 *
 *     手中扑克牌从大到小的摆放顺序：大王,小王,2,A,K,Q,J,10,9,8,7,6,5,4,3
 */
public class test05 {

    public static void main(String[] args) {
        //准备花色
        List<String> color = new ArrayList<>();
        color.add("\33[37;2m"+"♠");
        color.add("\33[31;2m"+"♥");
        color.add("\33[31;2m"+"♦");
        color.add("\33[37;2m"+"♣");

        //准备数字
        ArrayList<String> number = new ArrayList<>();
        Collections.addAll(number,"3","4","5","6","7","8","9","10","J","Q","K","A","2");

        //定义一个map集合：用来将数字与每一张牌进行对应
        Map<Integer, String> map = new HashMap<>();
        //一副54张的牌 ArrayList里边为0-53的数的新牌
        ArrayList<Integer> cards = new ArrayList<>();

        int index = 0;
        for (String thisNumber : number) {
            for (String thisColor : color) {
                cards.add(index);
                map.put(index++, thisColor+thisNumber);

            }
        }

        //加入大小王
        cards.add(index);
        map.put(index++, "\33[37;2m"+"小王");
        cards.add(index);
        map.put(index++, "\33[31;2m"+"大王");

        //洗牌
        Collections.shuffle(cards);

        //创建三个玩家和底牌
        List<Integer> player1= new ArrayList<>();
        List<Integer> player2 = new ArrayList<>();
        List<Integer> player3 = new ArrayList<>();
        List<Integer> playerCards = new ArrayList<>();

        //遍历这副洗好的牌，遍历过程中，将牌发到三个玩家和底牌中
        for (int i = 0; i < cards.size(); i++) {
            if (i >= 51) {
                playerCards.add(cards.get(i));
            } else {
                if (i % 3 == 0) {
                    player1.add(cards.get(i));
                } else if (i % 3 == 1) {
                    player2.add(cards.get(i));
                } else {
                    player3.add(cards.get(i));
                }
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);

        //对应数字形式的每个人手中的牌，定义字符串形式的牌
        List<String> sPlayer = new ArrayList<>();
        List<String> sPlayer2 = new ArrayList<>();
        List<String> sPlayer3 = new ArrayList<>();
        List<String> sCards = new ArrayList<>();

        for (Integer key : player1) {
            sPlayer.add(map.get(key));
        }
        for (Integer key : player2) {
            sPlayer2.add(map.get(key));
        }
        for (Integer key : player3) {
            sPlayer3.add(map.get(key));
        }
        for (Integer key : playerCards) {
            sCards.add(map.get(key));
        }

        //看牌
        System.out.println(sPlayer);
        System.out.println(sPlayer2);
        System.out.println(sPlayer3);
        System.out.println(sCards);

    }
}
