package OOP;

class encap {
    /*
     * Encapsulation means wrapping the data and methods together in a single class
     * unit and ensuring controlled data access...
     * --> We don't want eveyone to accesss all the information then in that case we
     * use access modifiers like private, protected, public, default....
     */

    private int m;
    private int n;
    private String str;

    public encap(int m, int n, String s) {
        this.m = m;
        this.n = n;
        this.str = s;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getM() {
        return this.m;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

}

public class Encapsulation {

}
