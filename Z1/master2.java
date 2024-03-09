public class master2 {
    public static void main(String[] args){
        final String NAME = "Mateusz";
        int age = 18;

        age = 23;

        //NAME = "Mati";

        System.err.println(NAME + age);

        // -------------------------------------

        // Typy proste
        int intiger_value = 12;
        double double_value = 3.14;
        boolean boolean_value = true;
        char char_value = 'A';

        // Typy referencyjne
        String value_from_outside_API = "123";
        String text = "Hello, wordl!";
        Integer intiger_value_1 = Integer.valueOf(2);
        Double double_value_1 = Double.valueOf(3);
        Boolean boolean_value_1 = Boolean.valueOf(false);

        Integer parsed_value = Integer.parseInt(value_from_outside_API);

        //----------- FUNKCJE --------------

        int x = add(2, 3);
        System.out.println(x);
        System.out.println(add(5,2));
    }

    // -----------------------------------

    static int add(int a, int b){
        int sum = a + b;
        return sum;
    }
}
