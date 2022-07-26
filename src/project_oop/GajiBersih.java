package project_oop;

public abstract class GajiBersih extends Potongan {

    private int gaber;
    public GajiBersih(String nama, char golongan, String status) {
        super(nama, golongan, status);
    }

    public int getGaber() {
        return gaber;
    }

    public void setGaber(int gaber) {
        this.gaber = gaber;
    }
    public abstract void showGaber();

}
