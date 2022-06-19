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
    }
}
