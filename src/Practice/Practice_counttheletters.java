package Practice;

public class Practice_counttheletters {

    public static void main(String[] args) {
        // calculate no.of 'a' letters and count of others
        String name = "java program!";
        int a1 =0;
        int others =0;

        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);

            if(ch=='a'){
                a1++;
            }
            else{
                others++;

            }
            System.out.println("No.of a :" + a1);
            System.out.println("No.of others :" + others);
        }
    }
}
