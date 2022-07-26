package project_oop;

public abstract class Tunjangan extends Gapok {
    private int tunjangan;

    public Tunjangan(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(int tunjangan) {
        this.tunjangan = tunjangan;
    }
    public abstract void showTunjangan();
}
