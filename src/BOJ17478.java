import java.util.Scanner;

 class Main {

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         int N = sc.nextInt();

         System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
         f(N, 0);
         System.out.print("라고 답변하였지.");

         sc.close();
     }

     public static void f(int N,int count){
         _print(count);
         System.out.println("\"재귀함수가 뭔가요?\"");
     if(N==0){
         _print(count);
         System.out.println("\"재귀함수는 자기 자신을 호출하는 함수라네\"");
         return;
     }
     _print(count);
         System.out.println("\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
         _print(count);
         System.out.println("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
         _print(count);
         System.out.println("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
      f(--N,++count);
      _print(count);
         System.out.println("라고 답변하였지.");
     }

     public static void _print(int count){
         for(int i=0;i<count;i++){
             System.out.printf("____");
         }
     }
 }


