
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money origMoney) {
        int newEuros = this.euros + origMoney.euros();
        int newCents = this.cents + origMoney.cents();
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }

    public boolean lessThan(Money compareMoney) {
        if (this.euros < compareMoney.euros) {
            return true;
        } else if (this.euros == compareMoney.euros()) {
            return this.cents < compareMoney.cents;
        }
        return false;
    }

    public Money minus(Money compareMoney) {
        if (this.lessThan(compareMoney)) {
            return new Money (0, 0);
        }
        int newEuros = this.euros - compareMoney.euros;
        int newCents = this.cents - compareMoney.cents;

        if (newCents < 0) {
            newEuros--;
            newCents = 100 - compareMoney.cents;
        }
        return new Money(newEuros, newCents);

    }


    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
