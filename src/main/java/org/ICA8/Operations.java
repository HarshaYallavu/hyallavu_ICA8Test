package org.ICA8;
import java.util.*;
public class Operations {
    public String getString_keyboard(){
        System.out.println("Enter the available and occupied urinals");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        return str;
    }
    public String getString_file(){
        //System.out.println("Enter the available and occupied urinals");
        //Scanner sc=new Scanner(System.in);
        String str="";
        return str;
    }
    public boolean checkString(String str){
        if(str==""||str==null)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'&& str.charAt(i)!='1') {
                return false;
            }
        }
        return true;
    }
}
