package labs.lab2.Company;

public class CompanyET extends Company {
    String nameOwner;
        double startCapital;
        double actualCapital;

        public CompanyET(String name, String date, String bullstat, String nameOwner, double startCapital,
                double actualCapital) {
            super(name, date, bullstat);
            this.nameOwner = nameOwner;
            this.startCapital = startCapital;
            this.actualCapital = actualCapital;
        }

        public String getNameOwner() {
            return nameOwner;
        }

        public void setNameOwner(String nameOwner) {
            this.nameOwner = nameOwner;
        }

        public double getStartCapital() {
            return startCapital;
        }

        public void setStartCapital(double startCapital) {
            this.startCapital = startCapital;
        }

        public double getActualCapital() {
            return actualCapital;
        }

        public void setActualCapital(double actualCapital) {
            this.actualCapital = actualCapital;
        }

        public double calculateProfit() {
            return getActualCapital() - getStartCapital();
        }
}
