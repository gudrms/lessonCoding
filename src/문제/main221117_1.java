package 문제;

import java.util.Scanner;

public class main221117_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = 0;
    int x = 2;
    int c = 0;
    int friedRice =0 ;
    int noodles=0;
    int friedForkL=0;
    int friedForkM=0;
    int friedForkS=0;
    int sum = 0;
    int menu = 0;
    int selectFF = 0;
    int cal = 0;
    int addOne=0;
    int addTwo=0;
    int total=0;




    while (true) {
      System.out.println("1.구구단\n2.음식점\n3.계산기\n4.종료");
      num = sc.nextInt();
      if (num == 1) {
        int gugu = 1;
        while (gugu <= 9) {
          System.out.println(x + "X" + gugu + " = " + 2 * gugu);
          gugu++;
        }
      }
      else if (num == 2) {

        if (c == 0) {
          System.out.println("볶음밥의 가격을 입력하세요");
          friedRice = sc.nextInt();
          System.out.println("자장면의 가격을 입력하세요");
          noodles = sc.nextInt();
          System.out.println("탕수육(대)의 가격을 입력하세요");
          friedForkL = sc.nextInt();
          System.out.println("탕수육(중)의 가격을 입력하세요");
          friedForkM = sc.nextInt();
          System.out.println("탕수육(소)의 가격을 입력하세요");
          friedForkS = sc.nextInt();
        }
          c = 1;
          while (true) {
            System.out.println("메뉴를 선택하세요\n1.볶음밥"+friedRice+"\n2.자장면" + noodles + "\n3.탕수육"+"\n4.이전메뉴로");
            menu = sc.nextInt();
            if (menu == 1) {
              sum += friedRice;
              System.out.println("총 가격은" + sum + "입니다");

            } else if (menu == 2) {
              sum += noodles;
              System.out.println("총 가격은" + sum + "입니다");

            } else if (menu == 3) {

              while (true) {
                System.out.println("메뉴를 선택하세요\n1.탕수육(대)" + friedForkL + "\n2.탕수육(중)" + friedForkM + "\n3.탕수육(소)" + friedForkS + "\n4.이전메뉴로");
                selectFF = sc.nextInt();
                if (selectFF == 1) {
                  sum += friedForkL;
                  System.out.println("총 가격은" + sum + "입니다");
                } else if (selectFF == 2) {
                  sum += friedForkM;
                  System.out.println("총 가격은" + sum + "입니다");
                } else if (selectFF == 3) {
                  sum += friedForkS;
                  System.out.println("총 가격은" + sum + "입니다");
                } else if (selectFF == 4) {
                  System.out.println("이전 메뉴로...");
                  break;
                }
              }
            } else if (menu == 4) {
              System.out.println("이전 메뉴로...");
              break;
            }
        }
      }
      else if(num == 3){
        while (true) {
          if(total != 0) {

            addOne = total;
            System.out.println("1.더하기\n2.빼기\n4.이전");
            cal = sc.nextInt();
            if ( cal == 1 ) {
              System.out.println("기존 첫 번째 수는"+addOne+"입니다.");
              System.out.println("두 번째 수를 입력하시오.");
              addTwo = sc.nextInt();
              total = addOne+addTwo;
              System.out.println("두수의 합은 "+total+"입니다.");

            }
            else if(cal == 2) {
              System.out.println("기존 첫 번째 수는"+addOne+"입니다.");
              System.out.println("두 번째 수를 입력하시오.");
              addTwo = sc.nextInt();

              if(addOne<addTwo){
                System.out.println("처음수가 두번째수보다 작을수 없습니다.");
                System.out.println("기존 첫 번째 수는"+addOne+"입니다.");
                System.out.println("두 번째 수를 입력하시오.");

                addTwo = sc.nextInt();

                while(addOne<addTwo) {
                  System.out.println("처음수가 두번째수보다 작을수 없습니다.");
                  System.out.println("기존 첫 번째 수는"+addOne+"입니다.");
                  System.out.println("두 번째 수를 입력하시오.");
                  addTwo = sc.nextInt();
                }
              }
              total = addOne-addTwo;
              System.out.println("두 수의 차는 "+total+"입니다.");
            }
            else if(cal == 4) {
              System.out.println("이전단계로");
              break;
            }

          }
          else if(total == 0) {
            System.out.println("1.더하기\n2.빼기\n4.이전");
            cal = sc.nextInt();
            if ( cal == 1 ) {


              System.out.println("첫 번째 수를 입력하시오.");
              addOne = sc.nextInt();
              System.out.println("두 번째 수를 입력하시오.");
              addTwo = sc.nextInt();


              total = addOne+addTwo;
              System.out.println("두수의 합은 "+total+"입니다.");

            }
            else if(cal == 2) {
              System.out.println("첫 번째 수를 입력하시오.");
              addOne = sc.nextInt();
              System.out.println("두 번째 수를 입력하시오.");
              addTwo = sc.nextInt();

              if(addOne<addTwo){
                System.out.println("처음수가 두번째수보다 작을수 없습니다.");
                System.out.println("두 번째 수를 입력하시오.");
                addTwo = sc.nextInt();
              }


              total = addOne-addTwo;
              System.out.println("두 수의 차는 "+total+"입니다.");
            }
            else if(cal == 4) {
              System.out.println("이전단계로");
              break;
            }
          }
        }
      }
      else if( num == 4 ) {
        System.out.println("종료되었습니다.");
        break;
      }
    }
  }
}

