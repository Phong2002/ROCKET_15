package com.testing.backend;

import com.testing.entity.CPU;
import com.testing.entity.Car;

public class Exercise3 {
    public void question1(){
        CPU cpu = new CPU();
        CPU.Processor processor = cpu.new Processor();
        CPU.Ram ram = cpu.new Ram();
        System.out.println(processor.getCache());
        System.out.println(ram.getClockSpeed());
    }

    public void question2(){
        Car car = new Car("Mazda","8WD");
        Car.Engine engine = car.new Engine();
        engine.setEngineType("Crysler");

        System.out.println("Name :"+car.getName()+"\nType :"+car.getType()+"\nEngine type : "+engine.getEngineType());
    }
}
