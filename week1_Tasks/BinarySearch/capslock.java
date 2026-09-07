import java.util.Scanner;

public class capslock{
    public static void main(String[] args) {
        String str = "hello world";

        String upper = str.chars()
                          .mapToObj(c -> String.valueOf((char) c).toUpperCase())
                          .reduce("", String::concat);

        System.out.println(upper);
    }

}
