package Code14;

public class Code14 {
    public static void main(String[] args) {
        // while循环

        // while循环的写法：
        /*
        while(循环条件) {
            循环体
        }
         */
        // 例如：
        int i = 1;

        while(i <= 10) {
            System.out.println("创建" + i + "个敌人");
            i++;
            // 进行变量自增，避免死循环
        }


        System.out.println("\n-------------------------------------------------\n");

        i = 10;
        while(i >= 1){
            System.out.println("创建" + (11 - i) + "个敌人");
            i--;
            // 也可以使用变量自减控制循环次数
        }

        /*
        while(true){
            System.out.println("创建敌人");
        }
         */
        // 在平时写代码的时候，尽量避免这种死循环，因为它会导致程序的卡顿，甚至崩溃


        System.out.println("\n-------------------------------------------------\n");


        // 小练习：输出1-100之间所有数的和
        int sum = 0;
        i = 1;
        while(i <= 100){
            sum += i;
            i++;
        }
        System.out.println("1-100之间的数的和为：" + sum);
    }
}
