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
            File f = new File("./src/main/resources/urinal.txt");
            if(!fileExist(f))
                System.out.println("File is not present");
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
    public boolean fileExist(File f){
        if(f.exists())
            return true;
        return false;
    }
    public void writeFile(ArrayList<String> str){
        try{
            String file="Rule";
            File f = new File("./src/main/resources/"+file+".txt");
            if(fileExist(f)){
                int i=1;
                do{
                    if(!file.equals("Rule"))
                        file=file.substring(0,4);
                    file = file + String.valueOf(i);
                    f=new File("./src/main/resources/"+file+".txt");
                    i++;
                    if(fileExist(f))
                        continue;
                    else{
                        f.createNewFile();
                        break;
                    }

                }while(true);
            }
            else{
                f.createNewFile();
            }
            BufferedWriter bw=new BufferedWriter(new FileWriter(f));
            int i=0;
            while(i<str.size()){
                bw.write(str.get(i)+"\n");
                i++;
            }
            bw.close();
        }
        catch (IOException e){
            e.getStackTrace();
        }
    }
    public boolean checkString(String str){
        if(str==""||str==null)
            return false;
        if(str.length()>20)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='0'&& str.charAt(i)!='1') {
                return false;
            }
        }
        return true;
    }
    public boolean validateString(String str){
        if(str==""||str==null)
            return false;

        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)=='1'){
                if(str.charAt(i-1)=='1' || str.charAt(i+1)=='1')
                    return false;
            }
        }
        return true;
    }
    public void evaluateString(ArrayList<String> inputstr, int option){
        Operations op=new Operations();
            if (option == 2) {
                ArrayList<String> sr=new ArrayList<>();
                for (int i = 0; i < inputstr.size(); i++) {
                    if (op.checkString(inputstr.get(i)) && op.validateString(inputstr.get(i))) {
                        //System.out.println("Input String is Formatted and Validated");
                        int count = op.countUrinals(inputstr.get(i));
                        sr.add(String.valueOf(count));
                    } else {
                        sr.add(String.valueOf(-1));
                    }
                }
                op.writeFile(sr);
            }
            else if(option==1){
                if (op.checkString(inputstr.get(0)) && op.validateString(inputstr.get(0))) {
                    //System.out.println("Input String is Formatted and Validated");
                    int count = op.countUrinals(inputstr.get(0));
                    System.out.println(count);
                } else {
                    System.out.println(-1);
                }
            }
    }
    public int countUrinals(String str){
        int count=0;
        char[] ch=str.toCharArray();
        if(ch[0]=='0'){
            if(ch.length>1 && ch[1]=='0'){
                ch[0]='1';
                count++;
            }
            if(ch.length==1) {
                ch[0] = '1';
                count++;
            }
        }
        for(int i=1;i<ch.length-1;i++){
            if(ch[i]=='0'){
                if(ch[i-1]=='0' && ch[i+1]=='0')
                    ch[i]='1';
                else if(ch[i-1]=='1' && ch[i+1]=='0'&& i+1==ch.length-1)
                    ch[i+1]='1';
                else
                    continue;
                count++;
            }
        }
        return count;
    }

}
