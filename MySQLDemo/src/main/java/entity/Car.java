package entity;

import javax.persistence.*;

@Entity
@PrimaryKeyJoinColumn(name = "vid")
    public class Car extends Vehicle
    {
        private int numOfSeat;
        private String engineType;

        public Car()
        {
        }

        public Car(int id, String manufacturer, int manufactureYear, double price, String color, int numOfSeat, String engineType) {
            super(id, manufacturer, manufactureYear, price, color);
            this.numOfSeat = numOfSeat;
            this.engineType = engineType;
        }

        public int getNumOfSeat() {
            return this.numOfSeat;
        }

        public void setNumOfSeat(int numOfSeat1) {
            this.numOfSeat = numOfSeat1;
        }

        public String getEngineType() {
            return this.engineType;
        }

        public void setEngineType(String engineType) {
            this.engineType = engineType;
        }

        @Override
        public String toString() {
            return super.toString()+"Car{" +
                    "numOfSeat=" + numOfSeat +
                    ", engineType='" + engineType + '\'' +
                    '}';
        }
    }

