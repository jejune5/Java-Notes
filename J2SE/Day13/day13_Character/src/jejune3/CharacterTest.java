package jejune3;

import java.util.Scanner;

/*
 * 统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 *
 * 分析：
 * 		A:定义三个统计变量。
 * 			int bigCont=0;
 * 			int smalCount=0;
 * 			int numberCount=0;
 * 		B:键盘录入一个字符串。
 * 		C:把字符串转换为字符数组。
 * 		D:遍历字符数组获取到每一个字符
 * 		E:判断该字符是
 * 			大写	bigCount++;
 * 			小写	smalCount++;
 * 			数字	numberCount++;
 * 		F:输出结果即可
 */
public class CharacterTest {
    public static void main(String[] args) {
        // 定义三个统计变量。
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        // 键盘录入一个字符串。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        // 把字符串转换为字符数组。
        char[] chs = line.toCharArray();

        // 历字符数组获取到每一个字符
        for (int x = 0; x < chs.length; x++) {
            char ch = chs[x];

            // 判断该字符
            if (Character.isUpperCase(ch)) {
                bigCount++;
            } else if (Character.isLowerCase(ch)) {
                smallCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            }
        }

        // 输出结果即可
        System.out.println("大写字母：" + bigCount + "个");
        System.out.println("小写字母：" + smallCount + "个");
        System.out.println("数字字符：" + numberCount + "个");
    }
}

/*
I:\Java\jdk-10.0.2\bin\java.exe "-javaagent:E:\IntelliJ IDEA 2018.2\lib\idea_rt.jar=8600:E:\IntelliJ IDEA 2018.2\bin" -Dfile.encoding=UTF-8 -classpath I:\Java\J2SE\Day13\day13_Character\out\production\day13_Character jejune3.CharacterTest
请输入一个字符串：
WuJunJie599
大写字母：3个
小写字母：5个
数字字符：3个

Process finished with exit code 0

 */