/**
 * @author ocly
 * @date 2018/2/24 9:04
 */
public class NiuKe2 {
    /**
     * 牛牛从生物科研工作者那里获得一段字符串数据s,牛牛需要帮助科研工作者从中找出最长的DNA序列。DNA序列指的是序列中只包括'A','T','C','G'。牛牛觉得这个问题太简单了,就把问题交给你来解决。
     * 例如: s = "ABCBOATER"中包含最长的DNA片段是"AT",所以最长的长度是2。
     */

    public static void main(String[] args) {
    }

    public static void changeNum(String str){

        int num = 0;
        for (int i = 0; i < str.length()-1;) {
            char c = str.charAt(i);
            System.out.println(c);
            if(c=='A'||c=='T'||c=='C'||c=='G'){
                i = i + 2;
                num++;
            }else {
                i++;
            }
        }
    }
}
