package 문제;

import java.util.Scanner;

public class main221229_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int age = 0;
    int gender = 0; // 남자는 1 여자는 2
    int phoneNumber = 0; //전화번호
    int SocialSecurityNumber = 0; //주민번호
    int cardPassword = 0; // 카드비밀번호
    int cnt = 0;
    int pCnt = 0;
    int chance = 1;  //기회
    int account = 0; //전액
    int aCnt = 0;
    int accountInsert =0;   // 입금액
    int accountMinus =0;    //출금액
    int answer = 0;
    int SocialSecurityNumberA ;
    int cardPasswordA = 0;
    int menu ;

//    System.out.println("나이를 입력하세요");
//    age = sc.nextInt();
//    System.out.println("성별을 입력하세요( 남자는 1 / 여자는 2 )");
//    gender = sc.nextInt();
//    System.out.println("전화번호를 입력하세요");
//    phoneNumber = sc.nextInt();
    System.out.println("주민번호를 입력하세요");
    SocialSecurityNumber = sc.nextInt();
    System.out.println("카드비밀번호 입력하세요");
    cardPassword = sc.nextInt();

    while (true) {
      System.out.println("반갑습니다 ");
      System.out.println("주민번호를 입력하세요");
      SocialSecurityNumberA = sc.nextInt();

      if (SocialSecurityNumberA == SocialSecurityNumber) {

        while (true) {
          System.out.println("카드 비밀번호를 입력하세요");
          cardPasswordA = sc.nextInt();
          chance--;
          System.out.println("chance = " + chance);
          // 계좌비밀번호가 같을 때
            if (cardPasswordA == cardPassword) {

              while (true) {
                System.out.println(" 1.계좌 조회. 2.계좌 입금 3.계좌 출금");
                menu = sc.nextInt();
                switch (menu) {
                  case 1:
                    System.out.println("계좌조회\n 계좌금액입니다 " + account);
                    aCnt = 1;
                    break;
                  case 2:
                    if (aCnt == 0) {
                      System.out.println("처음에는 계좌 조회만 할 수 있습니다.");
                    } else {
                      System.out.println("계좌에 얼마를 입금 하시겠습니까?");
                      accountInsert = sc.nextInt();
                      account += accountInsert;
                      System.out.println("잔액은 " + account);
                    }
                    break;
                  case 3:
                    if (aCnt == 0) {
                      System.out.println("처음에는 계좌 조회만 할 수 있습니다.");
                    } else {
                      System.out.println("계좌에 얼마를 출금 하시겠습니까?");
                      accountMinus = sc.nextInt();
                      if (account < accountMinus) {

                        System.out.println("잔액이 " + (accountMinus-account) + "만큼 부족합니다");
                      } else {
                        account -= accountMinus;
                        System.out.println("잔액은 " + account);
                        break;
                      }
                    }


                }
              }
            }

            // 계좌 비밀번호가 다를때
            else if (cardPasswordA != cardPassword && pCnt == 0) {
              System.out.println("비밀번호가 틀렸습니다");
              chance += 3;
              pCnt = 1;
            } else if (cardPasswordA != cardPassword) {
              System.out.println("비밀번호가 틀렸습니다");
              chance--;
            }

          }
        }

      // 주민번호가 다를때
      else if (SocialSecurityNumberA != SocialSecurityNumber) {

        //주민번호가 6자리수 보다 클 때
        if (SocialSecurityNumberA > 100000) {
          System.out.println("주민번호를 틀렸습니다..");
          chance--;
          System.out.println("chance = " + chance);

        }
        //주민번호가 6자리수 보다 작을 때
        else if (SocialSecurityNumberA < 100000) {
          System.out.println("주민번호가 6자리보다 작습니다.");
          chance--;
          chance += 3;
          cnt = 1;
          System.out.println("chance = " + chance);
        }

      }

    }

  }
}
