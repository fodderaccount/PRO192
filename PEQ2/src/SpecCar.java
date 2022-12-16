public class SpecCar extends Car {
    private int type;

    public SpecCar() {
        
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setData(){
        this.maker="XZ"+maker;
        this.price=price+20;

    }
    public int getValue(){
        if(this.price<7){
            int inc=10;
            return price+inc;

        }else{
            int inc=15;
            return price+inc;
        }
    }


    public String toString() {
        return getMaker()+ ", " +getPrice()+", "+getType();
  
}

}
