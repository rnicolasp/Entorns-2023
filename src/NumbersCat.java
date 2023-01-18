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

        switch ((int) n) {
            case 10:
                return "Deu";
            case 20:
                return "Vint";
            case 30:
                return "Trenta";
            case 40:
                return "Quaranta";
            case 50:
                return "Cinquanta";
            case 60:
                return "Seixanta";
            case 70:
                return "Setanta";
            case 80:
                return "Vuitanta";
            case 90:
                return "Noranta";
        }

        int unidad = 0;
        int decena = 0;
        if (n > 20 && n < 100) {
            unidad = (int) n % 10;
            decena = 10 * ((int) n / 10);
            if (n < 30) {
                return say(decena) + "-i-" + say(unidad).toLowerCase();
            }
            return say(decena) + "-" + say(unidad).toLowerCase();
        }


        if (n >= 100) {
            int centena = (int) (n / 100);
            int resto = (int) (n % 100);
            String nombreString = "";

            if (centena == 1) {
                nombreString = "Cent";
            } else {
                nombreString = say(centena) + "-cents";
            }
            String espai = "";
            if (resto != 0) {
                espai = " ";
                nombreString += espai + say(resto).toLowerCase();
            }
            return nombreString;
        }
        return null;
    }
}
