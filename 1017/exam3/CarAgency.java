package org.study.run.exam3;

public class CarAgency implements Rentable<Car>{
    @Override
   public Car rent() {
        return new Car();
    }
}
