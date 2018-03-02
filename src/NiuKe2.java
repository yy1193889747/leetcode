/**
 * @author ocly
 * @date 2018/2/24 9:04
 */
public class NiuKe2 {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
     */

    public static void main(String[] args) {
        System.out.println(changeNum(5));
    }

    public static int changeNum(int number){

        return  1<<--number;
    }
}
