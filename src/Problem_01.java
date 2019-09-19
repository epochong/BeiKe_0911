import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author epochong
 * @date 2019/9/11 21:08
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe 最小代价
 */
public class Problem_01 {
    public static void main(String[] args) {
        TreeSet<String> strings = new TreeSet <>();
        Scanner input = new Scanner(System.in);;
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            strings.add(input.next());
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s :
                strings) {
            stringBuilder.append(s);
        }
        System.out.println(stringBuilder.toString());
    }
}
