package main;

import java.util.Scanner;

public class test1 {
   public static void main(String[] args) {
       int one = 0; // 첫 번째 숫자 받기
       int two = 0; // 두 번째 숫자 받기
       String three;

       Scanner sc = new Scanner(System.in);
       System.out.println("1번 째 숫자를 입력하세요 : " );
       one = sc.nextInt();

       System.out.println("2번 째 숫자를 입력하세요 : " );
       two = sc.nextInt();

       System.out.println("+, -, *, /를 입력하세요 : " );
       three = sc.next();

       if(three.equals("+")) {
           System.out.println(one +"+ " +two + " = " + (one+two) );
       }
       else if(three.equals("-")) {
           System.out.println(one +"+ " +two + " = " + (one-two) );
       }
       else if(three.equals("*")) {
           System.out.println(one +"+ " +two + " = " + (one*two) );
       }
       else if(three.equals("/")) {
           System.out.println(one +"+ " +two + " = " + (one/two) );
       }
       else {
           System.out.println("잘못입력하셨습니다." );
       }


   }
}
