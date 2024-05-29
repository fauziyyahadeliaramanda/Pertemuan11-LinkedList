import java.util.Scanner;
public class ScavengerHuntMain {
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Dimanakah letak Gunung Semeru?", "Lumajang");
        game.addPoint("Berpakah hasil 8 x 7", "56");
        game.addPoint("Apa bahasa inggris buah?", "Fruit");
        

        game.startHunt();
    }
}