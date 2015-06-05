import java.util.Scanner;


public class Melting {
    
    private static String[] item = new String[] {
        "Jet Fuel", "Literally Everything Else"
    };
    private static boolean[] canMelt = new boolean[] {
        false, true
    };
    
    public static boolean get(String s) {
        boolean k = false;
        for (int i = 0; i < item.length; i++) {
            if (s.equalsIgnoreCase(item[i]))
                k = canMelt[i];
        }
        return k;
    }

    static Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Item that you think can melt steel beams?");
        String thing = in.nextLine();
        String newThing = thing;
        if (!thing.equalsIgnoreCase("Jet Fuel"))
            newThing = "Literally Everything Else";
        if (get(newThing))
            System.out.println(thing + " can melt steel beams.");
        else if (!get(newThing))
            System.out.println(thing + " can't melt steel beams.");
    }
}
