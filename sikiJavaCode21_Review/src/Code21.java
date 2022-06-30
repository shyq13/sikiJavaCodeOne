import java.util.Scanner;

public class Code21 {
    public static void main(String[] args) {
        // 练习题（2）

        // 5. 让用户输入一个字母，如果是小写字母，则输出对应的大写字母
        Scanner s1 = new Scanner(System.in);
        System.out.print("请输入一个字母：");
        char a = s1.next().charAt(0);
        if ((int) a >= 97 && (int) a <= 122) {
            a = (char) ((int) a - 32);
        }
        System.out.println("a的大写字母是：" + a);


        System.out.println("\n-----------------------------------------------------\n");


        // 6. 输出200 ~ 500之间所有的质数
         for(int j = 200;j <= 500;j++){
            boolean isSu = true;
            for(int i = 2;i <= j - 2;i++){
                if(j % i == 0){
                    isSu = false;
                }
            }
            if(isSu){
                System.out.print(j + " ");
            }
         }
    }
}
