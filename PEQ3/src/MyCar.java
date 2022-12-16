import java.util.Collections;
import java.util.List;


public class MyCar implements ICar {

    @Override
    public int f1(List<Car> t) {
        // TODO Auto-generated method stub
        int avgrate = 0;
        for (Car car : t) {
            avgrate += car.rate;

        }
        avgrate = (int) (avgrate / t.size());
        return avgrate;
    }

    @Override
    public void f2(List<Car> t) {
        
        int minp=0;
        Car min = t.get(0);
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() < min.getRate()) {
                min= t.get(i);
                minp=i;
            }


        }
        int maxp=0;
        Car max = t.get(0);
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() > max.getRate()) {
                max= t.get(i);
                maxp=i;
            }
            

        }
        Collections.swap(t, minp, maxp);
        
for (Car car : t) {
    System.out.print(car.toString());
}
        
       
    }
    



    @Override
    public void f3(List<Car> t) {
        // TODO Auto-generated method stub
        Car tempcar= new Car();
        for (int i = 0; i < t.size(); i++) {
            for (int j = i + 1; j < t.size(); j++) {

                // to compare one string with other strings
                if (t.get(i).getMaker().compareTo(t.get(j).getMaker()) > 0) {
                    // swapping
                    tempcar.setMaker(t.get(i).getMaker());
                    tempcar.setRate(t.get(i).getRate());

                    t.get(i).setMaker(t.get(j).getMaker());
                    t.get(i).setRate(t.get(j).getRate());

                    t.get(j).setMaker(tempcar.getMaker());
                    t.get(j).setRate(tempcar.getRate());
                }
            }

        }
        for (int i = 0; i < t.size(); i++) {
            for (int j = i + 1; j < t.size(); j++) {

                // to compare one string with other strings
                if (t.get(i).getMaker() == t.get(j).getMaker() && t.get(i).getRate() < t.get(j).getRate()) {
                    // swapping
                    tempcar.setMaker(t.get(i).getMaker());
                    tempcar.setRate(t.get(i).getRate());

                    t.get(i).setMaker(t.get(j).getMaker());
                    t.get(i).setRate(t.get(j).getRate());

                    t.get(j).setMaker(tempcar.getMaker());
                    t.get(j).setRate(tempcar.getRate());
                }
            }

        }
    }
}