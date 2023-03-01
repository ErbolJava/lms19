import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("""
                    
                    earth||pluto||mars||uranus||saturn||venus||jupiter||neptune||mercury
                                         choose one and print
                    """);
            String a = new Scanner(System.in).nextLine();
            System.out.println("\n");
            for (Planets p : Planets.values()) {
                if (a.equalsIgnoreCase(p.name()))
                    System.out.println(p.name() + " - " + p.getDescription());
            }
        }
    }
}
