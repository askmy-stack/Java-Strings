import java.util.Scanner;

class Practice {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String pat=s.nextLine();
        for(int i=0;i<str.length()-pat.length()+1;i++){
            if(str.substring(i,i+pat.length()).equals(pat)){
                System.out.print(i+" ");
            }
        }
    }
}
