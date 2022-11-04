public class Hallgato {

    private int evfolyam;
    private String nev;
    private String n_kod;
    private double atlag;
    private boolean nappali_jogviszony;


    public void koszones()
    {
        System.out.println("Szep napot!");
    }

    public Hallgato(int evfolyam, String nev, String n_kod, double atlag, boolean nappali_jogviszony) {
        this.evfolyam = evfolyam;
        this.nev = nev;
        this.n_kod = n_kod;
        this.atlag = atlag;
        this.nappali_jogviszony = nappali_jogviszony;
    }

    public String getN_kod() {
        return n_kod;
    }

    public void setN_kod(String n_kod) {
        this.n_kod = n_kod;
    }

    public boolean isNappali_jogviszony() {
        return nappali_jogviszony;
    }

    public void setNappali_jogviszony(boolean nappali_jogviszony) {
        this.nappali_jogviszony = nappali_jogviszony;
    }
}
