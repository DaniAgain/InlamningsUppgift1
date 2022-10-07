package Sprint1.Inlämningsuppgift1;
// arv och implementering av interface
public class Kaktusar extends Växt implements Interface{

    @Override
    public String vätskeTyp() {
        return "mineralvatten";
    }

    public double vätskeIntag() {
        super.setdagligtVätskeintag(0.02);
        return getdagligtVätskeintag();
    }

    public double dagligtVätskeintagIgge(){
        super.setdagligtVätskeintag(0.02);
        return getdagligtVätskeintag();
    }

}