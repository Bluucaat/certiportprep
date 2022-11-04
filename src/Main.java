public class Main {

    public static int leap_year(int year1, int year2) {
        int counter = 0;
        int i = year1;
        for (; i <= year2; i++)
            if (i % 4 == 0 && i % 100 != 0)
                counter++;


        return counter;


    }

    public static int lcd(int a, int b)
    {
        int r;
        do {
            r = a % b;
            a = b;
            b = r;

        }while(r!=0);
        return a;
        }

        public static boolean palindrom(int number)
        {
            int numbercopy = number;
            int reversed = 0;

            while(number !=0)
            {
                int szj = number % 10;
                number = number/10;
                reversed = reversed * 10 + szj;
            }

            return numbercopy == reversed;



        }



    public static void main(String[] args) {

        System.out.println("A szokoevek szama: " + leap_year(1900, 2022));
        System.out.println("A ket szam lnkoja: " + lcd(360,225));
        int number = 1221;
        System.out.println(palindrom(number)?  "the number " + number + " is a palindrom" : "Thr number " + number + " is not a palindrom");
        Hallgato h1= new Hallgato(1, "Deb ella", "wert12", 1.3, true);
        System.out.println(h1);

        QuadraticEquation q = new QuadraticEquation(4, -3, 5);
        System.out.println("x1 = " + q.getRoot1());
        System.out.println("x2 = " + q.getRoot2());

        Account.setAnnualIR((1.5));
        System.out.println(Account.getAnnualIR());

        Account customer1 = new Account(1, 100);
        Account customer2 = new Account(2, 200);
        System.out.println(customer1);


    }
}