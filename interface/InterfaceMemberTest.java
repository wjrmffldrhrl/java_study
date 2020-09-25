public class InterfaceMemberTest {
    public static void main(String[] args) {
        SentenceImpl sentence = new SentenceImpl();

        System.out.println(sentence.getStart());

    }
}

interface Sentence {
    int start = 1;
    int end = 0;
    String data = "";

    int getStart();
    int getEnd();
    String getData();
}

class SentenceImpl implements Sentence {

    SentenceImpl() {
        this.start = 4;
    }


    @Override
    public int getStart() {
        return this.start;
    }

    @Override
    public int getEnd() {
        return 0;
    }

    @Override
    public String getData() {
        return null;
    }
}