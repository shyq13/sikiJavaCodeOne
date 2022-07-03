/**
    @author shyq13
 */
public class Code23 {
    public static void main( String[] args ) {
        // 字符串 —— 如何表示字符串


        // 1. 字符串常量及字符串变量

        // （1） 字符串常量
        System.out.println( "Hello World!  （我是一个字符串常量）" );
        // 以上用双引号（""）包起来的内容就叫字符串    ↑      ↑
        // 例如： "微博"   "密码"   "666"  这些都叫字符串


        System.out.println("\n-----------------------------------------------------\n");

        // （2） 字符串变量

        // 定义的第一种方式：
        String str1 = "Hello World!  （我是一个字符串变量）";
        // 定义一个str1变量，并直接赋值为"Hello World!  （我是一个字符串变量）"

        // 定义的第二种方式：
        String str2 = new String( "Hello World!  （我也是一个字符串变量）" );
        // 定义一个str2变量，并赋值为一个新的字符串类，内容是"Hello World!  （我也是一个字符串变量）"


        String str3 = "Hello";
        String str4 = "World";


        // 2. 字符串变量的访问
        System.out.println( "str1的值是" + str1 );
        System.out.println( "str2的值是" + str2 );
        System.out.println( "str3和str4拼接起来的结果是" + str3 + " " + str4 );
        // 字符串变量也可以像常量一样使用
    }
}
