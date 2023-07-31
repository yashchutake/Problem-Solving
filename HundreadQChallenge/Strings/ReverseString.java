package HundreadQChallenge.Strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] s={'h','e','l','l','o'};
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
        }
        System.out.println(s);
    }
}
