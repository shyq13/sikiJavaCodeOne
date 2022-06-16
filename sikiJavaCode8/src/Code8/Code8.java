package Code8;

public class Code8 {
    public static void main( String[] args ){
        // 逻辑运算符

        // 常见逻辑运算符
        // && 短路 和
        // || 短路 或
        // ! 非
        // ^ 异或
        // ! 取反（非运算）
        // | 或
        // & 与

        // 示例：
        int age = 80;
        boolean isAdult = age >= 18;
        boolean isWrinkly = age >= 25 && age <= 35;  // 由于两个条件需要同时满足，所以需要使用逻辑运算符&&（与）

        System.out.println("他是否是成年人？" + isAdult);
        System.out.println("他是否是中年人？" + isWrinkly);


        System.out.println("\n-----------------------------------------------------\n");


        boolean isCanNotPlay = age <= 17 || age >= 80;  // 两个条件满足其一即可，所以使用逻辑运算符||（或）

        System.out.println("他是否不能玩这个游戏？" + isCanNotPlay);
        System.out.println("他是否能玩这个游戏？" + (!isCanNotPlay));


        System.out.println("\n-----------------------------------------------------\n");


        // 其余的逻辑运算符示例：
        int a = 8, b = 3, c = 9;
        boolean d = true, e = false;

        // &&运算符需要两个条件都为true才返回true，否则返回false
        System.out.println("a > b && b > c 的结果是" + (a > b && b > c));  // 结果：false
        System.out.println("a > b && b < c 的结果是" + (a > b && b < c));  // 结果：true
        System.out.println("a < b && b > c 的结果是" + (a < b && b > c));  // 结果：false
        System.out.println("a < b && b < c 的结果是" + (a < b && b < c));  // 结果：false


        System.out.println("\n-----------------------------------------------------\n");


        // ||运算符需要两个条件都为false才返回false，否则返回true
        System.out.println("a > b || b > c 的结果是" + (a > b || b > c));  // 结果：true
        System.out.println("a > b || b < c 的结果是" + (a > b || b < c));  // 结果：true
        System.out.println("a < b || b > c 的结果是" + (a < b || b > c));  // 结果：false
        System.out.println("a < b || b < c 的结果是" + (a < b || b < c));  // 结果：true


        System.out.println("\n-----------------------------------------------------\n");


        // ^运算符需要两个条件一个为true，另一个条件为false时才返回true，否则返回false
        System.out.println("a > b ^ b > c 的结果是" + (a > b ^ b > c));  // 结果：true
        System.out.println("a > b ^ b < c 的结果是" + (a > b ^ b < c));  // 结果：false
        System.out.println("a < b ^ b > c 的结果是" + (a < b ^ b > c));  // 结果：false
        System.out.println("a < b ^ b < c 的结果是" + (a < b ^ b < c));  // 结果：true


        System.out.println("\n-----------------------------------------------------\n");


        // !运算符即将true变成false，false变成true
        System.out.println("对d取反的结果是" + (!d));  // 结果：false
        System.out.println("对e取反的结果是" + (!e));  // 结果：true


        System.out.println("\n-----------------------------------------------------\n");


        // 拓展：短路的作用
        // 在平时使用的时候其实是看不出区别的，如下：
        System.out.println("a > b & b > c 的结果是" + (a > b & b > c));  // 结果：false
        System.out.println("a > b & b < c 的结果是" + (a > b & b < c));  // 结果：true
        System.out.println("a < b & b > c 的结果是" + (a < b & b > c));  // 结果：false
        System.out.println("a < b & b < c 的结果是" + (a < b & b < c));  // 结果：false

        System.out.println("\n-----------------------------------------------------\n");

        // 以上代码的结果与&&的结果相同
        // 那它们到底有什么区别呢？
        // 请看下面的例子：
        int f = 10, g = 10, h = 10, i = 10;

        System.out.println("f > 20 & (++g) > 10 的结果是" + (f > 20 & (++g) > 10));
        System.out.println("执行完上面的语句后，g的值是" + g);  // 结果：11

        System.out.println("\n-----------------------------------------------------\n");

        System.out.println("h > 20 && (++i) > 10 的结果是" + (h > 20 && (++i) > 10));
        System.out.println("执行完上面的语句后，i的值是" + i);  // 结果：10
        // 为什么两次的结果不一样呢？
        // 因为普通的&会把两个条件都求出来，然后再进行判断，
        // 而&&判断出来第一个条件为false，就知道结果一定为false，不需要再求第二个条件，所以第二个条件不会进行运算
    }
}
