package org.ICA8;
import java.util.*;

public class Urinals {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Operations op=new Operations();
        ArrayList<String> inputstr=new ArrayList<>();
        System.out.println("choose one form for input string:\n1.keyboard\n2.File.");
        int option = sc.nextInt();
        if(option==1) {
            while(true) {
                String str=op.getString_keyboard();
                if(str.equals("-1"))
                    break;
                else {
                    inputstr.add(str);
                    op.evaluateString(inputstr, option);
                }
            }
        }
        else if(option==2) {
            inputstr = (op.getString_file());
            op.evaluateString(inputstr,option);
        }
        else
            System.out.println("Wrong input,please try again");

    }
}
