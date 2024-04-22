import java.util.*;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("wprowadzenie - konczy pentle");
        Set<String> imiona = new HashSet<String>();
        String imie = " ";

        while (!imie.equals("-")) {
            System.out.println("podaj imiona");
            imie = sc.next();
            imiona.add(imie);
        }
        imiona.remove("-");
        for (String imiee : imiona){
            System.out.println(imiee);
        }
        System.out.println(imiona.size());


    }
}