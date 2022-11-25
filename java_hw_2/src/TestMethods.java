public class TestMethods {
    public static void main(String[] args) {
//        test1(); //char charAt(int index). Возвращает символ по указанному индексу.
//        test2(); //int compareTo(Object o). Сравнивает данную строку с другим объектом.
//        test3(); //int compareToIgnoreCase(String str). Сравнивает две строки лексически, игнорируя регистр букв.
//        test4(); //String concat(String str). Объединяет указанную строку с данной строкой путем добавления ее в конце.
//        test5(); //boolean contentEquals(StringBuffer sb). Возвращает значение true только в том случае,
//        // если эта строка представляет собой ту же последовательность символов,
//        // как указанно в буфере строки (StringBuffer).
//        test6(); // static String copyValueOf(char[] data). Возвращает строку, которая представляет собой
//        // последовательность символов, в указанный массив.
//        test7(); // boolean endsWith(String suffix). Проверяет заканчивается ли эта строка указанным окончанием.
//        test8(); // boolean equalsIgnoreCase(String anotherString). Сравнивает данную строку с другой строкой,
//                 // игнорируя регистр букв.
//        test9(); // String intern(). Возвращает каноническое представление для строкового объекта.
//        test10(); // int length(). Возвращает длину строки.
//        test11(); // String substring(int beginIndex). Возвращает новую строку, которая является подстрокой данной строки.
//        test12(); // char[] toCharArray(). Преобразует эту строку в новый массив символов.
        test13(); // String trim(). Возвращает копию строки с пропущенными начальными и конечными пробелами.
    }

    static void test1() {
        String s = "Я учусь на тестировщика.";
        char result1 = s.charAt(8);
        char result2 = s.charAt(11);
        System.out.println("Восьмой символ строки - " + result1);
        System.out.println("Одиннадцатый символ строки - " + result2);
        System.out.println("Одиннадцатый символ строки - " + "1111".compareTo("2222"));
    }

    static void test2() {
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareTo(str2);
        System.out.println(result);

        result = str2.compareTo(str3);
        System.out.println(result);

        result = str3.compareTo(str1);
        System.out.println(result);
    }

    static void test3() {
        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я Буду Хорошим Программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareToIgnoreCase(str2);
        System.out.println(result);

        result = str2.compareToIgnoreCase(str3);
        System.out.println(result);

        result = str3.compareToIgnoreCase(str1);
        System.out.println(result);

    }


    static void test4() {
        String s = "Я стану программистом!";
        s = s.concat(" Очень хорошим программистом!");

        System.out.println(s);
    }


    static void test5() {
        String str1 = "Добро пожаловать на ProgLang.su";
        String str2 = "Сайт для изучения программирования";
        StringBuffer str3 = new StringBuffer("Добро пожаловать на ProgLang.su");
        StringBuffer str4 = new StringBuffer("Добро пожаловать");

        boolean result = str1.contentEquals(str3);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);

        result = str2.contentEquals(str3);
        System.out.println("Строка \"Сайт для изучения программирования\" равна строке буфера \"Добро пожаловать на ProgLang.su\"? \n" + result);

        result = str1.contentEquals(str4);
        System.out.println("Строка \"Добро пожаловать на ProgLang.su\" равна строке буфера \"Добро пожаловать\"? \n" + result);
    }

    static void test6() {
        char[] str1 = {'п', 'р', 'и', 'в', 'е', 'т', ' ', 'м', 'и', 'р'};
        String str2 = "";

        str2 = str2.copyValueOf(str1);
        System.out.println("Возвращаемая строка: " + str2);

        str2 = str2.copyValueOf(str1, 2, 6);
        System.out.println("Возвращаемая строка: " + str2);
    }

    static void test7() {
        String str = new String("Добро пожаловать на ProgLang.su");
        boolean retVal;

        retVal = str.endsWith("ProgLang.su");
        System.out.println("Возвращаемое значение: " + retVal);

        retVal = str.endsWith("ProgLang");
        System.out.println("Возвращаемое значение: " + retVal);
    }

    static void test8() {
        String str1 = "Добро пожаловать на ProgLang.su";
        String str2 = str1;
        String str3 = new String("Сайт для изучения программирования");
        String str4 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");
        boolean retVal;

        retVal = str1.equalsIgnoreCase(str2);
        System.out.println("Строка str1 равна строке str2? Ответ: " + retVal);

        retVal = str1.equalsIgnoreCase(str3);
        System.out.println("Строка str1 равна строке str3? Ответ: " + retVal);

        retVal = str1.equalsIgnoreCase(str4);
        System.out.println("Строка str1 равна строке str4? Ответ: " + retVal);
    }

    static void test9() {
        String str1 = new String("Добро пожаловать на ProgLang.su");
        String str2 = new String("ДОБРО ПОЖАЛОВАТЬ НА PROGLANG.SU");

        System.out.print("Каноническое представление str1: " );
        System.out.println(str1.intern());

        System.out.print("Каноническое представление str2: " );
        System.out.println(str2.intern());
    }

    static void test10() {
        String str1 = new String("Добро пожаловать на ProgLang.su");
        String str2 = new String("ProgLang.su");

        System.out.print("Длина строки \"Добро пожаловать на ProgLang.su\" - ");
        System.out.println(str1.length());

        System.out.print("Длина строки \"ProgLang.su\" - ");
        System.out.println(str2.length());
    }

    static void test11() {
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5));

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.substring(5, 15));
    }

    static void test12() {
        String Str = new String("Добро пожаловать на ProgLang.su");

        System.out.print("Возвращаемое значение: ");
        System.out.println(Str.toCharArray());
    }

    static void test13() {
        String str = new String("  Добро пожаловать на ProgLang.su  ");

        System.out.print("Возвращаемое значение: ");
        System.out.println("'" + str.trim() + "'");
    }
}
