package project_oop;

public abstract class Potongan extends Tunjangan {
    private float potongan;

    public Potongan(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    public float getPotongan() {
        return potongan;
    }

    public void setPotongan(float potongan) {
        this.potongan = potongan;
    }
    public abstract void showPotongan();
}
