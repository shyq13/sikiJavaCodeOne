package Code15;

public class Code15 {
    public static void main(String[] args) {
        // do-while循环

        // do-while循环的写法：
        /*
        do {
            循环体;
        } while (循环条件);
        */
        // 例如：

        int i = 0;
        do {
            System.out.println("创建了" + (i + 1) + "个敌人");
            i++;
        } while (i < 10);
        // 由于do-while循环是先执行，后判断，所以需要使用 < 而不是 <=

        // 更直观的看出while和do-while循环的区别：
        // while循环：
        i = 1;
        while (i <= 0){
            System.out.println("我是while循环输出的内容");
        }

        // do-while循环：
        i = 1;
        do {
            System.out.println("我是do-while循环输出的内容");
        } while (i <= 0);

        // 最后只有do-while循环输出了内容，而while循环没有输出内容


        System.out.println("\n----------------------------------------\n");


        // 任务：使用do-while循环输出1-100之间所有数的和

        int sum = 0;
        i = 1;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("1-100之间的数的和为" + sum);
    }
}
