public class Source {
    public static void main(String[] args) {
    String str = "Sam Harris";
        System.out.println(abbrevName(str).equals("S.H"));
    }
    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
    }
}
