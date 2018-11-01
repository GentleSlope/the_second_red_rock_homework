package Main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class StringTools  {
    private String str;

    public StringTools(String str) {
        this.str = str;
    }

    public void JudgeNumber() {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            int chr = str.charAt(i);
            if (chr < 48 || chr > 57)
                flag = false;
        }
        String resault = flag ? "字符串由纯数字组成" : "字符串并非纯数字组成";
        System.out.println(resault);
    }
    public boolean JudgeCharacter() {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            int chr = str.charAt(i);
            if (chr < 48 || chr > 57)
                flag = false;
        }
        return flag;
    }

    public void JudgeUpper() {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            int chr = str.charAt(i);
            if (chr < 65 || chr > 90)
                flag = false;
        }
        String resault = flag ? "字符串全为大写" : "字符串并非全为大写";
        System.out.println(resault);

    }

    public void JudgeLower() {
        boolean flag = true;
        for (int i = 0; i < str.length(); i++) {
            int chr = str.charAt(i);
            if (chr < 65 || chr > 90)
                flag = false;
        }
        String resault = flag ? "字符串全为小写" : "字符串并非全为小写";
        System.out.println(resault);


    }

    public void Lower() {
        boolean flag = this.JudgeCharacter();
        if (!flag) {
            for (int i = 0; i < str.length(); i++) {
                int chr = str.charAt(i);
                if (chr > 65 && chr < 90)
                    chr += 32;

            }
            System.out.println("------------This string is all alphabetic, all converted to capitalization.-----------");
        }
    }

    public void Sort() {
        boolean flag = this.JudgeCharacter();
        if (flag) {
            int arr[] = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                arr[i] = str.charAt(i) - '0';
            }

            for (int j = 0; j < str.length(); j++) {
                for (int b = j; b < str.length(); b++) {
                    int min = arr[j];
                    if (arr[b] < arr[j]) {
                        int temp = arr[j];
                        arr[j] = arr[b];
                        arr[b] = temp;
                    }
                }

            }
            System.out.print("纯数字数组排序完成：");
            for (int i = 0; i < str.length(); i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public void StrSort (){
        boolean flag = this.JudgeCharacter();
        if (!flag) {

        }
        }
    }



    class handle {
        public static void main(String[] args) {
            String str = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
            String strin[] = str.split(",");
            for (int i = 0; i < strin.length; i++) {
                System.out.printf("此时开始判断strin[%d]!!!\n", i);
                StringTools STools = new StringTools(strin[i]);
                STools.JudgeNumber();
                STools.JudgeUpper();
                STools.JudgeLower();
                STools.Lower();
                STools.Sort();
                STools.StrSort();
                System.out.println("\n\n");
            }
        }

    }

