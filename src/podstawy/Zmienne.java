package podstawy;

public class Zmienne {
    public static void main(String[] args) {

        int liczba1;

        liczba1 = 123;

        double liczba2 = 23.7;
        System.out.println(liczba1 +" "+
                liczba2+ " jakiś napis");


        int days, hours, weeks;
        days = 5;
        hours = 8;
        weeks = 52;

        int workHoursPerDay = days * hours * weeks;

        System.out.println(workHoursPerDay);

        String text = "Jest\tbrzydka \"pogoda\"";

        System.out.println("Mój napis: "+ text);
        System.out.print("Mój napis: "+ text + "\n");
        System.out.print("Mój napis: "+ text +"\n");

        char znak = '#';

        boolean sun = false; //true

    }
}
