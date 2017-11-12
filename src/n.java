import java.math.BigInteger;


/**
 * Created by Duan Guanhua on 9/8/2017.
 */
public class n {
    public static void main(String[] args) {
        BigInteger integer = new BigInteger("2000");
        BigInteger equal = function(integer);
        System.out.println(" = " + equal);
        System.out.println("the length = " + equal.bitLength());
        System.out.println("the length = " + equal.bitLength());
    }

    public static BigInteger function(BigInteger i) {
        BigInteger zero = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        if (i.compareTo(zero) < 0) {
            System.out.println("The number is min 0");
            return zero;
        } else if (i.compareTo(zero) == 0) {
            System.out.println("1");
            return one;
        } else {
            //System.out.printf("* 测试");
            return i.multiply(function(i.subtract(one)));
        }
    }
}
