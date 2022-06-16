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

        int k = 10;
        int l = 10;
        System.out.println("k等于l的结果是" + (k == l)
            + "，k不等于l的结果是" + (k != l));

        // 字符也可以进行比较，但是注意，比较的内容是ASCII码，而不是字符本身
        char m = 'a';
        char n = 'b';
        boolean o = m >= n;
        boolean p = m <= n;
        System.out.println("m的ASCII码大于等于n的结果是" + o
                + "，m的ASCII码小于等于n的结果是" + p);


        System.out.println("\n---------------------------------------------\n");


        // 插入小知识点：如何知道某个字符对应的ASCII码呢？
        int q = 'a';    // 定义一个int类型的变量q，其值其实就是字符a的ASCII码
        System.out.println("字符a的ASCII码是" + q);
    }
}
