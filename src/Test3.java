import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Csaszar[] csaszarok = new Csaszar[10];
        int index = 0;
        String nev;
        int szev;

        while((szev=sc.nextInt())!=0)
        {
            nev = sc.next();
            csaszarok[index++]= new Csaszar(szev, nev);

        }

        Csaszar min = csaszarok[0];

        for(int i=0; i<index;i++){
            if(csaszarok[i].getSzulev() < min.getSzulev()){
                min = csaszarok[i];
            }
        }

        System.out.println(min);



    }


}
