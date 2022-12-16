public class Car {
    String maker;
     int rate;

    public Car() {
    }

    public Car(String maker, int rate) {
        this.maker = maker;
        this.rate = rate;
    }

    public String getMaker() {
        return this.maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getRate() {
        return this.rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "("+ getMaker()+", "+getRate()+")";
    }
    


}
