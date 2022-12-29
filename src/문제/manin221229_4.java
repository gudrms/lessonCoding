package 문제;

import java.util.Scanner;

public class manin221229_4 {
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
    int pick = 0;


    while (true) {
      System.out.println("1.은행\n2.음식점\n3.완전종료");
      pick = sc.nextInt();
      switch (pick) {
        case 1 :

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
                    System.out.println(" 1.계좌 조회. 2.계좌 입금 3.계좌 출금4.물품구매 5.종료");
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

                            System.out.println("잔액이 " + (accountMinus - account) + "만큼 부족합니다");
                          } else {
                            account -= accountMinus;
                            System.out.println("잔액은 " + account);
                            break;
                          }


                        }
                      case 4:
                        int customer = 0;
                        int mCnt = 0;

                        int menu1C = account / 2;
                        int menu2C = account;
                        int menu3C = account / 10 * 3;
                        int menu4C = 0;

                        String menu1N = "장어덮밥";
                        String menu2N = "옥수수콘";
                        String menu3N = "감자튀김";


                        int menu1 = 0;
                        int menu2 = 0;
                        int menu3 = 0;
                        int sum = 0;
                        int menuP;

                        int con = 1;


                        while (true) {
                          if (mCnt == 1) {
                            break;
                          }
                          customer++;
                          con = 1;
                          System.out.println(customer + "번째 손님입니다.");
                          while (con == 1) {
                            switch (con) {
                              case 1:
                              case 2:
                                break;
                            }

                            System.out.println("1." + menu1N + menu1C + " 2." + menu2N + menu2C + " 3. " + menu3N + menu3C + " 4. 총가격 5.종료");
                            System.out.println("선택할 번호 : ");

                            menuP = sc.nextInt();

                            switch (menuP) {

                              case 1:
                                System.out.println("1번 " + menu1N + "을 선택하셨습니다.");
                                menu1++;
                                sum += menu1C;
                                System.out.println("장어덮밥을 주문해서 현재 누적금액은 = " + sum);
                                account -= sum;
                                System.out.println("현재 잔액은 = " + account);
                                if (menu1 > menu2 && menu1 > menu3) {
                                  System.out.println("장어덮밥을 많이 주문하셨기에 옥수수콘과 감자튀김은 1개씩 무료로 드립니다.");
                                }
                                break;
                              case 2:
                                menu2++;
                                System.out.println("2번" + menu2N + "을 선택하셨습니다.");
                                sum += menu2C;
                                System.out.println("옥수수콘을 주문해서 현재 누적금액은 = " + sum);
                                account -= sum;
                                System.out.println("현재 잔액은 = " + account);
                                if (menu2 > menu3 && menu2 > menu1) {
                                  System.out.println("옥수수콘을 많이 주문하셨기에 감자튀김은 1개씩 무료로 드립니다.");
                                }
                                break;


                              case 3:
                                menu3++;
                                System.out.println("3번" + menu3N + "을 선택하셨습니다.");
                                sum += menu3C;
                                System.out.println("감자튀김을 주문해서 현재 누적금액은 = " + sum);
                                account -= sum;
                                System.out.println("현재 잔액은 = " + account);

                                if (menu3 > menu2 && menu3 > menu1) {
                                  System.out.println("감자튀김을 많이 주문하셨기에 서비스는 없습니다.");
                                }
                                break;

                              case 4:
                                System.out.println("감사합니다 총 가격은" + sum + "입니다");
                                System.out.println("계속 구매하시려면 1번 아니면 2번을 눌러주세요");
                                con = sc.nextInt();
                                switch (con) {
                                  case 1:
                                    System.out.println("계속진행합니다");
                                    ;
                                  case 2:
                                    System.out.println("감사합니다 총 잔액은" + account + "입니다");
                                    mCnt = 1;
                                    break;
                                }
                              case 5:
                                System.out.println("종료");
                                mCnt = 1;
                                con = 2;
                                break;

                            }

                          }


                        }

                      case 5 :
                        System.out.println("종료3");
                        break;
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

        case 2:
          int customer = 0;
          int mCnt = 0;

          int menu1C = account / 2;
          int menu2C = account;
          int menu3C = account / 10 * 3;
          int menu4C = 0;

          String menu1N = "장어덮밥";
          String menu2N = "옥수수콘";
          String menu3N = "감자튀김";


          int menu1 = 0;
          int menu2 = 0;
          int menu3 = 0;
          int sum = 0;
          int menuP;

          int con = 1;


          while (true) {
            if (mCnt == 1) {
              break;
            }
            customer++;
            con = 1;
            System.out.println(customer + "번째 손님입니다.");
            while (con == 1) {
              switch (con) {
                case 1:
                case 2:
                  break;
              }

              System.out.println("1." + menu1N + menu1C + " 2." + menu2N + menu2C + " 3. " + menu3N + menu3C + " 4. 총가격"+"5.종료");
              System.out.println("선택할 번호 : ");

              menuP = sc.nextInt();

              switch (menuP) {

                case 1:
                  System.out.println("1번 " + menu1N + "을 선택하셨습니다.");
                  menu1++;
                  sum += menu1C;
                  System.out.println("장어덮밥을 주문해서 현재 누적금액은 = " + sum);
                  account -= sum;
                  System.out.println("현재 잔액은 = " + account);
                  if (menu1 > menu2 && menu1 > menu3) {
                    System.out.println("장어덮밥을 많이 주문하셨기에 옥수수콘과 감자튀김은 1개씩 무료로 드립니다.");
                  }
                  break;
                case 2:
                  menu2++;
                  System.out.println("2번" + menu2N + "을 선택하셨습니다.");
                  sum += menu2C;
                  System.out.println("옥수수콘을 주문해서 현재 누적금액은 = " + sum);
                  account -= sum;
                  System.out.println("현재 잔액은 = " + account);
                  if (menu2 > menu3 && menu2 > menu1) {
                    System.out.println("옥수수콘을 많이 주문하셨기에 감자튀김은 1개씩 무료로 드립니다.");
                  }
                  break;


                case 3:
                  menu3++;
                  System.out.println("3번" + menu3N + "을 선택하셨습니다.");
                  sum += menu3C;
                  System.out.println("감자튀김을 주문해서 현재 누적금액은 = " + sum);
                  account -= sum;
                  System.out.println("현재 잔액은 = " + account);

                  if (menu3 > menu2 && menu3 > menu1) {
                    System.out.println("감자튀김을 많이 주문하셨기에 서비스는 없습니다.");
                  }
                  break;

                case 4:
                  System.out.println("감사합니다 총 가격은" + sum + "입니다");
                  System.out.println("계속 구매하시려면 1번 아니면 2번을 눌러주세요");
                  con = sc.nextInt();
                  switch (con) {
                    case 1:
                      System.out.println("계속진행합니다");
                      ;
                    case 2:
                      System.out.println("감사합니다 총 잔액은" + account + "입니다");
                      mCnt = 1;
                      break;
                  }
                case 5:
                  System.out.println("종료");
                  mCnt = 1;
                  break;

              }
              break;

            }


          }
          ;
        case 3:

          System.out.println("완전종료");
          break;
      }
      }
  }
}
