package org.ICA8;
import java.util.*;

public class Urinals {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        Operations op=new Operations();

            System.out.println("choose one form to input the string:\n1.keyboard\n2.File");
            int option=sc.nextInt();
            String inputstr="";
            if(option==1)
                inputstr = op.getString_keyboard();
            else
                inputstr=op.getString_keyboard();

        if (op.checkString(inputstr)){
            System.out.println("Entered occupancy input format is correct");
        }
        else{
            System.out.println(-1+" Entered occupancy input format is incorrect");
        }

    }
}
