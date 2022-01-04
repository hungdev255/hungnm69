package ex2;

import java.util.ArrayList;


public class Newspaper extends Document {
    private String releasedDay;

    public Newspaper(int id, String imprint, int releasedNumber, String releasedDay) {
        super(id, imprint, releasedNumber);
        this.releasedDay = releasedDay;
    }

    public String getReleasedDay() {
        return releasedDay;
    }

    public void setReleasedDay(String releasedDay) {
        this.releasedDay = releasedDay;
    }

    public Newspaper() {
    }

    @Override
    public String toString() {
        return "Newspaper{" + "releasedDay=" + releasedDay + ", id='" + super.getId() + '\'' + ", getImprint='" + super.getImprint() + '\'' + ", numberRelease='" + super.getReleasedNumber() + '\'' + '}';
    }

    @Override
    public void search(ArrayList<Document> list) {
        list.stream().filter(doc -> doc instanceof Newspaper).forEach(System.out::println);
    }
}
