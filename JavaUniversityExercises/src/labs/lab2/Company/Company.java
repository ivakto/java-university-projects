package labs.lab2.Company;

public class Company {
    private String name;
        private String date;
        private String bullstat;

        public Company(String name, String date, String bullstat) {
            setName(name);
            this.date = date;
            setBullstat(bullstat);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name == null) {
                System.out.println("Error!");
                name = "";
                
            } else {
                this.name = name;
            }
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getBullstat() {
            return bullstat;
        }

        public void setBullstat(String bullstat) {

            if (bullstat.length() == 10) {
                this.bullstat = bullstat;
            } else {
                System.out.println("Error!");
            }

        }
}
