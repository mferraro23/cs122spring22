package assignments.assignment2.Speaker;

public class VoiceDriver {
    public static void main(String[] args) {
        Voice munchkin = new Cat("nox", "I like treats.");
        Voice gamer = new Human("michael", "Elden Ring sucks.");

        munchkin.speak();
        gamer.speak();
    }
}
