package Code12;

public class Code12 {
    public static void main(String[] args) {
        // if语句

        // if的三种写法：
        /*
        第一种：
        if (条件) {
            // 只有当条件为true时，才会执行语句块
            执行语句;
        }
        */
        /*
        第二种：
        if (条件) {
            执行语句;
        } else {
            // 当if语句的条件为false时，执行else语句块
            执行语句;
         */
        /*
        第三种：
        if (条件) {
            执行语句;
        } else if (条件) {
            // 当if语句的条件为false，且else if语句的条件为true时，执行else if语句块
            执行语句;
        } else {
            执行语句;
        }
         */
        // 例：
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > 7){
            System.out.println("a大于7");
        }


        if(b < 10){
            System.out.println("b小于10");
        }else{
            System.out.println("b大于等于10");
        }


        if(c < 25){
            System.out.println("c小于25");
        }else if(c > 25){
            System.out.println("c大于25");
        }else{
            System.out.println("c等于25");
        }


        // 也可以使用多个else if语句
        if(c <= 10){
            System.out.println("c小于等于7");
        }else if(c <= 20){
            System.out.println("c小于等于20且大于10");
        }else if(c <= 30){
            System.out.println("c小于等于30且大于20");
        }else{
            System.out.println("c大于30");
        }

    }
}
