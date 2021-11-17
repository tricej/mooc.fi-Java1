
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }
    public void advance() {
        if (this.month == 12 && this.day == 30) {
            this.year++;
            this.month = 1;
            this.day = 1;
        } else if (this.day == 30) {
            this.month++;
            this.day = 1;
        } else {
            this.day++;
        }
    }

    public void advance(int days) {
        for (int i = 0; i < days; i++) {
            if (this.month == 12 && this.day == 30) {
                this.year++;
                this.month = 1;
                this.day = 1;
            } else if (this.day == 30) {
                this.month++;
                this.day = 1;
            } else {
                this.day++;
            }
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        for (int i = 0; i < days; i++) {
            if (newDate.month == 12 && newDate.day == 30) {
                newDate.year++;
                newDate.month = 1;
                newDate.day = 1;
            } else if (newDate.day == 30) {
                newDate.month++;
                newDate.day = 1;
            } else {
                newDate.day++;
            }
        }
        return newDate;
    }

}
