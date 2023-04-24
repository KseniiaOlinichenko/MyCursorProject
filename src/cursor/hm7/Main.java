package cursor.hm7;

public class Main {
    public static void main(String[] args) {
    OperationsWithString myStr = new OperationsWithString("Кохайтеся, чорнобриві, Та не з москалями, Бо москалі — чужі люде, Роблять лихо з вами. Москаль любить жартуючи, Жартуючи кине; Піде в свою Московщину, А дівчина гине.");
    myStr.checkString();
        System.out.println(myStr);
        System.out.println("Counting of letters: " + myStr.getMyString());
        System.out.println("Total amount of letters in string are " + myStr.letterCount());
        System.out.println("Total amount of spaces in string are " + myStr.countSpace());
        System.out.println("Total amount of digits in string are " + myStr.countDigits());
        System.out.println("Total amount of symbols in string are " + myStr.countSymbols());
    }
}
