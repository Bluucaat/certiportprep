public class Csaszar {
    private int szulev;
    private String nev;

    public Csaszar(int szulev, String nev) {
        this.szulev = szulev;
        this.nev = nev;
    }

    public int getSzulev() {
        return szulev;
    }

    public void setSzulev(int szulev) {
        this.szulev = szulev;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    @Override
    public String toString() {
        return this.nev + " ("+this.szulev+")";
    }
}
