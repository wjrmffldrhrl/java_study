public class Singletone {
    private Singletone singletone;
    private int vol = 5;

    private Singletone() {}

    public static Singletone getinstance() {
        if(this.singletone == null) {
            this.singletone = new Singletone();
        }

        return this.singletone;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getVol() {
        return this.vol;
    }
}