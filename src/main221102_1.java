/*
*
	[문제 출제1: 이름은 입력할 수 있게 할 것.]
	[문제 출제2: 각각의 이름에 점수를 입력받을 수 있게 할 것.] -> 영희의 점수 :
	[문제 출제3: 예시) 1번을 누르면 규민, 2번을 누르면 민영을 선택할 수 있게 하고, 그 둘의 점수를 각각 비교하게 할 것.]
	[문제 출제3: 입력받은 점수를 토대로 점수를 각각 비교하여, 규민이 크면 규민이 큽니다. 라는 문장이 뜨게 할 것.]
	규민과 민영과 철수와 영희가 있다.
	규민은 점수를 ?를 받았고,
	민영은 점수를 ?를 받았고,
	철수는 점수를 ?를 받았고,
	영희는 점수를 ?를 받았다.
	다음 중 누구와 비교해도 누가 누구보다 큰 점수를 받았는지 쓸 수 있도록 해보아라.

	첫 번째 사람 이름 : 경민
	경민이 받은 점수 입력 : 100
	두 번째 사람 이름 : 홍길동
	홍길동이 받은 점수 입력 : 90
	세 번째 사람 이름 : 철수
	철수가 받은 점수 입력 : 80
	네 번째 사람 이름 : 영희
	영희가 받은 점수 입력 : 70
	1.경민
	2.홍길동
	3.철수
	4.영희
	5.종료
	누구와 누구를 대조하시겠습니까?
	첫 번째 사람 입력 : 1
	두 번째 사람 입력 : 3
	시스템 : 경민의 점수가 철수의 점수보다 더 큽니다!
	1.경민
	2.홍길동
	3.철수
	4.영희
	5. 종료.
	누구와 누구를 대조하시겠습니까?
	첫 번째 사람 입력 : 3
	두 번째 사람 입력 : 1
	시스템 : 경민의 점수가 철수의 점수보다 더 큽니다!
	종료는
	첫 번째 사람 입력 : 5
	두 번째 사람 입력 : 5
	처럼 둘 다 5번을 누른 경우 나타난다.
	만약, 둘 중 하나라도 5번이 아니라면
	잘못된 입력입니다! 라는 말이 나타나야 한다.
*
* */

import java.util.Scanner;

public class main221102_1 {
  public static void main(String[] args) {

    Scanner sc  = new Scanner(System.in);
    System.out.println("첫번째 사람이름을 입력하시오.");
    String one = sc.next();
    System.out.println("두번째 사람이름을 입력하시오.");
    String two = sc.next();
    System.out.println("세번째 사람이름을 입력하시오.");
    String three = sc.next();
    System.out.println("네번째 사람이름을 입력하시오.");
    String four = sc.next();

    System.out.println(one+"의 점수를 입력하시오.");
    int oneScore = sc.nextInt();
    System.out.println(two+"의 점수를 입력하시오.");
    int twoScore = sc.nextInt();
    System.out.println(three+"의 점수를 입력하시오.");
    int threeScore = sc.nextInt();
    System.out.println(four+"의 점수를 입력하시오.");
    int fourScore = sc.nextInt();


    while (true){

      System.out.println("1. "+one+"\n2. "+two+"\n3. "+three+"\n"+"4. "+four+"\n5. 종료");
      System.out.println("누구와 누구를 대조 하시겠습니까?");
      System.out.println("첫번째 사람 입력 : ");
      int a = sc.nextInt();
      System.out.println("두번째 사람 입력 : ");
      int b = sc.nextInt();

      if(!(a ==5 || b == 5)) {


    while(!(a ==5 && b == 5))  {


      if(a == 1 && b == 2) {
        if (oneScore > twoScore) {
          System.out.println(one+"의 점수가"+two+"의 점수보다 더 큽니다.");
          break;
        }else if(oneScore < twoScore){
          System.out.println(two+"의 점수가"+one+"의 점수보다 더 큽니다.");
          break;
        }
      }

      else if(a == 1 && b == 3) {
          if (oneScore > threeScore) {
            System.out.println(one + "의 점수가" + three + "의 점수보다 더 큽니다.");
            break;
          } else if (oneScore < threeScore) {
            System.out.println(three + "의 점수가" + one + "의 점수보다 더 큽니다.");
            break;
          }
        }

        else if(a == 1 && b == 4) {
          if (oneScore > fourScore) {
            System.out.println(one + "의 점수가" + four+ "의 점수보다 더 큽니다.");
            break;
          } else if (oneScore < fourScore) {
            System.out.println(four + "의 점수가" + one + "의 점수보다 더 큽니다.");
            break;
          }
        }


      else if(a == 2 && b == 3) {
        if (twoScore > threeScore) {
          System.out.println(two+"의 점수가"+three+"의 점수보다 더 큽니다.");
          break;
        }else if(twoScore < threeScore){
          System.out.println(three+"의 점수가"+two+"의 점수보다 더 큽니다.");
          break;
        }
      }

        else if(a == 2 && b == 4) {
          if (twoScore > fourScore) {
            System.out.println(two + "의 점수가" + four + "의 점수보다 더 큽니다.");
            break;
          } else if (twoScore < fourScore) {
            System.out.println(four + "의 점수가" + two + "의 점수보다 더 큽니다.");
            break;
          }
        }

        else if(a == 3 && b == 4) {
          if (threeScore > fourScore) {
            System.out.println(three+ "의 점수가" + four + "의 점수보다 더 큽니다.");
            break;
          } else if (threeScore < fourScore) {
            System.out.println(four+ "의 점수가" + three+ "의 점수보다 더 큽니다.");
            break;
          }
        }


    }
        System.out.println("종료되었습니다.");

      }
      if (a == 5|| b==5) {
        System.out.println("종료되었습니다.");
        break;
      }
      System.out.println("잘못된 입력입니다.");

    }

  }
}
