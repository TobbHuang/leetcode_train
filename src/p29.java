/**
 * Created by huangtao on 2018/11/10.
 */
public class p29 {

    public int divide(int dividend, int divisor) {
        if(dividend == 0){
            return 0;
        }

        if(dividend == -Math.pow(2, 31) && divisor == -1){
            return (int)Math.pow(2, 31) ;
        }

        if(divisor == 1){
            return dividend;
        } else if(divisor == -1){
            return -dividend;
        }

        int symbol = dividend < 0 ^ divisor < 0 ? -1 : 1;

        long ldividend = Math.abs((long)dividend);
        long ldivisor = Math.abs((long)divisor);

        int result = 0;
        while(ldividend >= ldivisor){
            long tmp = ldivisor;
            long num = 1;

            while(ldividend >= tmp << 1){
                tmp <<= 1;
                num <<= 1;
            }

            result += num;
            ldividend -= tmp;
        }

        return result * symbol;
    }

}
