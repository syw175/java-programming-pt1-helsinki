
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

    public void advance(int howManyDays) {
        if (howManyDays <= (30-this.day)) {
            this.day+= howManyDays; }

        if (howManyDays > (30-this.day)) {
            this.month++;
            this.day = howManyDays-(30-this.day);
        }

        if (this.month == 13) {
            this.year++;
            this.month = 1;
        }
    }

    public void advance() {
        if (this.day < 30) {
            day++;
        } else if (this.day == 30) {
            this.day = 1;
            this.month++;
        }

        if (this.month == 13) {
            this.year++;
            this.month = 1;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        // do something..
        newDate.advance(days);
        return newDate;
    }
}
