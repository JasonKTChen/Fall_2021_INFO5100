package question1;

public class Sad extends Moody{

    @Override
    public String getMood() {
        return "sad";
    }

    @Override
    public void expressFeelings() {
        System.out.println("waah boo hoo weep sob");
    }

    @Override
    public void queryMood() {
        System.out.println("I feel " + this.getMood() + " today!!");
    }

    public String toString(){
        return "Subject cries a lot";
    }
}
