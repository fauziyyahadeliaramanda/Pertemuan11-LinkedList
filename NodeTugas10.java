public class NodeTugas10 {
    String pertanyaan;
    String jawaban;
    NodeTugas10 next;

    NodeTugas10(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.next = null;
    }
}