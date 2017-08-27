package com.group.algorithm.algorithm4rd.chapter1_1;

/**
 * Created by qqdong on 2017/8/27.
 * 下列语句会打印什么结果
 */
public class Exercise08_dongqingqing {
    public static void main(String[] args) {
        printTestSentence();
    }

    private static void printTestSentence() {
        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println('a' + 4);
        System.out.println((char) ('a' + 4));

    }
}
