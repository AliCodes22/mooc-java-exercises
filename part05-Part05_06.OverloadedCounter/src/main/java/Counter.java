public class Counter {
    private int number;

    public Counter(int startValue) {
        this.number = startValue;
    }

    public Counter() {
        this.number = 0;
    }

    public int value() {
        return this.number;
    }

    public void increase() {
        this.number += 1;
    }

    public void increase(int increaseBy) {
        if(increaseBy < 0) {
            return;
        }
        this.number += increaseBy;
    }


    public void decrease() {
        this.number -= 1;
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy < 0) {
            return;
        }

        this.number -= decreaseBy;
    }

}