package com.eu.training.practice.loop;


import com.eu.training.practice.PracticeJavaApplication;

public class LoopTesting {
    public void forTesting (){
        PracticeJavaApplication.sayHello();

        String []cars = {"Volvo", "BWM", "Ford", "Mazda"};
        for(String car: cars){
            System.out.println(car);
        }
    }


}
