package ex7;

    public class Teacher extends Human{
        private double salary;
        private double bonus;
        private double penaty;
        private double realSalary;

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        public double getPenaty() {
            return penaty;
        }

        public void setPenaty(double penaty) {
            this.penaty = penaty;
        }

        public double getRealSalary() {
            return realSalary;
        }

        public void setRealSalary(double realSalary) {
            this.realSalary = realSalary;
        }

        public Teacher() {
        }

        public Teacher(double salary, double bonus, double penaty, double realSalary) {
            this.salary = salary;
            this.bonus = bonus;
            this.penaty = penaty;
            this.realSalary = realSalary;
        }

        public Teacher(String name, int age, String hometown, String id, double salary, double bonus, double penaty, double realSalary) {
            super(name, age, hometown, id);
            this.salary = salary;
            this.bonus = bonus;
            this.penaty = penaty;
            this.realSalary = realSalary;
        }
    }


