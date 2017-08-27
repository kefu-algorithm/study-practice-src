package com.group.algorithm.algorithm4rd.chapter1_1;

/**
 * Created by qqdong on 2017/8/27.
 * 编写一段代码，将一个正整数N用二进制表示并转换为一个String类型的值s
 * <p>
 * Java中有一个内置方法Integer.toBinaryString(N)专门完成这个任务
 * <p>
 * 下面给出一个简单的实现
 */
public class Exercise09_dongqingqing {
    public static void main(String[] args) {
        int n = 1024;

        String result = toBinaryString(n);

        System.out.println("10 to binary string is :" + result);
    }


    private static String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder(50);
        for (int v = n; v > 0; v /= 2) {
            sb.append(v % 2);
        }
        return sb.reverse().toString();
    }
}
