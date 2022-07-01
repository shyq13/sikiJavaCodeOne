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


        System.out.println("\n-----------------------------------------------------\n");


        // 7. 用编程回答《九章算术》中的“百钱买百鸡”问题：

        int count = 0;
        // 进行计数 —— 符合"百钱买百鸡"情况的数量
        for(int i = 0; i <= 20; i++){
            // 1. 公鸡最多可以买20只，所以第一步：遍历买的公鸡数量
            for(int j = 0; j <= ((100 - i * 5) / 3); j++){
                // 2. 用总钱数减去买公鸡用的钱，得出母鸡剩余的钱数，用于遍历母鸡
                // 3. 由于100钱必须全部用完，所以小鸡就没必要再次进行循环了

                int k = (100 - i * 5 - j * 3) * 3;
                // 计算购买小鸡的数量

                if(i + j + k == 100){
                    count++;
                    System.out.print("第" + count + "种解决方案；");
                    System.out.println("公鸡：" + i + "只，母鸡：" + j + "只，小鸡：" + k + "只");
                    // 符合情况后，计数器进行自增
                }
            }
        }
        System.out.println("符合“百钱买百鸡”情况的总数是：" + count + "次");
        // 进行输出


        System.out.println("\n-----------------------------------------------------\n");


        // 8. 输出所有“水仙花数”
        System.out.print("“水仙花数”有：");

        for(int i = 100;i < 1000;i++){
            int unit = i % 10;
            int decade = (i % 100) / 10;
            int hundredsPlace = i / 100;
            // 取得各个位数的数字

            int sum = (unit * unit * unit) +
                        (decade * decade * decade) +
                        (hundredsPlace * hundredsPlace * hundredsPlace);
            // 取得个位数立方的和
            if(sum == i){
                System.out.print(i + " ");
            }
        }
    }
}
