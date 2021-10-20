package question1;

public class Psychiatrist {
    public Moody mood;

    public Psychiatrist(Moody mood) {
        this.mood = mood;
    }

    public void examine() {
        System.out.println("How are you feeling today?");
        mood.queryMood();
    }

    public void observe() {
        mood.expressFeelings();
        System.out.println("Observation: " + mood.toString());
    }

    public String toString(){
        return mood.toString();
    }

    public static void main(String[] args) {
        Psychiatrist patient1 = new Psychiatrist(new Happy());
        Psychiatrist patient2 = new Psychiatrist(new Sad());
        patient1.examine();
        System.out.println(" ");
        patient1.observe();
        System.out.println(" ");
        patient2.examine();
        System.out.println(" ");
        patient2.observe();
    }
}
