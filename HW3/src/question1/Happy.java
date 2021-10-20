package question1;

public class Happy extends Moody{

    @Override
    public String getMood() {
        return "happy";
    }

    @Override
    public void expressFeelings() {
        System.out.println("heeehee....hahahah...HAHAHA!!");
    }

    @Override
    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }

    public String toString(){
        return "Subject laughs a lot";
    }
}
