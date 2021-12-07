import java.util.Locale;

public class UsingString {
    public static void main(String[] args) {
        String a = "hello";
        String b = new String("hello");
        System.out.println(a.equals(b)); //true
        System.out.println(a == b); //false

        String c = "My name is Minggu.";
        System.out.println(c.indexOf("Minggu")); // Minggu 라는 문자열은 11번째 문자부터 시작된다.
        System.out.println(c.replaceAll("Minggu","Yang")); //Minggu 를 Yang 으료 대체하여 출력한다.
        System.out.println(c.substring(0, 8)); // 문자열 0번째부터 8번째까지만 출력한다.
        System.out.println(c.toUpperCase()); // 모든 문자들을 대문자로 변환하여 출력한다.
    }
}
