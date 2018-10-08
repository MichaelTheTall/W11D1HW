public class Printer {
    private int toner;
    private int paper;

    public Printer() {
        this.toner = 1000;
        this.paper = 500;
    }
    public int getPaper() {
        return paper;
    }

    public void setPaper(int paper) {
        this.paper = paper;
    }
    public int getToner() {
        return toner;
    }

    public void setToner(int toner) {
        this.toner = toner;
    }


    public String print(int pages, int copies) {
        int total = pages * copies;
        if (total > this.paper) {
            return "The printer does not have enough paper!";
        } else if (total > this.toner) {
            return "The printer does not have enough ink!";
        } else {
            this.paper -= total;
            this.toner -= total;
            return "Print Sucessful!";
        }
    }

    public void refillPaper() {
        this.paper = 500;
    }

    public void refillToner() {
        this.toner = 1000;
    }
}
