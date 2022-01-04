package ex12;


    public class Car extends Vehicle
    {
        private int numOfSeat;
        private String engineType;

        public Car()
        {
        }

        public Car(String id, String manufacturer, int manufactureYear, double price, String color, int numOfSeat, String engineType) {
            super(id, manufacturer, manufactureYear, price, color);
            this.numOfSeat = numOfSeat;
            this.engineType = engineType;
        }

        public int getNumOfSeat() {
            return numOfSeat;
        }

        public void setNumOfSeat(int numOfSeat) {
            this.numOfSeat = numOfSeat;
        }

        public String getEngineType() {
            return engineType;
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

