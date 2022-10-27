package org.ICA8;
import java.util.*;

public class Urinals {
    public static void main(String args[]){

        Scanner sc=new Scanner(System.in);
        Operations op=new Operations();

            System.out.println("choose one form to input the string:\n1.keyboard\n2.File");
            int option=sc.nextInt();
            ArrayList<String> inputstr=new ArrayList<>();
            if(option==1)
                inputstr.add(op.getString_keyboard());
            else
                inputstr.add(op.getString_keyboard());
        for(int i=0;i<inputstr.size();i++) {
            if (op.checkString(inputstr.get(i)) /*&& op.validateString(inputstr.get(i))*/){
                System.out.println("Entered occupancy input is formatted and validated");
            } else {
                System.out.println(-1 + " Entered occupancy input is incorrect");
            }
        }
    }
}
