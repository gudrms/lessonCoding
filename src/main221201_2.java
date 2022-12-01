//그곳에서 안내판이 보인다. [1.껌5000원 2.과자7000원 3.복숭아4000 4.환불 5.종료]
//
//    [문제출제 - 누가 보더라도 이해하기 쉬운 인터페이스를 구현해주세요.]
//    [문제출제 - 누가 무엇을 주문하든지, 몇 번째 사람인지, 누적금액이 얼마인지, 해당 음식을 몇 번째 사먹는 것인지 늘 나타내세요.
//    [문제출제 - 환불에서는 전체 환불과, 개별 환불 메뉴로 나누어주세요.]
//    [문제출제 - 껌은 5개를 초과로 구매할 수 없습니다.]
//    [문제출제 - 5번 종료를 눌렀을 때, 만약 과자가 10의 배수가 아니라면 다시 구매할 수 있게 만들어주세요. 단, 현재 과자가 몇 개고, 몇 개를 더 주문해야 하는지 나타내세요.]
//    [문제출제 - 5번 종료를 눌렀을 때, 3번 복숭아가 과자보다 적다면 다시 구매할 수 있게 만드세요. 단, 현재 과자가 몇 개고, 복숭아가 몇 개니 복숭아 몇 개를 더 주문해야 하는지 나타내세요.]
//    [문제출제 - 5번 종료가 정상적으로 실행되었다면 아래가 나타납니다.]
//
//    ===매출표===
//
//    오늘의 매출 : 5000원
//    껌 x 1개 : 5000원
//
//    [문제출제 - 위처럼, 아예 구매하지 않은 제품에 한해서는 매출표에 나타내지 않습니다.]
//    복숭아 나오게 + 금액 문제 + 카운트 체크
//

import java.util.Scanner;

public class main221201_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int order;
    int sum = 0;
    int ggum = 5000;
    int snak = 7000;
    int bok = 4000;
    int reCount;
    int reReCount=0;

//    int gumCount = 0;
//    int snakCount = 0;
//    int bokCount = 0;
//    int re = 0;




    while (true) {
      int gogek = 0;
      int gumCount = 0;
      int snakCount = 0;
      int bokCount = 0;
      int re = 0;
      sum=0;


      while (true) {
        gogek++;

        while (true) {
          System.out.println("-----------------------------------------");
          System.out.println(gogek + "번째 고객 입니다.\n무엇을 주문하시 겠습니까?");
          System.out.println("안내판\n1.껌(5000원)\n2.과자(7000원)\n3.복숭아(4000원)\n4.환불\n5.종료");

          order = sc.nextInt();

          if (order == 1) {
            if (gumCount <= 4) {
              gumCount++;
              sum += ggum;
              System.out.println("껌 을 주문하셧습니다.\n현재 총액은" + sum + "원 입니다.");
              System.out.println("껌을" + gumCount + "개 구매 하셨습니다.");
            } else if (gumCount == 5) {
              System.out.println("껌 을 주문하셧습니다.\n현재 총액은" + sum + "원 입니다.");
              System.out.println("껌을" + gumCount + "개 구매 하셨습니다.");
              System.out.println("더 이상 껌을 구매하실 수 없습니다.");
            }
          } else if (order == 2) {
            snakCount++;
            sum += snak;
            System.out.println("과자를 주문하셧습니다.\n현재 총액은" + sum + "원 입니다.");
            System.out.println("과자를" + snakCount + "개 구매 하셨습니다.");
          } else if (order == 3) {
            sum += bok;
            bokCount++;
            System.out.println("복숭아 을 주문하셧습니다.\n현재 총액은" + sum + "원 입니다.");
            System.out.println("복숭아를" + bokCount + "개 구매 하셨습니다.");

          } else if (order == 4) {
            System.out.println("환불을 선택하셨습니다..\n전체 환불은 1번 부분 환불은 2번 입니다.");
            reCount = sc.nextInt();
            if (reCount == 1) {
              System.out.println("전체 환불 되었습니다.");
              sum=0;
            }
            else if (reCount == 2) {
              System.out.println("부분환불을 선택 하셨습니다.");
              System.out.println("1.껌은"+gumCount+"개\n2.과자는 "+snakCount+"개\n3.복숭아는"+bokCount+"개 입니다.\n4. 나가기\n환불할 메뉴를 선택하세요");
              reReCount = sc.nextInt();
              if (reReCount == 1) {
                System.out.println("껌을 1개 환불 하셨습니다.");
                sum-=ggum;
                System.out.println("총액은"+sum+"원 입니다.");
              }
              else if (reReCount == 2) {
                System.out.println("과자를 1개 환불 하셨습니다.");
                sum-=snak;
                System.out.println("총액은"+sum+"원 입니다.");

              } else if (reCount == 3) {
                System.out.println("복숭아를 1개 환불 하셨습니다.");
                sum-=bok;
                System.out.println("총액은"+sum+"원 입니다.");

              }
              else if (reCount == 4) {
                System.out.println("환불을 종료합니다.");
              }

            }

          } else if (order == 5) {

            if (snakCount % 10 == 0) {
              if (snakCount < bokCount) {
                System.out.println("종료되었습니다. ------------------------------------");
                break;
              }
            }

            if (snakCount % 10 != 0) {
              System.out.println("과자를 10의 배수에 맞춰 구매해주시기 바랍니다.");
              System.out.println("현재 과자는" + snakCount + "개이며");
              System.out.println(10 - (snakCount % 10) + "개수 만큼 구매하여 주시기 바랍니다.");
            } else if (snakCount > bokCount) {
              System.out.println("복숭아를 과자보다 많이 구매하세요 과자는" + snakCount + "개이고" + "복숭아는" + bokCount + "입니다");
            }

          }

        }
      }


    }
  }
}
