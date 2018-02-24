/**
 * @author ocly
 * @date 2018/2/24 9:04
 */
public class NiuKe1 {
    /**
     * 输入包括一行,一个字符串S,字符串长度length(1 ≤ length ≤ 10),字符串中每个字符串都是'R', 'G', 'B'或者'Y'。
     * 输出一个整数,表示牛牛最少需要换掉的瓷砖数量
     *
     * RRRRRR
     * 3
     */

    public static void main(String[] args) {
        System.out.println(changeNum("RRRRRR"));
    }

    public static int changeNum(String str){

        int num = 0;
        System.out.println(str.length());
        for (int i = 0; i < str.length()-1;) {
            char c = str.charAt(i);
            char d = str.charAt(i + 1);
            System.out.println(c);
            if(c==d){
                i = i + 2;
                num++;
            }else {
                i++;
            }
        }
        return num;
    }
}
