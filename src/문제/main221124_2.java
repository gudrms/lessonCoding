package 문제;


public class main221124_2 {
  public static void main(String[] args) {

//
    for (int x = 2; x <= 40; x=x+2) {
      if (x == 4 || x == 8 || x ==14 ) {
        x=x+2;
      }

      if (x==10||x==20|| x==30 ||x==40 ) {
        if (x == 20) {
          System.out.println("====구구단 "+x+"단=====");
          for (int y = 1; y < 10 ; y++) {
            System.out.println(x+"x"+y+"="+x*y);
          }
          System.out.println("====구구단 "+2+x+"단=====");
          for (int y = 1; y < 10 ; y++) {
            System.out.println(x+200+"x"+y+"="+200*y);
          }

        }
        x=x+1;
        System.out.println("====구구단 "+x+"단=====");
        for (int y = 1; y < 10 ; y++) {
          System.out.println(x+"x"+y+"="+x*y);
        }
        x=x-1;
        x=x+2;
        if (x >= 41) {
          break;
        }
      }
      System.out.println("====구구단 "+x+"단=====");
      for (int y = 1; y < 10 ; y++) {

          System.out.println(x+"x"+y+"="+x*y);

      }
      if (x == 18) {
        System.out.println("====구구단 "+1+x+"단=====");
        for (int y = 1; y < 10 ; y++) {
            System.out.println(x+100+"x"+y+"="+118*y);
        }
      }
      }
    }

//    for (int x = 2; x <= 40; x++) {
//
//      System.out.println("====구구단 "+x+"단=====");
//      for (int y = 1; y < 10 ; y++) {
//
//          System.out.println(x+"x"+y+"="+x*y);
//
//      }
//    }

//    for (int x = 2; x <= 40; x++) {
//      if (x == 18) {
//        System.out.println("====구구단 "+1+x+"단=====");
//        for (int y = 1; y < 10 ; y++) {
//
//          System.out.println(x+100+"x"+y+"="+118*y);
//
//        }
//      }
//      if (x == 20) {
//        System.out.println("====구구단 "+2+x+"단=====");
//        for (int y = 1; y < 10 ; y++) {
//
//          System.out.println(200+x+"x"+y+"="+220*y);
//
//        }
//      }
//      System.out.println("====구구단 "+x+"단=====");
//      for (int y = 1; y < 10 ; y++) {
//
//        System.out.println(x+"x"+y+"="+x*y);
//
//      }
//    }

//    for (int x = 2; x <= 40; x++) {
//      if (x%10==0 ) {
//        x++;
//      }
//      if (x==41){
//        break;
//      }
//      System.out.println("====구구단 "+x+"단=====");
//      for (int y = 1; y < 10 ; y++) {
//          System.out.println(x+"x"+y+"="+x*y);
//      }
//    }



  }

