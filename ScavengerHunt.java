import java.util.Scanner;

public class ScavengerHunt {
    NodeTugas10 head;
    NodeTugas10 tail;

    public ScavengerHunt() {
        this.head = null;
        this.tail = null;
    }
    public void addPoint(String pertanyaan, String jawaban) {
        NodeTugas10 newNode = new NodeTugas10(pertanyaan, jawaban);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void startHunt() {
        Scanner scanner = new Scanner(System.in);
        NodeTugas10 current = head;
        while (current != null) {
            System.out.println(current.pertanyaan);
            String userJawaban = scanner.nextLine();
            if (userJawaban.equalsIgnoreCase(current.jawaban)) {
                System.out.println("Benar! Silahkan lanjut ke pertanyaan selanjutnya.");
                current = current.next;
                if (current == null) {
                    System.out.println("Selamat! Kamu telah menemukan Treasure!");
                }
            } else {
                System.out.println("Jawabanmu salah. Ayo coba lagi.");
            }
        }
        scanner.close();
    }
}