package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-8-1.
 */
//一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。

public class Test25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个5位数 ：");
        int n = scanner.nextInt();
        if((n/10000 == n%10)&&(n%10000/1000 == n%100/10)){
            System.out.println(n + " 是回文 ");

        }else {
            System.out.println(n + " 不是回文 ");

        }
    }
}
