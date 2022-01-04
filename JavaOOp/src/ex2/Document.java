package ex2;

import java.util.ArrayList;

public class Document implements IDocument {
    private int id;
    private String imprint;
    private int releasedNumber;

    public Document(int id, String imprint, int releasedNumber) {
        this.id = id;
        this.imprint = imprint;
        this.releasedNumber = releasedNumber;
    }

    public Document() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImprint() {
        return imprint;
    }

    public void setImprint(String imprint) {
        this.imprint = imprint;
    }

    public int getReleasedNumber() {
        return releasedNumber;
    }

    public void setReleasedNumber(int releasedNumber) {
        this.releasedNumber = releasedNumber;
    }

    @Override
    public void search(ArrayList<Document> list) {

    }
}
