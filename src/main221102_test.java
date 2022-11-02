import java.util.Scanner;

public class main221102_test {

//
//
//[문제 출제 - 당신은 프로그래머입니다. 지금부터 손님이 원하는 코딩을 설정해주세요. if, else, else if, 입력문 필수로 사용]
//      [문제출제1: 구구단 2단 이상 나오는 것은 모두 변환문자로 표기하시오.]
//      [문제출제2: 볶음밥, 자장면, 탕수육에 각각 가격을 제시하고 끝까지 금액이 +되는 상황을 재현하시오.]
//      [문제출제3: 단, 4번에는 종료버튼을 넣어, 4번을 누를 시 코딩이 종료되며 합산된 금액이 산출되도록 하시오.]
//      [문제출제4: 모든 선택형에는 없는 번호를 누를 시 다시 되돌아가는 코딩을 설정하시오.]
//      [문제출제5: 음식점에서 탕수육 소,중,대를 각기 다른 금액으로 표현하시오.]
//      [문제출제6: 이 역시 위와같이 잘못 누를 시 다시 되돌아가 금액이 초기화되지 않은 상태로 지속적으로 번호를 선택할 수 있도록 하시오.]
//
//
//
//
//
//
//      [1.구구단 2.음식점 3.계산기 4.종료]
//      1. 2단만 나오는 구구단을 설정해주세요.
//      1-1 : 2단이 지속적으로 출력된다. 2x1 ~ 2x9
//1-2 : 구구단 2단이 끝나면 다시 처음 메뉴[1.구구단 2.음식점 3.계산기 4.종료]로 다시 빠져나간다.
//1-3 : 거기서 다시 1번을 누르면 또다시 구구단 2단이 나타난다.
//
//
//
//
//
//      2. 음식점을 차릴 건데, 포스기에서 사용하는 코딩을 설정해주세요. [1.볶음밥 2.자장면 3.탕수육[소`중`대 따로] 4.종료] 금액 본인이 설정.
//2-1 : 2번을 누르면 볶음밥, 자장면, 탕수육을 선택할 수 있게 만든다.
//2-2 : 그곳에서 탕수육을 누를 시.1.대[?원] 2.중[?원] 3.소[?원] 4.이전 메뉴로가 출력된다. 그리고 그곳에서 4번 이전메뉴를 선택할 시 다시 볶음밥 등을 선택할 수 있는 메뉴판이 나타난다.
//      2-3 : 마찬가지로 종료버튼을 누르면 이전 메뉴로 빠져나가서 1.구구단 2.중국집 3.계산기 4.종료버튼이 뜨게 한다.
//2-4 : 단, 메인메뉴로 빠져나가고, 다시 중국집으로 들어가게 됐을 때 이전에 중국집에서 산 금액이 +되어서 합산되게 하시오.
//2-5 : 각 금액은 알아서 추가하시고, 각 메뉴마다 금액을 나타내시오.
//[2번 예시 : 볶음밥이 1천원짜리가 있다면 1천원이 추가되어, 종료버튼을 누르면 알아서 추가된 금액이 나오도록.]
//  메뉴 금액은 최초 1회 입력받게 만들어주세요 >> 중국집 들어가는 순간 >> 다시 들어갈 땐 받지 않음.
//1.볶음밥.
//      볶음밥 5000원이 추가되어 현재 12000[누적금액]원입니다.
//
//
//
//
//
//3. 계산기가 필요해요. 더하기와 빼기만 있으면 되는데 가능할까요?
//      3-1 : 1.더하기 2. 빼기를 만든다. 빼기의 경우.
//      1. 더하기 2.빼기
//  선택 : 1
//  첫 번째 숫자 : 10scanf
//  두 번째 숫자 : 10scanf
//10+10=20
//
//
//
//  선택 : 2
//  첫 번째 숫자 : 30scanf
//  두 번째 숫자 : 100scanf
//  이런 경우
//"두 번재 숫자가 더 클 수 없습니다!!"
//  두 번째 숫자만 다시 입력받는다. 첫 번째 숫자보다 클 때까지.
//
//
//
//
//
//
//
//  만약 이미 계산을 한 상태일 경우,
//  그 전에 계산된 금액이 나타나면서 더하거나 뺄 숫자를 입력할 수 있게 하시오.
//  예시 =
//  입력 : 3
//  계산기입니다.
//1번 더하기 2번 빼기
//  선택 : 1
//  첫 번째 : 10
//  두 번째 : 20
//      10 + 20 = 30
//      [1.구구단 2.음식점 3.계산기 4.종료]
//  선택 : 3
//      1번 더하기, 2번 빼기
//  선택 : 1
//  두 번째 숫자 입력 : 50
//      30 + 50 = 80
//
//
//      4. 종료
//4-1:종료버튼울 누를 시, 여태까지 합산된 금액이 얼마인지 알 수 있도록 나타내시오.


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    while (true) {
      System.out.println("1.구구단 2.음식점 3.계산기 4.종료");
      int num = sc.nextInt();

      if (num == 1) {
        gugu();

      } else if (num == 2) {
        System.out.println("볶음밥의 금액 : ");
        int bok = sc.nextInt();
        System.out.println("자장면의 금액 : ");
        int jja = sc.nextInt();
        System.out.println("탕수육의 대 금액 : ");
        int tangA = sc.nextInt();
        System.out.println("탕수육의 중 금액 : ");
        int tangB = sc.nextInt();
        System.out.println("탕수육의 소 금액 : ");
        int tangC = sc.nextInt();
        market();

      } else if (num == 3) {

      } else if (num == 4) {
        System.out.println("종료 됩니다.");
        break;
      }
    }


  }

  public static int gugu() {
    int x = 2;
    int y = 1;
    while (y <= 9) {
      System.out.println(x + "X" + y);
      y++;
    }
    return 0;
  }

  public static int marketAdd() {
    return 0;
  }
  public static int market(int bok, int jja, int tangA, int tangB, int tangC) {



    Scanner sc = new Scanner(System.in);

    int sum = 0;



    while (true) {
      System.out.println("1.볶음밥 2.자장면 3.탕수육[소`중`대 따로] 4.종료");
      int num = sc.nextInt();

      while (true) {

        if (num == 1) {
          sum = sum + bok;
          System.out.println("금액은" + sum + "입니다.");
          break;
        } else if (num == 2) {
          sum = sum + jja;
          System.out.println("금액은" + sum + "입니다.");
          break;
        } else if (num == 3) {
          System.out.println("1.대[100원] 2.중[50원] 3.소[300원] 4.이전 메뉴");
          int numN = sc.nextInt();

          if (numN == 1) {
            sum = sum + tangA;
            System.out.println("금액은" + sum + "입니다.");
            break;
          }
          if (numN == 2) {
            sum = sum + tangB;
            System.out.println("금액은" + sum + "입니다.");
            break;
          }
          if (numN == 3) {
            sum = sum + tangC;
            System.out.println("금액은" + sum + "입니다.");
            break;
          }
          if (numN == 4) {
            market();
            break;
          }

        } else if (num == 4) {
          System.out.println("종료");
          break;
        }

      }
      return 0;
    }

  }

  public static int cal() {

    return 0;
  }
}
