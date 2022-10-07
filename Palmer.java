package Sprint1.Inlämningsuppgift1;
// arv och implementering av interface
public class Palmer extends Växt implements Interface{

    @Override
    public String vätskeTyp() {
        return "kranvatten";
    }

    public double vätskeIntag() {
        super.setLängd(5);
        super.setdagligtVätskeintag(0.5 * getLängd());
        return getdagligtVätskeintag();
    }

    public double dagligtVätskeintagLaura(){
        super.setLängd(5);
        super.setdagligtVätskeintag(0.5 * getLängd());
        return getdagligtVätskeintag();
    }

    public double dagligtVätskeintagPutte(){
        super.setLängd(1);
        super.setdagligtVätskeintag(0.5 * getLängd());
        return getdagligtVätskeintag();
    }

}