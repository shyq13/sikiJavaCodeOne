package Code;

public class Code1 {
    public static void main( String[] args ) {
        // 练习1
        // 任务：输出1-100的累加值，但是跳过个位数为3的数字
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            if(i % 10 != 3){
                sum += i;
            }
        }
        System.out.println("1-100的累加值（跳过个位数为3的数字）是" + sum);


        System.out.println("\n-----------------------------------------------------\n");


        // 练习2
        // 任务：观察下面式子，找出规律，并进行输出：
        // 2 * 5 = 10
        // 4 * 10 = 40
        // 6 * 15 = 90
        // ……
        // ? * 100 = ?
        for(int i = 1;i < (((100 / 5) * 2 + 2) / 2);i++){
            int a = i * 2;
            int b = i * 5;
            System.out.println(a + " * " + b + " = " + a * b);
        }


        System.out.println("\n-----------------------------------------------------\n");


        // 练习3
        // 任务：一张纸的厚度是0.08mm，要对着多少次之后才能达到珠穆朗玛峰(8848.86m)的高度？
        int float_ = 1;
        double height = 0;
        for(int i = 1;;i++){

            if(height >= 8848.86){
                System.out.println("一张纸对折" + i + "次之后才能达到珠穆朗玛峰的高度");
                break;
            }

            float_ *= 2;
            height += (float_ * 0.00008);
        }
    }
}
