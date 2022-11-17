package 문제;

import java.util.Scanner;

public class main221117 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int three = 0;
    int a = 0;
    int sum = 0;
    int c = 0;
    int bok = 0;
    int jja = 0;
    int tangB = 0;
    int tangM = 0;
    int tangS = 0;
    int two;
    int one=0;
    int count = 0;
    int countSum = 0;
    int x = 2;
    int y = 1;


    while (true) {
      System.out.println("1.구구단 2.음식점 3.계산기 4.종료");
      int num = sc.nextInt();
      if (num == 1) {
        while (y <= 9) {
          System.out.println(x + "X" + y);
          y++;
        }
      }
      else if (num == 2) {

        if (a == 0) {
          System.out.println("볶음밥의 금액 : ");
          bok = sc.nextInt();
          System.out.println("자장면의 금액 : ");
          jja = sc.nextInt();
          System.out.println("탕수육의 대 금액 : ");
          tangB = sc.nextInt();
          System.out.println("탕수육의 중 금액 : ");
          tangM = sc.nextInt();
          System.out.println("탕수육의 소 금액 : ");
          tangS = sc.nextInt();
        }
        a++;
        while (true) {
          System.out.println("1.볶음밥 2.자장면 3.탕수육[소`중`대 따로] 4.종료");
          int numM = sc.nextInt();
          if (numM == 1) {
            sum = sum + bok;
            System.out.println("금액은" + sum + "입니다.");

          } else if (numM == 2) {
            sum = sum + jja;
            System.out.println("금액은" + sum + "입니다.");
          } else if (numM == 3) {
            while (true) {
              System.out.println("1.대[" + tangB + "원] 2.중[" + tangM + "원] 3.소[" + tangS + "원] 4.이전 메뉴");
              int numN = sc.nextInt();
              if (numN == 1) {
                sum = sum + tangB;
                System.out.println("금액은" + sum + "입니다.");

              }
              if (numN == 2) {
                sum = sum + tangM;
                System.out.println("금액은" + sum + "입니다.");

              }
              if (numN == 3) {
                sum = sum + tangS;
                System.out.println("금액은" + sum + "입니다.");

              }
              if (numN == 4) {
                break;
              }
            }
          } else if (numM == 4) {
            System.out.println("종료");
            break;
          }
        }
      }
      else if (num == 3) {
        one = countSum;
        System.out.println("1.덧셈 \n2.뺄셈\n3.입력");
        int culNum = sc.nextInt();
        if (count != 0) {
          if (culNum == 1) {
            System.out.println("두 번째 숫자를 입력하시오");
            two = sc.nextInt();
            countSum = one + two;
            System.out.println(one + "+" + two + " = " + countSum);
          }
          if (culNum == 2) {
            System.out.println("두 번째 숫자를 입력하시오");
            two = sc.nextInt();
            while(one < two){
              System.out.println("두번째 수가 더 클수는 없습니다.");
              System.out.println("두번째 수를 입력하세요.");
              two = sc.nextInt();
            }
            countSum = one - two;
            System.out.println(one + "-" + two + " = " + countSum);
          }
        }
        else if (count == 0) {
          if (culNum == 1) {
            System.out.println("첫 번째 숫자를 입력하시오");
            one = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하시오");
            two = sc.nextInt();
            countSum = one + two;
            System.out.println(one + "+" + two + " = " + countSum);
          }
          if (culNum == 2) {
            System.out.println("첫 번째 숫자를 입력하시오");
            one = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하시오");
            two = sc.nextInt();
            while(one < two){
              System.out.println("두번째 수가 더 클수는 없습니다.");
              System.out.println("두번째 수를 입력하세요.");
              two = sc.nextInt();
            }
            countSum = one - two;
            System.out.println(one + "-" + two + " = " + countSum);
          }
          count = 1;
        }
      }
      else if (num == 4) {
        System.out.println("종료 됩니다.");
        break;
      }
    }
  }
}