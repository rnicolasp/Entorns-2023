public class NumbersCat {

    public static String say(long n) {
        if (n < 0) {
            return "Menys " + say(-n).toLowerCase();
        }
        switch ((int) n) {
            case 0:
                return "Zero";
            case 1:
                return "Un";
            case 2:
                return "Dos";
            case 3:
                return "Tres";
            case 4:
                return "Quatre";
            case 5:
                return "Cinc";
            case 6:
                return "Sis";
            case 7:
                return "Set";
            case 8:
                return "Vuit";
            case 9:
                return "Nou";
        }
        
        switch ((int) n){
            case 30:
                return "Trenta";
        }

        int unidad = 0;
        int decena = 0;
        if( n > 30){
            unidad = (int)n % 10;
            decena = (int)n / 10;
            say(decena);
            return say(decena) + "-" + say(unidad).toLowerCase();
        }
        return null;
    }
}
