package org.ICA8;
import java.io.*;
import java.util.*;
public class Operations {
    public String getString_keyboard(){
        System.out.println("Enter the available and occupied urinals");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        return str;
    }
    public ArrayList<String> getString_file(){
        ArrayList<String> str=new ArrayList<>();
        try {
            File f = new File("./src/main/resources/urinals.txt");
            BufferedReader in = new BufferedReader(new FileReader(f));
            String line=in.readLine();
             while(line!=null){
                 str.add(line);
                 line=in.readLine();
             }
        }
        catch (IOException e){
            e.getStackTrace();
        }
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
//    public boolean validateString(String str){
//        if(str==""||str==null)
//            return false;
//
//        for(int i=1;i<str.length()-1;i++){
//            if(str.charAt(i)=='1'){
//                if(str.charAt(i-1)=='1' || str.charAt(i+1)=='1')
//                    return false;
//            }
//        }
//        return true;
//    }
}
