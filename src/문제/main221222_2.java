package 문제;

//	[문제출제1]- 처음에 개인정보들을 입력받는다 > 나이, 성별, 전화번호, 주민번호, 카드 비밀번호 4자리.
//      [문제출제2] - 처음 주민번호를 입력할 때 6자리를 입력받게 하고, 만약 6자리가 안 된다면 3번의 기회를 주고, 프로그램을 종료시켜라.
//      단, 종료시키기 전에 입력한 숫자가 6자리보다 안 된다면 기회 한 번을 더 주시고, 6자리보다 크다면 기회를 두 번 더 주세요. 물론 기회는 누적됩니다.
//      test상으로, 기회가 몇 개가 남았는지 상시 나타내주세요.
//
//      [문제출제3]- 만약 입력된 주민번호가 일치하다면, 카드 번호 4자리를 입력할 수 있게 하라. 이 역시 4자리가 되지 않는다면 3번의 기회를 주고, 프로그램을 종료시켜라.
//      [문제출제3]- 그 후 1.계좌 조회. 2.계좌 입금 3.계좌 출금이 가능하도록 설정하여라. 단, 처음에 2번과 3번을 입력할 시 [처음에는 계좌 조회만 가능합니다.]라는 문구가 나타나게 하여라.
//      [문제출제4]- 1번을 입력할 경우 계좌에 얼마가 들어있는지 나오게 하고, 그 상황에서 다시 첫 번째 상황으로 이동할 수 있게 하여라.
//      [문제출제5]- 첫 번째 상황으로 이동했다면 1번을 누를 시 [계좌 조회는 1회만 가능합니다]가 나타나도록 하고, 2, 3번만 입력할 수 있게 하여라.
//      [문제출제6] - 2번을 입력 시 금액을 입금할 수 있게 하여라. 단, 이는 출금할 수 있는 것과 연관시켜야 한다.
//      [문제출제7] - 3번을 누를 시 계좌에서 돈을 뺄 수 있게 하고, 가지고 있는 돈보다 많이 출금하려 할 시 [잔액이 부족합니다.] 라는 문구가 뜨게 하여라.
//      [문제출제8]- 절대 계좌 내에서 –라는 금액이 보이면 안 된다.
//      [문제출제9] - 현 문제의 경우에는, 반복문을 총 두 번만 쓴다. 그리고 무조건 두 번을 써야 한다. 본인이 생각할 때 가장 효율적일 것 같은 곳에 두 번을 사용하자.] - 만약 이게 되지 않는다면 다시 풀어야 함.


import java.util.Scanner;

public class main221222_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age = 0;
    int gender = 0; // 남자는 1 여자는 2
    int phoneNumber = 0;
    int SocialSecurityNumber = 0;
    int cardPassword = 0;
    int cnt = 0;
    int pCnt = 0;
    int chance = 1;
    int account = 100;
    int aCnt = 0;
    int accountInsert =0;
    int accountMinus =0;
    int answer = 0;


    System.out.println("나이를 입력하세요");
    age = sc.nextInt();
    System.out.println("성별을 입력하세요( 남자는 1 / 여자는 2 )");
    gender = sc.nextInt();
    System.out.println("전화번호를 입력하세요");
    phoneNumber = sc.nextInt();
    System.out.println("주민번호를 입력하세요");
    SocialSecurityNumber = sc.nextInt();
    System.out.println("카드비밀번호 입력하세요");
    cardPassword = sc.nextInt();




    while (chance > 0 || answer ==0) {
      System.out.println("반갑습니다 ");
      System.out.println("주민번호를 입력하세요");
      int SocialSecurityNumberA = sc.nextInt();



      if (SocialSecurityNumberA < 100000 && cnt == 0) {
        System.out.println("주민번호가 6자리보다 작습니다.");
        chance += 3;
        cnt = 1;
        chance--;
        System.out.println("chance = " + chance);
      }
      else if (SocialSecurityNumber == SocialSecurityNumberA || answer ==1) {
        System.out.println("카드 비밀번호를 입력하세요");
       int cardPasswordA = sc.nextInt();
       chance--;
        if (cardPasswordA == cardPassword) {
          System.out.println(" 1.계좌 조회. 2.계좌 입금 3.계좌 출금");

          int menu = sc.nextInt();

          switch (menu) {
            case 1 :
              System.out.println("계좌조회\n 계좌금액입니다 "+account);
              aCnt = 1;

            case 2 :
              if (aCnt == 0) {
                System.out.println("처음에는 계좌 조회만 할 수 있습니다.");
              }
              else {
                System.out.println("계좌에 얼마를 입금 하시겠습니까?");
                accountInsert = sc.nextInt();
                account+=accountInsert;
                System.out.println("잔액은 "+account);
              }


            case  3:
              if (aCnt == 0) {
                System.out.println("처음에는 계좌 조회만 할 수 있습니다.");
              }
              else {
                System.out.println("계좌에 얼마를 출금 하시겠습니까?");
                accountMinus = sc.nextInt();
                if (account < accountMinus) {
                  System.out.println("잔액이 "+accountMinus+-+account+"만큼 부족합니다");
                }
                else {
                  account -= accountMinus;
                  System.out.println("잔액은 " + account);
                }
              }


          }
        }
        else if(cardPasswordA != cardPassword && pCnt ==0){
          chance+=3;
          pCnt=1;
        }
        else if(cardPasswordA != cardPassword ) {
          System.out.println("비밀번호가 틀렸습니다");
          chance--;
        }

      }
      else {


        if (SocialSecurityNumberA < 100000 && cnt == 0) {
          chance += 3;
          System.out.println("chance = " + chance);
          cnt = 1;
          chance--;
          System.out.println("chance = " + chance);
        }

        if (cnt == 1) {
          System.out.println("주민번호를 입력하세요");
          SocialSecurityNumberA = sc.nextInt();
          chance--;
          System.out.println("chance = " + chance);
          if (SocialSecurityNumberA < 100000) {
            chance++;
            System.out.println("chance = " + chance);
          }
          else if(SocialSecurityNumberA == SocialSecurityNumber) {

            System.out.println("chance = " + chance);
            answer = 1;
          }
          else if(SocialSecurityNumberA > 100000) {
            chance+=2;
            System.out.println("chance = " + chance);
        }
      }


    }
  }
    System.out.println("종료되었습니다");
  }
}
