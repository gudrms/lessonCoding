package 문제;

import java.util.Scanner;
/*

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int[] c = new int[999];
        String[] n = new String[999];
        int[] n1 = new int[999];
        int[] n2 = new int[999];
        int count = 0;
        int measure = 0;
        int n1answerCount = 0;
        int n2answerCount = 0;
        int sumDigit = 0;
        int[] sD = new int[999];
        int digit = 0;
        String firstGamer;
        String secondGamer;
        int[] d1 = new int[999];
        int[] d2 = new int[999];


        while (true) {

            System.out.println("지금부터 게임을 시작합니다.");
            for (int i = 1; i <= 4; i++) {
                System.out.println(i + "번째 번호 입력");
                c[i] = sc.nextInt();
                sum = sum + c[i];
            }
            System.out.println("첫번째 플레이어의 이름을 입력하세요");
            firstGamer = sc.next();

            System.out.println("두번째 플레이어의 이름을 입력하세요");
            secondGamer = sc.next();


            System.out.println(firstGamer + "님, " + secondGamer + "님 반갑습니다");

            System.out.println(firstGamer + "님 부터 시작합니다.");
//힌트3
            for (int j = 1; j < 999; j++) {
                System.out.println(j + "번째 턴 입니다");
                if (j % 8 == 0) {
                    sumDigit = sum;
                    for (int i = 0; i < 999; i++) {
                        sD[i] = sumDigit % 10;
                        sumDigit = sumDigit / 10;
                        digit += sD[i];
                        if (sumDigit <= 0) {
                            System.out.println("sum = " + sum);
                            System.out.println(" 각자리수의 합은 = " + digit);

                            break;
                        }
                    }

                }
                int sssum = sum;

                int ccount = 1;
                if (j%10 == 0) {
                    if (sssum/10 > 10) {
                        sssum = sssum/10;
                        ccount++;
                    }
                    System.out.println("sum = " + sum);
                    System.out.println("정답의 자릿수는 "+ccount+"자릿수 입니다");
                }

//규칙2
                if (count > 0) {
//힌트1
                    System.out.println("sum = " + sum);
                    int sSum = sum;
                    if (sum % 2 != 0) {
                        sSum -= 1;
                    }
                    int ssum = sSum / 2;
                    System.out.println("ssum = " + ssum);
                    for (int k = 1; k <= ssum; k++) {
                        if (ssum % k == 0) {
                            if (k >= 20) {
                                d1[k - 1] = k;
                                measure++;
                                System.out.println("정답이 " + k + "의 배수 입니다");
                            } else if (measure > 4) {
                                break;
                            } else {
                                System.out.println(k + "가 20보다 작습니다");
                            }

                        }
                    }
                    System.out.println("더이상 일치하는 배수는 없습니다.");

//힌트2
                    if (n1[j] == sum || n1[j - 1] == sum || n1[j - 2] == sum || n1[j - 3] == sum || n1[j - 4] == sum) {
                        System.out.println("이전 최근 5턴 중에서 정답이 존재합니다.");
                        n1answerCount++;
                    } else {
                        System.out.println("이전 최근 5턴 중에서 정답이 존재하지 않습니다..");
                    }

                }
                System.out.print(firstGamer + "님이 입력할 번호 : ");
                n1[j] = sc.nextInt();
  // 규칙1
                if (n1[j] == sum) {

                    if (j % 5 == 0 || j % 7 == 0) {
                        if (j % 5 == 0) {
                            System.out.println("오답입니다!");
                            sum += 1200;
                            count++;

                        } else if (j % 7 == 0) {
                            System.out.println("오답입니다!");
                            sum -= 560;
                            count++;

                        } else {
                            System.out.println("정답입니다!! 완벽하십니다!! 멋지세요!!");
                            System.out.println(n[1] + "님 승리!!");
                            break;
                        }


                    }
//1번 게이머
                } else if (n1[j] != sum) {
                    if (n1[j] <= sum) {
                        System.out.println("정답이 " + firstGamer + "님이 입력하신 숫자보다 큽니다.!");

                    } else if (n1[j] >= sum) {
                        System.out.println("정답이 " + firstGamer + "님이 입력하신 숫자보다 작습니다.!");
                    }
                    if (n1answerCount > 0) {
                        j -= 3;
                        if (measure == 1) {
                            sum += 100;
                        } else if (measure == 3) {
                            sum += 360;
                        } else if (measure == 5) {
                            sum += 1700;
                        }

                        if (measure < 3) {
                            j++;
                        }
                        if (n1answerCount > 0) {
                            j += 3;
                        }
                        if (sum >= 2000) {
                            j += 9;
                        }
                        if (sum < 2000) {
                            j-=9;
                        }
                    }

                }

//2번 게이머
                System.out.print(secondGamer + "님이 입력할 번호 : ");
                n2[j] = sc.nextInt();

                if (n2[j] == sum) {
                    System.out.println("정답입니다!! 완벽하십니다!! 멋지세요!!");
                    System.out.println(n[2] + "님 승리!!");
                    break;
                } else if (n2[j] <= sum) {
                    System.out.println("정답이 " + secondGamer + "님이 입력하신 숫자보다 큽니다.!");
                } else if (n2[j] >= sum) {
                    System.out.println("정답이 " + secondGamer + "님이 입력하신 숫자보다 작습니다.!");
                }


            }


        }



        int a=2;

        switch (a){
            case 1:{
                System.out.println("a에 1이 들어있습니다.");
                break;
            }
            case 2:{
                System.out.println("a에 1이 들어있습니다.");
                break;
            }
            case 3:{
                System.out.println("a에 1이 들어있습니다.");
                break;
            }
        }



        int month = 8;
        String monthString = "";
        switch (month) {
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);






 */
public class main221208_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int customer=0;
        int menu1C = 5000;
        int menu2C = 10000;
        int menu3C = 3000;
        int menu4C = 0;

        String menu1N = "장어덮밥";
        String menu2N = "옥수수콘";
        String menu3N = "감자튀김";


        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int sum = 0;
        int menu;

        int con = 1;


        while (true) {
            customer++;
            con = 1;
            System.out.println(customer+"번째 손님입니다.");
            while (con == 1) {
                switch (con){
                    case 1 :
                    case 2 : break;
                }

                System.out.println("1."+ menu1N+menu1C+ " 2."+menu2N+menu2C+ " 3. "+menu3N+menu3C+" 4. 총가격");
                System.out.println("선택할 번호 : ");

                menu = sc.nextInt();

                switch (menu) {

                    case 1:
                        System.out.println("1번 "+menu1N+"을 선택하셨습니다.");
                        menu1++;
                        sum+=menu1C;
                        if (menu1>menu2 && menu1>menu3) {
                            System.out.println("장어덮밥을 많이 주문하셨기에 옥수수콘과 감자튀김은 1개씩 무료로 드립니다.");
                        }
                        break;
                    case 2:
                        menu2++;
                        System.out.println("2번"+menu2N+"을 선택하셨습니다.");
                        sum+=menu2C;
                        if(menu2>menu3 && menu2>menu1) {
                            System.out.println("옥수수콘을 많이 주문하셨기에 감자튀김은 1개씩 무료로 드립니다.");
                        }
                        break;


                    case 3:
                        menu3++;
                        System.out.println("3번"+menu3N+"을 선택하셨습니다.");
                        sum+=menu3C;

                        if (menu3>menu2 && menu3>menu1) {
                            System.out.println("감자튀김을 많이 주문하셨기에 서비스는 없습니다.");
                        }
                        break;

                    case 4:
                        System.out.println("감사합니다 총 가격은"+sum+"입니다");
                        System.out.println("계속 구매하시려면 1번 아니면 2번을 눌러주세요");
                        con = sc.nextInt();
                        switch (con) {
                            case 1:
                                System.out.println("계속진행합니다");;
                            case 2: break;
                        }
                        break;

                }

            }


        }
    }
}









































