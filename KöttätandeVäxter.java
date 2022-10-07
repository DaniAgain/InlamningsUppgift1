package Sprint1.Inlämningsuppgift1;
// arv och implementering av interface
public class KöttätandeVäxter extends Växt implements Interface{

    @Override
    public String vätskeTyp() {
        return "proteindryck";
    }

    public double vätskeIntag() {
        super.setLängd(0.7);
        super.setdagligtVätskeintag(0.1 + (0.2 * getLängd()));
        return getdagligtVätskeintag();
    }

}