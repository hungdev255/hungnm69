package ex2;

import java.util.ArrayList;

public class Book extends Document {
    private String athourName;
    private int numberOfPage;

    public Book(int id, String imprint, int releasedNumber, String athourName, int numberOfPage) {
        super(id, imprint, releasedNumber);
        this.athourName = athourName;
        this.numberOfPage = numberOfPage;
    }

    public Book() {
    }

    public String getAthourName() {
        return athourName;
    }

    public void setAthourName(String athourName) {
        this.athourName = athourName;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    @Override
    public void search(ArrayList<Document> list) {
        list.stream().filter(doc -> doc instanceof Book).forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Book{" + "athourName=" + athourName + ", numberOfPage=" + numberOfPage + ", id='" + super.getId() + '\'' + ", getImprint='" + super.getImprint() + '\'' + ", numberRelease='" + super.getReleasedNumber() + '\'' + '}';
    }
}
