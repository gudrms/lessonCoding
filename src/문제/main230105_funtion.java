package 문제;

import java.util.Scanner;

public class main230105_funtion {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count ; // 갯수
    int menu;


      System.out.println("몇개까지 있다고 할까요? : ");
      count = sc.nextInt(); //5

      int c[] = new int[count]; // 0 1 2 3 4



        for (int i = 0; i < count; i++) {// 1 2 3 4 5
          for (int j = 0; j <= i; j++) {
            System.out.println(j + "번째 값 : " + c[j]);
          }

          if (count-1 > i) {


            System.out.println("다음 값 기준\n1.더하기\n2.빼기\n3.특정값 불러오기");
            menu = sc.nextInt();
            switch (menu) {

              case 1:
                c[1 + i] = plus1();
                break;
              case 2:
                c[1 + i] = c[i] - minus2();
                break;
              case 3:
                c[1 + i] = c[select3()];
                break;
            }
          }

        }
     System.out.println("배열을 초과 했습니다");

      }





    public static int plus1() {
      Scanner sc = new Scanner(System.in);
      int plus;

      System.out.println("숫자 입력 : ");
      plus = sc.nextInt();


      return plus;
    }

   public static int minus2() {
     Scanner sc = new Scanner(System.in);
     int minus;
     System.out.println("숫자 입력 : ");
     minus = sc.nextInt();

    return minus;
  }

  public static int select3() {
    Scanner sc = new Scanner(System.in);
    int pick;

    System.out.println("번호 선택 : ");
    pick = sc.nextInt();

    return pick;
  }





}
