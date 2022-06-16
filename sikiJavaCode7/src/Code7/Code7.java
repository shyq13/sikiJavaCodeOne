package Code7;

public class Code7 {
    public static void main( String[] args ){
        // 比较运算符

        // 常见比较运算符：
        // == ：等于
        // != ：不等于
        // > ：大于
        // < ：小于
        // >= ：大于等于
        // <= ：小于等于
        // 注意区分=和==的写法

        // 示例：
        int a = 10;
        int b = 20;
        boolean c = a >= b;
        boolean d = a <= b;
        System.out.println("a大于等于b的结果是" + c + "，a小于等于b的结果是" + d);

        int e = 10;
        int f = 10;
        boolean g = e == f;
        boolean h = e != f;
        System.out.println("c等于d的结果是" + g + "，c不等于d的结果是" + h);

        // 或者可以直接输出：
        int i = 11;
        int j = 10;
        System.out.println("i大于等于j的结果是" + (i >= j)
            + "，i小于等于j的结果是" + (i <= j));
    }
}
