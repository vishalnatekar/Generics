import java.util.*;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */
        if(string==null){
            string="NPE!";
            System.out.println(string);
        }else {

            System.out.println(string.toLowerCase());
        }
    }
}