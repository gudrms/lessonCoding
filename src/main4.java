import java.util.Scanner;

public class main4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    int money = 10000;
    int nowMoney;

    System.out.println("추가 용돈을 입력하세요");
    int plus = sc.nextInt();
    money = money + plus;
    System.out.println(money);
    System.out.println("현재 금액은" + money + "원 입니다.");

    System.out.println("떡볶이 금액을 입력하세요");
    int dd = sc.nextInt();
    System.out.println("우동 금액을 입력하세요");
    int udong = sc.nextInt();
    System.out.println("과자 금액을 입력하세요");
    int snek = sc.nextInt();

    System.out.println("떡볶이를 몇개 주문하시겠습니까?");
    int ddNum = sc.nextInt();


    if (money >= dd * ddNum) {
      nowMoney = money - dd * ddNum;
      System.out.println("떡볶이는 " + dd * ddNum + "원이고 남은 금액은" + nowMoney + "원 입니다.");
      System.out.println("우동을 몇개 주문하시겠습니까?");
      int udongNum = sc.nextInt();
      if (nowMoney >= udongNum * udong) {
        System.out.println("우동은 " + udongNum * udong + "원이고 남은 금액은" + (nowMoney - udongNum * udong) + "원 입니다.");
        nowMoney = nowMoney - udongNum * udong;
        System.out.println("과자를 몇개 주문하시겠습니까?");
        int snekNum = sc.nextInt();
        if (nowMoney >= snekNum * snek) {
          System.out.println("과자는 " + snekNum * snek + "원이고 남은 금액은" + (nowMoney - snekNum * snek) + "원 입니다.");
          nowMoney = nowMoney - snekNum * snek;
        }if(nowMoney < snekNum * snek){
          nowMoney = nowMoney -(snekNum * snek);
          System.out.println("현재" +nowMoney+ "원이 부족합니다.");
          System.out.println("용돈을  얼마 추가 받으시겠습니까?");
          plus = sc.nextInt();
          nowMoney = nowMoney + plus ;
          System.out.println("용돈을 추가 받아 " + nowMoney + "가 되었습니다.");
        }
      }if(nowMoney < udongNum * udong) {
        nowMoney = nowMoney-udongNum * udong;
        System.out.println("현재" + nowMoney + "원이 부족합니다.");
        System.out.println("용돈을 얼마 추가 받으시겠습니까?");
        plus = sc.nextInt();
        nowMoney = nowMoney+plus;
        System.out.println("용돈을 추가 받아 " + nowMoney + "가 되었습니다.");
        System.out.println("과자를 몇개 주문하시겠습니까?");
        int snekNum = sc.nextInt();
        if (nowMoney >= snekNum * snek) {
          nowMoney = nowMoney - snekNum * snek;
          System.out.println("과자는 " + snekNum * snek + "원이고 남은 금액은" + nowMoney+ "원 입니다.");
        }if (nowMoney < snekNum * snek) {
          System.out.println("용돈이 부족하여 가게에서 쫓겨났습니다.");
        }
      }

    } if (money <= dd * ddNum) {
      System.out.println("현재" + (dd * ddNum - money) + "원이 부족합니다.");
      System.out.println("용돈을  얼마 추가 받으시겠습니까?");
      plus = sc.nextInt();
      nowMoney = money + plus ;
      System.out.println("용돈을 추가 받아 " + nowMoney + "가 되었습니다.");
      if (money + plus >= dd * ddNum) {
        nowMoney = nowMoney - dd * ddNum;
        System.out.println("떡볶이는 " + dd * ddNum + "원이고 남은 금액은" + nowMoney + "원 입니다.");
        System.out.println("우동을 몇개 주문하시겠습니까?");
        int udongNum = sc.nextInt();
        if (nowMoney >= udongNum * udong) {
          nowMoney = nowMoney-udongNum * udong;
          System.out.println("우동은 " + udongNum * udong + "원이고 남은 금액은" + nowMoney + "원 입니다.");
          System.out.println("과자를 몇개 주문하시겠습니까?");
          int snekNum = sc.nextInt();
          if (nowMoney >= snekNum * snek) {
            nowMoney = nowMoney-snekNum * snek;
            System.out.println("과자는 " + snekNum * snek + "원이고 남은 금액은" + nowMoney + "원 입니다.");
          }if(nowMoney < snekNum * snek){
            System.out.println("용돈이 부족하여 가게에서 쫓겨났습니다.");
          }
        }if (nowMoney < udongNum * udong) {
          System.out.println("용돈이 부족하여 가게에서 쫓겨났습니다.");
        }
      }  if (money + plus < dd * ddNum) {
        System.out.println("용돈이 부족하여 가게에서 쫓겨났습니다.");
      }
    }
  }
}

