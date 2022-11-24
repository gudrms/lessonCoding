package 문제;
//
//	[문제출제 - 사람이 구매할 때마다, 몇 번째 손님이 구매하는 건지 나타내시오. 또한, 현재 누적금액이 얼마인지도 늘 나타내세요.]
//
//      1.장어덮밥(5000원) 2.옥수수콘(10000원) 3.감자튀김(3000원) 4.총 가격
//      선택할 번호 : 1
//      1번 장어덮밥을 선택하셨습니다.
//      선택할 번호 : 1
//      계속 진행합니다.
//      선택할 번호 : 4
//      감사합니다. 총 가격은 5000원입니다.
//      계속 구매하시겠다면 1번, 아니면 2번을 눌러주세요.

import java.util.Scanner;

public class main221124_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int one = 5000;
    int two = 10000;
    int three = 3000;
    int num = 0;
    int c = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("1.장어덮밥(5000원)\n2.옥수수콘(10000)\n3.감자튀김(3000원)\n4.총 가격");
      System.out.println("선택할 번호 :");
      num = sc.nextInt();
      if (num == 1) {
        sum = sum+one;
        System.out.println("감사합니다 총금액은 :"+sum);
        System.out.println("계속진행 합니다.");
      }
      else if (num == 2) {
        sum = sum+two;
        System.out.println("감사합니다 총금액은 :"+sum);
        System.out.println("계속진행 합니다.");
      }
      else if (num == 3) {
        sum = sum+three;
        System.out.println("감사합니다 총금액은 :"+sum);
        System.out.println("계속진행 합니다.");
      }
      else if (num == 4) {
        System.out.println(" 총금액은 :"+sum);
        System.out.println("계속진행 하려면 1번 아니면 2번을 눌러주세요.");
        c = sc.nextInt();
        if(c == 1) {

        }
        else if(c == 2) {
          System.out.println("종료됩니다.");
          break;
        }

      }


    }

  }
}
