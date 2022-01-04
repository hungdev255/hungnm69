package ex2;

import java.util.ArrayList;

public class Magazine extends Document {
    private int issueNumber;
    private int releasedMonth;

    public Magazine(int id, String imprint, int releasedNumber, int issueNumber, int releasedMonth) {
        super(id, imprint, releasedNumber);
        this.issueNumber = issueNumber;
        this.releasedMonth = releasedMonth;
    }

    public Magazine() {
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleasedMonth() {
        return releasedMonth;
    }

    public void setReleasedMonth(int releasedMonth) {
        this.releasedMonth = releasedMonth;
    }

    public String toString() {
        return "Magazine{" + "issueNumber=" + issueNumber + ", releasedMonth=" + releasedMonth + ", id='" + super.getId() + '\'' + ", getImprint='" + super.getImprint() + '\'' + ", numberRelease='" + super.getReleasedNumber() + '\'' + '}';
    }

    @Override
    public void search(ArrayList<Document> list) {
        list.stream().filter(doc -> doc instanceof Magazine).forEach(System.out::println);
    }
}
