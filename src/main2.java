import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class main2 {


//        다음 세 가지 중 고르시오.
//	1. 감자. 2.옥수수 3. 수박
//	1번을 누를 시
//	1번 감자를 선택하셨습니다. 라는 문구가 나오도록.
//	2번을 누를 시
//	2번 옥수수를 선택하셨습니다.
//	3번을 누를 시,
//                3번 수박을 선택하셨습니다.
//	>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//        그 뒤 1번 감자에서 1천원어치, 2천원어치 3천원어치.
//	2번을 누를 시 옥수수에서 4천원어치, 5천원어치 6천원어치,
//                3번을 누를 시 수박에서 10000천원어치, 20000천원어치, 30000천원어치.
//        라는 문구가 각각 나오도록 설정하고,
//        그 안에서 또 1번을 누를 시
//	“감자 1천원어치를 선택하셨습니다.” 라는 문구가 나오도록 하고,
//        몇 개를 주문하겠냐고 질문한 뒤 그 개수에 따라 금액이 변동하도록 하시오.


  public static void main(String[] args) {

  int total = foodSelect();
    System.out.println("총 금액은"+total+"원 입니다.");
  }

  public static int foodSelect() {
    Scanner sc = new Scanner(System.in);

    System.out.println("다음 세가지 중 고르시오\n1.감자\n2.옥수수\n3.수박");
    int food = sc.nextInt();
    if (food == 1) {
      return foodPriceSelect("감자", 1000, 2000, 3000);
    } else if (food == 2) {
      return foodPriceSelect("옥수수", 4000, 5000, 6000);
    } else if (food == 3) {
      return foodPriceSelect("수박", 10000, 20000, 30000);
    }

    return 0;
  }

  public static int foodPriceSelect(String food, int price1, int price2, int price3) {
    Scanner sc = new Scanner(System.in);

    System.out.println(food + "를 선택하셨습니다.\n" + price1 + "원, " + price2 + "원, " + price3 + "원");

    int selectPrice = sc.nextInt();

    if (selectPrice == 1) {
      return foodTotalPrice(food, price1);
    } else if (selectPrice == 2) {
      return foodTotalPrice(food, price2);
    } else if (selectPrice == 3) {
      return foodTotalPrice(food, price3);
    }
    return 0;
  }

    public static int foodTotalPrice(String food, int price){
      Scanner sc = new Scanner(System.in);
      System.out.println(food+"의 갯수를 입력하세요");
      int num = sc.nextInt();

      return price*num;
    }
  }