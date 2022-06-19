package Code;

public class Code {
    public static void main(String[] args) {
        // for循环

        // for循环写法：
        /*
        for (初始化语句; 条件表达式; 更新语句) {
            循环体;
        }
         */

        // 例如：
        for (int i = 0; i < 10; i++){
            System.out.println("创建了" + (i + 1) + "个敌人");
        }


        System.out.println("\n-------------------------------------------\n");


        // 或者：
        int j;
        for(j = 0; j < 10; j++){
            System.out.println("创建了" + (j + 1) + "个敌人");
        }


        System.out.println("\n-------------------------------------------\n");


        // 甚至可以这样写：
        int k = 0;
        for(; k < 10; k++){
            System.out.println("创建了" + (k + 1) + "个敌人");
        }


        System.out.println("\n-------------------------------------------\n");


        // 大括号也可以省去：
        for(int l = 0; l < 10; l++)
            System.out.println("创建了" + (l + 1) + "个敌人");


        System.out.println("\n-------------------------------------------\n");


        // 任务：输出1-100之间的偶数

        // 第一种方法：
        System.out.print("1-100之间的偶数有：");
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }


        System.out.println("\n\n-------------------------------------------\n");


        // 第二种方法：
        System.out.print("1-100之间的偶数有：");
        for(int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }


        // 注意：在for循环的初始化语句中定义的变量不能在for循环外部使用
        /*
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }
        System.out.println(i);  // 报错
         */


        System.out.println("\n\n-------------------------------------------\n");


        // 拓展：for循环的嵌套
        int i;
        for(i = 0; i < 10; i++){
            for(j = 0; j < 10; j++){
                System.out.println("创建第" + (i + 1) + "批第" + (j + 1) + "个敌人");
            }
            System.out.println("\n第" + (i + 1) + "批敌人全部创建完毕\n");
        }
    }
}