public class P1 {

    public static void main(String[] args) {
        String t1 = "You are everything";

        String t2 = t1.toUpperCase();
        System.out.println(t2);
        System.out.println(t1.toLowerCase());

        int i = t1.length();
        System.out.println(i);

        char e = t1.charAt(9);
        System.out.println(e);

        System.out.println(t1.isBlank());

        String t3 = t1.concat(" to me");
        System.out.println(t3);

    }
}
