package 문제;

import java.util.Scanner;

public class main230105_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count ; // 갯수
    int menu;
    int plus;
    int minus;
    int pick;

    while (true) {

      System.out.println("몇개까지 있다고 할까요? : ");
      count = sc.nextInt();

      int c[] = new int[count];

      while (true) {

        for (int i = 0; i < count; i++) {
          for (int j = 0; j <= i; j++) {
            System.out.println(1 + j + "번째 값 : " + c[j]);
          }
            System.out.println("다음 값 기준\n1.더하기\n2.빼기\n3.특정값 불러오기");
            menu = sc.nextInt();
            switch (menu) {
              case 1 :
                System.out.println("숫자 입력 : ");
                plus = sc.nextInt();
                c[1+i] = plus;
                break;

              case 2 :
                System.out.println("숫자 입력 : ");
                minus = sc.nextInt();
                c[1+i] = c[i]-minus;
                break;

              case 3 :
                System.out.println("번호 선택 : ");
                pick = sc.nextInt();
                c[1+i] = c[pick-1];
                break;



            }



        }

      }
    }
  }


}
